package com.bridgelabz.Basic;
/******************************************************************************
 *  Purpose: Program is written for LeapYear .
 *  		 
 *
 *  @author  Manduri Lavanya<>
 *  @version 1.0
 *  @since   13-12-2020
 *
 ******************************************************************************/
import com.bridgelabz.Utility.Utility;

public class LeapYear {
	
	public static void main(String[] args) {
		
System.out.println("enter the year");
		int year=Utility.readInt();
Utility.leap(year);
	}
}
