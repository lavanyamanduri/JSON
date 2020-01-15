package com.bridgelabz.Logical;
/******************************************************************************
 *  Purpose: Program is written for Gambler .
 *  		 
 *
 *  @author  Manduri Lavanya<lavanya.manduri@gmail.com>
 *  @version 1.0
 *  @since   13-12-2020
 *
 ******************************************************************************/
import com.bridgelabz.Utility.Utility;

public class Gambler {
	
    public static void main(String[] args) {

	System.out.println("enter stake and goal");
	int stake=Utility.readInt();
	int goal=Utility.readInt();
	System.out.println("enter number of times");
	int n=Utility.readInt();
	Utility.gambler(stake, goal, n);

	}
}
