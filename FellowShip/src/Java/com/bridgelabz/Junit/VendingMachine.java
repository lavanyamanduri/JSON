package com.bridgelabz.Junit;
/******************************************************************************
 *  Purpose: Program is written for Vending Machine .
 *  		 
 *
 *  @author  Manduri Lavanya<>
 *  @version 1.0
 *  @since   15-12-2020
 *
 ******************************************************************************/
import com.bridgelabz.Utility.Utility;

public class VendingMachine {
	public static void main(String[] args) {

		System.out.println("enter the cash required");
		int cash=Utility.readInt();
		Utility.vend(cash);
}
}
