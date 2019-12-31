package com.bridgelabz.Algorithms;
/******************************************************************************
 *  Purpose: Program is written for Bubble Sort .
 *  		 
 *
 *  @author  Manduri Lavanya<>
 *  @version 1.0
 *  @since   17-12-2020
 *
 ******************************************************************************/
import com.bridgelabz.Utility.Utility;
public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[5];

System.out.println("enter length of string");
int n=Utility.readInt();
for(int i=0;i<n;i++)
{
	arr[i]=Utility.readInt();
}
Utility.bubblesort(arr);
for (int i=0;i<n;i++)
{
	System.out.print(arr[i]+" ");
}
	}

}
