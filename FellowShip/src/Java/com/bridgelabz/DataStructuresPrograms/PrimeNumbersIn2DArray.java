package com.bridgelabz.DataStructuresPrograms;
/******************************************************************************
 *  Purpose: Program is written for Prime Numbers In 2D Array .
 *  		 
 *
 *  @author  Manduri Lavanya<lavanya.manduri@gmail.com>
 *  @version 1.0
 *  @since   22-12-2019
 *
 ******************************************************************************/
import com.bridgelabz.Utility.*;
public class PrimeNumbersIn2DArray {
	public static void main(String[] args) {
		int start = 0;
		int end = 100;

		int[][] primeNumber = new int[10][];

		int j1 = 0, j2 = 0;
		// declaration of array is done
		for (int i = 0; i < 10; i++) {
			for (int j = start; j <= end; j++) {
				if (DataStructuresUtility.isPrime(j)) {
				}
			}
			System.out.println(j1);
		primeNumber[i] = new int[j1];
			
			start = end + 1;
			end += 100;
			j1 = 0;

		}
		start = 0;
		end = 100;
		// putting values in array
		for (int i = 0; i < 10; i++) {
			for (int j = start; j <= end; j++) {

				if (DataStructuresUtility.isPrime(j)) {
					primeNumber[i][j2] = j;
					j2++;
				}

			}
			start = end + 1;
			end += 100;
			j2 = 0;
		}

		// printing array
		for (int i = 0; i < primeNumber.length; i++) {
			for (int j = 0; j < primeNumber[i].length; j++)
				System.out.print(primeNumber[i][j] + " ");
			System.out.println();
		}

	}

}
