package com.bridgelabz.DataStructuresPrograms;
/******************************************************************************
 *  Purpose: Program is written for Banking Cash Counter .
 *  		 
 *
 *  @author  Manduri Lavanya<lavanya.manduri@gmail.com>
 *  @version 1.0
 *  @since   23-12-2019
 *
 ******************************************************************************/
import com.bridgelabz.Utility.*;
import com.bridgelabz.DataStructure.Queue;

public class BankingCashCounter {
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		System.out.println("Enter people size");
		int people = Utility.readInt();

		System.out.println("Hi! Welcome to bank simulation: ");
		for (int i = 0; i < people; i++) {

			queue.enQueue(i);
			queue.service();
			queue.deQueue();
		}
		if (queue.isEmpty()) {
			System.out.println("Queue is empty");
		}
		System.out.println("Bank Closing balance is : " + queue.bankBalance);
		scanner.close();
	}
}
