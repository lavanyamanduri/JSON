package com.bridgelabz.Functional;
/******************************************************************************
 *  Purpose: Program is written for Distance .
 *  		 
 *
 *  @author  Manduri Lavanya<lavanya.manduri@gmail.com>
 *  @version 1.0
 *  @since   13-12-2019
 *
 ******************************************************************************/
import com.bridgelabz.Utility.Utility;
public class Distance {
	public static void main(String[] args) {
		
double x=Utility.readInt();
double y=Utility.readInt();

double sum=Utility.distance(x,y);
System.out.println(sum);
	}
}
