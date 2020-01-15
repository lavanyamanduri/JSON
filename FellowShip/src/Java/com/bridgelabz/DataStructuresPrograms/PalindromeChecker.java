package com.bridgelabz.DataStructuresPrograms;
/******************************************************************************
 *  Purpose: Program is written for Palindrome Checker .
 *  		 
 *
 *  @author  Manduri Lavanya<lavanya.manduri@gmail.com>
 *  @version 1.0
 *  @since   26-12-2019
 *
 ******************************************************************************/

import com.bridgelabz.DataStructure.Queue;
import com.bridgelabz.Utility.*;


public class PalindromeChecker {
	public static void main(String[] args) 
    {
        System.out.print("Enter any string : ");
       
        String s = Utility.readString();
        String a=s;
        
      DataStructuresUtility d=new DataStructuresUtility();
        Queue queue = new Queue();
 
        for (int i = s.length()-1; i >=0; i--) {
            queue.enQueue(s.charAt(i));
        }
 
        String reverseString = "";
 
        //Pop all chars from stack one by one and build reverse string
        while (!queue.isEmpty()) {
            reverseString = reverseString + d.Remove();
           
        }
 
        //Check palindrome string
        if (a.equals(reverseString)) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }
    
    }

}
