package com.bridgelabz.Functional;
/******************************************************************************
 *  Purpose: Program is written for WindChill .
 *  		 
 *
 *  @author  Manduri Lavanya<>
 *  @version 1.0
 *  @since   13-12-2020
 *
 ******************************************************************************/
import com.bridgelabz.Utility.Utility;
public class WindChill {

	public static void main(String[] args) {
		System.out.println("enter the t and v");
		double t=Utility.readdouble();
		double v=Utility.readdouble();
		Utility.wind(t, v);
	}

}
