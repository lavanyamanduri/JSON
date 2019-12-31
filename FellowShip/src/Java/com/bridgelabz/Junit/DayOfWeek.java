package com.bridgelabz.Junit;
/******************************************************************************
 *  Purpose: Program is written for Day Of Week .
 *  		 
 *
 *  @author  Manduri Lavanya<lavanya.manduri@gmail.com>
 *  @version 1.0
 *  @since   15-12-2019
 *
 ******************************************************************************/
import com.bridgelabz.Utility.Utility;

public class DayOfWeek {
	public static void main(String[] args) {

		System.out.println("enter the d m and y values");

int d=Utility.readInt();
int m=Utility.readInt();
int y=Utility.readInt();
Utility.dayofweek(d,m,y);
	}
}
