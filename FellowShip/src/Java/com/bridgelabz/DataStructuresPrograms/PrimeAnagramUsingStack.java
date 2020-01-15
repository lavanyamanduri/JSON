package com.bridgelabz.DataStructuresPrograms;
/******************************************************************************
 *  Purpose: Program is written for Prime and Anagram USing Stack .
 *  		 
 *
 *  @author  Manduri Lavanya<lavanya.manduri@gmail.com>
 *  @version 1.0
 *  @since   25-12-2019
 *
 ******************************************************************************/
import com.bridgelabz.Utility.*;
import com.bridgelabz.DataStructure.*;
public class PrimeAnagramUsingStack {
	public static void main(String[] args) {
		int start = 1;
		int end = 1000;

		Stack<Integer> stack = new Stack<Integer>();

		// putting values in array

		for (int j = start; j <= end; j++) {
			if (Utility.isPrime(j)) {
				for (int k = j + 1; k < end; k++) {
					if (Utility.isPrime(k)) {
						if (Utility.isAnagram(String.valueOf(j), String.valueOf(k))) {
							stack.push(j);
							stack.push(k);
							

						}
					}
				}

			}

		}
		 stack.show();

		int tempSize = stack.size();
		for (int i = 0; i < tempSize; i++) {
			System.out.print(stack.peek() + " ");
			if (!stack.isEmpty()) {
				stack.pop();
			}
		}

	}

}
