package com.bridgelabz.Algorithms;
/******************************************************************************
 *  Purpose: Program is written for Regular Expression .
 *  		 
 *
 *  @author  Manduri Lavanya<>
 *  @version 1.0
 *  @since   19-12-2020
 *
 ******************************************************************************/
import java.util.regex.Matcher;

public class Regex {
	public static void main(String[] args) {
		
String a=" Read in the following message: Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
a=a.replaceAll("<<name>>",  Matcher.quoteReplacement("LP"));
a=a.replaceAll("<<full name>>",  Matcher.quoteReplacement("Lakshmi Prasad"));
a=a.replaceAll("91-xxxxxxxxxx",  Matcher.quoteReplacement("9632542151"));
a=a.replaceAll("01/01/2016.",  Matcher.quoteReplacement("17/12/2019.")); 
System.out.println(a);
	}
}
