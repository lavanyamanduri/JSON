package com.bridgelabz.Functional;
/******************************************************************************
 *  Purpose: Program is written for Quadratic .
 *  		 
 *
 *  @author  Manduri Lavanya<>
 *  @version 1.0
 *  @since   14-12-2020
 *
 ******************************************************************************/
import com.bridgelabz.Utility.Utility;
public class Quadratic {
	public static void main(String[] args) {

	System.out.println("enter 3 values");
	
	double a=Utility.readdouble();
	double b=Utility.readdouble();
	double c=Utility.readdouble();
	Utility.quad(a,b,c);
	
	}
}
