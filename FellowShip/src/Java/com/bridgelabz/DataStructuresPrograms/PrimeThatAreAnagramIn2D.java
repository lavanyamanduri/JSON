package com.bridgelabz.DataStructuresPrograms;
/******************************************************************************
 *  Purpose: Program is written for Prime that are Anagram printing in 2D Array .
 *  		 
 *
 *  @author  Manduri Lavanya<lavanya.manduri@gmail.com>
 *  @version 1.0
 *  @since   23-12-2019
 *
 ******************************************************************************/
import com.bridgelabz.Utility.*;

public class PrimeThatAreAnagramIn2D {
	public static void main(String[] args) {
		int start = 0;
		int end = 100;

		int[][] primeAnagramNumber = new int[10][];

		int j1 = 0, j2 = 0;
		// declaration of array is done
		for (int i = 0; i < 10; i++) {
			for (int j = start; j <= end; j++) {
				if (DataStructuresUtility.isPrime(j)) {
					for (int k = j + 1; k < end; k++) {
						if (DataStructuresUtility.isPrime(k)) {
							if (DataStructuresUtility.isAnagram(String.valueOf(j), String.valueOf(k))) {
								j1 += 2;
							}
						}
					}

				}
			}
			primeAnagramNumber[i] = new int[j1];
			start = end + 1;
			end += 100;
			j1 = 0;

		}
		start = 0;
		end = 100;
		j1 = 0;
		// putting values in array
		for (int i = 0; i < 10; i++) {
			for (int j = start; j <= end; j++) {
				if (DataStructuresUtility.isPrime(j)) {
					for (int k = j + 1; k < end; k++) {
						if (DataStructuresUtility.isPrime(k)) {
							if (DataStructuresUtility.isAnagram(String.valueOf(j), String.valueOf(k))) {
								primeAnagramNumber[i][j2] = j;
								primeAnagramNumber[i][j2 + 1] = k;
								j2 += 2;
							}
						}
					}

				}
			}
			start = end + 1;
			end += 100;
			j2 = 0;
		}

		// printing array
		for (int i = 0; i < primeAnagramNumber.length; i++) {
			for (int j = 0; j < primeAnagramNumber[i].length; j++) {
				System.out.print(primeAnagramNumber[i][j] + " ");

			}
			if (primeAnagramNumber[i].length != 0)
				System.out.println();

		}

	}
}
