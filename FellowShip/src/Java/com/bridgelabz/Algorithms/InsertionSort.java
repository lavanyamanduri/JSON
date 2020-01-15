package com.bridgelabz.Algorithms;
/******************************************************************************
 *  Purpose: Program is written for Insertion Sort .
 *  		 
 *
 *  @author  Manduri Lavanya<lavnaya.manduri@gmail.com>
 *  @version 1.0
 *  @since   18-12-2019
 *
 ******************************************************************************/
import com.bridgelabz.Utility.Utility;

public class InsertionSort {
	public static void main(String args[]) {
		String[] arr=new String[10];
		
		int n=Utility.readInt();

		for(int i=0;i<n;i++)
		{
			 	arr[i]=Utility.readString();
		}
		Utility.insertion(arr,n);
		Utility.printarray(arr,arr.length);
	}
		

}
