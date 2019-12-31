package com.bridgelabz.DataStructuresPrograms;
/******************************************************************************
 *  Purpose: Program is written for BalancedBinaryTree .
 *  		 
 *
 *  @author  Manduri Lavanya<>
 *  @version 1.0
 *  @since   18-12-2020
 *
 ******************************************************************************/
import java.util.Stack;

import com.bridgelabz.Utility.Utility;

public class BalancedBinaryTree {
public static void main(String[] args) {
		
		
		System.out.println("Enter the string:");
		String a=Utility.readString();
		BalancedBinaryTree b=new BalancedBinaryTree();
		BalancedBinaryTree.check(a);
		System.out.println(a+" = "+check(a));
		
		 }
		 public static boolean check(String a)
		 {
		 if (a.isEmpty())
		 return true;
		 
		 Stack stack = new Stack();
		 for (int i = 0; i < a.length(); i++)
		 {
		 char current = a.charAt(i);
		 if (current == '{' || current == '(' || current == '[')
		 {
		 stack.push(current);
		 }
		 if (current == '}' || current == ')' || current == ']')
		 {
		 if (stack.isEmpty())
		 return false;
		 char last = (char) stack.peek();
		 if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
		 stack.pop();
		 else 
		 return false;
		 }
		 }
		 return stack.isEmpty()?true:false;
		 }
}
