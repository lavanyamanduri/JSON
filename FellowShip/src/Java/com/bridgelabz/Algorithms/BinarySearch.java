package com.bridgelabz.Algorithms;
/******************************************************************************
 *  Purpose: Program is written for Binary Search .
 *  		 
 *
 *  @author  Manduri Lavanya<lavanya.manduri@gmail.com>
 *  @version 1.0
 *  @since   18-12-2019
 *
 ******************************************************************************/
import com.bridgelabz.Utility.Utility;

public class BinarySearch {
	public static void main(String[] args) {
		int n=Utility.readInt();
		String arr[]=new String[n];
		System.out.println("enter the string");
		for(int i=0;i<n;i++)
		{
		   arr[i]=Utility.readString();
		System.out.println("enter the word to search");
		String x=Utility.readString();
		int result = Utility.binarySearch(arr, x); 
		  
	    if (result == -1) 
	        System.out.println("Element not present"); 
	    else
	        System.out.println("Element found at "
	                          + "index " + result); 
		}}
}
