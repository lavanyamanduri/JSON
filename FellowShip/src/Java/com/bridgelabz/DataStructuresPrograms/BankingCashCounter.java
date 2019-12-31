package com.bridgelabz.DataStructuresPrograms;
/******************************************************************************
 *  Purpose: Program is written for Banking Cash Counter .
 *  		 
 *
 *  @author  Manduri Lavanya<>
 *  @version 1.0
 *  @since   23-12-2020
 *
 ******************************************************************************/
import java.util.Scanner;

import com.bridgelabz.DataStructure.Queue;

public class BankingCashCounter {
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		System.out.println("Enter people size");
		Scanner scanner = new Scanner(System.in);
		int people = scanner.nextInt();

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
