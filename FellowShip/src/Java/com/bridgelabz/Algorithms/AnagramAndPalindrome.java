package com.bridgelabz.Algorithms;
/******************************************************************************
 *  Purpose: Program is written for Anagram And Palindrome .
 *  		 
 *
 *  @author  Manduri Lavanya<lavanya.manduri@gmail.com>
 *  @version 1.0
 *  @since   18-12-2019
 *
 ******************************************************************************/
import com.bridgelabz.Utility.Utility;
public class AnagramAndPalindrome {
	public static void main(String[] args) {
		int[] arr=new int[1000];
		int l=0;
				for (int n=0;n<1000;n++)
					{
				boolean a=Utility.isPrime(n);
			if (a==true) 
			{
			arr[l]=n;
			l++;
			}
			}
				System.out.println("the prime numbers are:");
				for(int i=0;i<l;i++)
				{
					System.out.print(" "+arr[i]);
				}
				System.out.println(" ");
				System.out.println("the pallimdrome numbers are:");
				for(int i=0;i<l;i++)
				{
					if( Utility.ispallindrome(arr[i])==true)
					{
					System.out.print(" "+arr[i]);
				}}
				System.out.println(" ");
				System.out.println("the anagram numbers are");
				for (int k=0;k<l;k++)
						for(int m=k+1;m<l;m++)
						{
							char[] x=("" + arr[k]).toCharArray();
							char[] y=("" + arr[m]).toCharArray();
						if(	(Utility.areAnagram(x,y))==true) 
					
						{
							System.out.print(" "+arr[k]+"---"+arr[m]+" ");
						}
					}
				}
			
}
