package com.bridgelabz.Basic;

/*****************************************************************************
 *  Purpose: Program is written for Replace String .
 *  		 
 *
 *  @author  Manduri Lavanya<lavanya.manduri@gmail.com>
 *  @version 1.0
 *  @since   13-12-2019
 *
 ******************************************************************************/
import com.bridgelabz.Utility.Utility;

public class ReplaceString {
	public static void main(String[] args) {
	
String x=Utility.readString();
String y="Hello <<UserName>>, How are you? "; 
	y=y.replace("<<UserName>>",x);
	System.out.println(y);
	
	}
}
