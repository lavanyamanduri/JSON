package com.bridgelabz.Algorithms;
/******************************************************************************
 *  Purpose: Program is written for Insertion Sort USing Generics.
 *  		 
 *
 *  @author  Manduri Lavanya<lavanya.manduri@gmail.com>
 *  @version 1.0
 *  @since   18-12-2019
 *
 ******************************************************************************/
import java.util.Arrays;

	public class InsertionSortGenerics<T extends Comparable<T>> {

		
		  public static void main(String[] args)
		    {
		        
		        String[]  s = {"b","d","s","a","t"};
		        InsertionSortGenerics<String> stringSorter   = new InsertionSortGenerics<>();
		        stringSorter.insertionSort(s);
		        System.out.println(Arrays.toString(s));

		     
		    }
		    
		    void insertionSort(T[] a)
		    {
		        
		        for (int i = 1; i < a.length; i++)
		        {
		            int j = i;
		           
		            while (j > 0 && a[j - 1].compareTo(a[j]) > 0)
		            {
		                T temp = a[j];
		                a[j] = a[j - 1];
		                a[j - 1] = temp;
		                j--;
		            }
		        }
		    }
		    
}
