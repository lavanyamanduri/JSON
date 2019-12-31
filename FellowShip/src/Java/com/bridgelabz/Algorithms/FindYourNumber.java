package com.bridgelabz.Algorithms;
/******************************************************************************
 *  Purpose: Program is written for Find Your Number .
 *  		 
 *
 *  @author  Manduri Lavanya<>
 *  @version 1.0
 *  @since   19-12-2020
 *
 ******************************************************************************/
import com.bridgelabz.Utility.Utility;
public class FindYourNumber {
	public static void main(String[] args) {
		
int[] arr=new int[64];
		for (int i=0;i<64;i++)
{
	arr[i]=i;
}
		Utility.fyn(arr);
	}
}
