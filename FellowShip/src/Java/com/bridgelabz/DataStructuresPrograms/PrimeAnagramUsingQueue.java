package com.bridgelabz.DataStructuresPrograms;
import com.bridgelabz.Utility.*;
import com.bridgelabz.DataStructure.*;
public class PrimeAnagramUsingQueue {
	public static void main(String[] args) {
		int start = 0;
		int end = 1000;
		Queue<Integer> queue = new Queue<Integer>();
		// putting values in array

		for (int j = start; j <= end; j++) {
			if (Utility.isPrime(j)) {
				for (int k = j + 1; k < end; k++) {
					if (Utility.isPrime(k)) {
						if (Utility.isAnagram(String.valueOf(j), String.valueOf(k))) {
							queue.enQueue(j);
							queue.enQueue(k);

						}
					}
				}

			}

		}

		int tempSize = queue.getSize();
		for (int i = 0; i < tempSize; i++) {
			//System.out.print(queue.get(i) + " ");
		}

	}


}
