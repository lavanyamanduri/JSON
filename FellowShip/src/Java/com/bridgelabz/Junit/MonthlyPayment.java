package com.bridgelabz.Junit;
/******************************************************************************
 *  Purpose: Program is written for Monthly Payment .
 *  		 
 *
 *  @author  Manduri Lavanya<>
 *  @version 1.0
 *  @since   16-12-2020
 *
 ******************************************************************************/
import com.bridgelabz.Utility.Utility;
public class MonthlyPayment {
	public static void main(String[] args) {

System.out.println("enter the principal amount");
	double p=Utility.readdouble();
	System.out.println("enter the rate of intrest");
	double r=Utility.readdouble();
	System.out.println("enter the time in years");
	double t=Utility.readdouble();
	Utility.month(p, r, t);

	}
}
