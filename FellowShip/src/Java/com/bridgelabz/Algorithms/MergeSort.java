package com.bridgelabz.Algorithms;
/*****************************************************************************
 *  Purpose: Program is written for Merge Sort .
 *  		 
 *
 *  @author  Manduri Lavanya<lavany.manduri@gmail.com>
 *  @version 1.0
 *  @since   18-12-2019
 *******************************************************************************/
import com.bridgelabz.Utility.Utility;

public class MergeSort {
	 public static void main(String args[]) 
	    { 
	        int arr[] = {12, 11, 13, 5, 6, 7}; 
	        int l=0,r=arr.length-1;
	        int m=r/2;
	        System.out.println("given array");
	        for (int i=0;i<arr.length;i++)
	        {
	        	System.out.print(arr[i]+" ");
	        }
	        Utility.merge(arr, l, m, r);
	  System.out.println( );
	        System.out.println("sorted array"); 
	        Utility.printArray(arr); 
	    } 
}
