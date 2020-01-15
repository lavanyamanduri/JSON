package com.bridgelabz.Algorithms;
/******************************************************************************
 *  Purpose: Program is written for Bubble Sort USing Generics.
 *  		 
 *
 *  @author  Manduri Lavanya<lavanya.manduri@gmial.com>
 *  @version 1.0
 *  @since   18-12-2019
 *
 ******************************************************************************/
import java.util.Arrays;

public class BubbleSortGenerics <T extends Number & Comparable<T>> {

		 public static void main(String[] args)
		    {
		        
		        Integer[]  s = {654,562,741,963,7412,321};
		        BubbleSortGenerics<Integer> b  = new BubbleSortGenerics<>();
		        b.BubbleSortGenericssort(s);
		        System.out.println(Arrays.toString(s));

		     
		    }

		 void BubbleSortGenericssort(T[] a) {
			 for (int i = 0; i < a.length; i++) 
			{
				 int j;
			    for ( j = i + 1; j < a.length; j++) { 
			       
			    	if(a[i].compareTo(a[j])>0)
			        {
			    		T temp;
			           temp = a[i];
			            a[i] = a[j];
			            a[j] = temp;
			        }
			    }
			}
			
		}
		 
		 
		
}
