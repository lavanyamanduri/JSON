package com.bridgelabz.Functional;
/******************************************************************************
 *  Purpose: Program is written for SumOfThreeIsZero .
 *  		 
 *
 *  @author  Manduri Lavanya<lavanya.manduri@gmail.com>
 *  @version 1.0
 *  @since   13-12-2019
 *
 ******************************************************************************/
import com.bridgelabz.Utility.Utility;

public class SumOfThreeIsZero {
	public static void main(String[] args) {
		
		int n=Utility.readInt();
int[] a=new int[10];
for(int i=0;i<n;i++)
{
	a[i]=Utility.readInt();
}
int x=Utility.triplets(a);
System.out.println("num of triplets are"+x);
	}
}
