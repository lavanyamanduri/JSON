package com.bridgelabz.Algorithms;
/*****************************************************************************
 *  Purpose: Program is written for Anagram Detection .
 *  		 
 *
 *  @author  Manduri Lavanya<lavanya.manduri@gmail.com>
 *  @version 1.0
 *  @since   18-12-2019
 ******************************************************************************/
import com.bridgelabz.Utility.Utility;
public class AnagramDetection {
	public static void main(String[] args) {
		String st=Utility.readString();
		String st1=Utility.readString();
		 char[] str1 = st.toCharArray(); 
		 char[] str2= st1.toCharArray();
			boolean b=Utility.areAnagram(str1,str2);
			if (b==true)
			{
				System.out.println("given string are anagram");
			}
			else
			{
				System.out.println("given strings are not anagram");
			}
			}
}
