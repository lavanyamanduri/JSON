package com.bridgelabz.DataStructure;
/******************************************************************************
 *  Purpose: Program is written for Queue Implemented Using LinkedList ( Reusability of Code ) .
 *  		 
 *
 *  @author  Manduri Lavanya<lavanya.manduri@gmail.com>
 *  @version 1.0
 *  @since   23-12-2019
 *
 ******************************************************************************/
import com.bridgelabz.DataStructure.LinkedList;
import java.util.List;
import com.bridgelabz.Utility.*;
import java.util.Scanner;

public class QueueImplementedUsingLinkedList<T> {
		LinkedList<T> queue = new LinkedList<T>();
		int index = 0;
		public int bankBalance = 500000;
		
		int counter = 1;

		/**
		 * Purpose: method for getting the size of queue
		 * 
		 * @return returns the size
		 */
		public int size() {
			return index;
		}

		/**
		 * Purpose: method for enqueue the element
		 * 
		 * @param data getting the data from user
		 */
		public void enQueue(T data) {
			queue.add(data);
			index++;
		}

		public void enQueueAll(List<T> list) {
			for (int i = 0; i < list.size(); i++) {
				enQueue(list.get(i));
			}
		}

		/**
		 * Purpose: method for dequeue the element
		 */
		public void deQueue() {
			index--;
			queue.deleteAt(index);
		}

		/**
		 * Purpose: method for printing queue
		 */
		public void show() {
			queue.show();
		}

		/**
		 * Purpose: method for printing queue without spaces
		 */
		public String showQueueWithoutSpace() {
			return queue.showListWithoutSpaces();
		}

		/**
		 * Purpose: checking wether queue is empty or not
		 * 
		 * @return returns the true if empty else false
		 */
		public boolean isEmpty() {
			return queue.isEmpty();
		}

		/**
		 * Purpose: getting the value of last index
		 * 
		 * @return returns the value
		 */
		public T get() {
			return queue.get(index);
		}

		/**
		 * Purpose: getting the value of particular index
		 * 
		 * @param ind index value provided by user
		 * @return returns the value
		 */
		public T get(int ind) {
			return queue.get(ind);
		}

		/**
		 * Purpose: method for serving people who are in queue
		 */
		public void service() {

			System.out.println("Token number is : " + counter);

			int choice;
			int amount = 0;
			System.out.println("press 1: for withdraw\npress 2: for deposit");
			choice = Utility.readInt();

			switch (choice) {
			case 1:
				System.out.println("Enter amount to withdraw");
				amount = Utility.readInt();
				bankBalance = bankBalance - amount;
				System.out.println("Thank you for using service");
				amount = 0;
				break;
			case 2:
				System.out.println("Enter amount to deposit");
				amount = Utility.readInt();
				bankBalance = bankBalance + amount;
				System.out.println("Thank you for using service");
				amount = 0;
				break;
			default:
				System.out.println("Enter valid option");
			}
			counter++;

		}

}
