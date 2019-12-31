package com.bridgelabz.Junit;
/******************************************************************************
 *  Purpose: Program is written for Temperature Conversion .
 *  		 
 *
 *  @author  Manduri Lavanya<>
 *  @version 1.0
 *  @since   16-12-2020
 *
 ******************************************************************************/
import com.bridgelabz.Utility.Utility;
public class TemperatureConversion {
	public static void main(String[] args) {
		

System.out.println("enetr the temperature");
double T=Utility.readdouble();
System.out.println("if c type 1 else 0");
int x=Utility.readInt();
Utility.temp(x, T);
	}

}
