package com.bridgelabz.DataStructuresPrograms;
/******************************************************************************
 *  Purpose: Program is written for Unordered List .
 *  		 
 *
 *  @author  Manduri Lavanya<lavanya.manduri@gmail.com>
 *  @version 1.0
 *  @since   21-12-2019
 *
 ******************************************************************************/
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.Utility.*;
import com.bridgelabz.DataStructure.*;

public class UnOrderedList {
	public static void main(String[] args) {
		DataStructuresUtility utility = new DataStructuresUtility();
		LinkedList<String> list = new LinkedList<String>();
		String[] strArray = null;
		try {
			strArray = utility.readFile(
					"C:\\Users\\Hello\\Desktop\\UnOrderedFileIn.txt")
					.split(",");
		} catch (IOException e) {
			e.printStackTrace();
		}
		int size = strArray.length;
		for (int i = 0; i < strArray.length; i++) {
			list.add(strArray[i]);
		}
		System.out.println(list.show());

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter key to search");
		String key = scanner.next();
		size = list.searchNode(key, size);
		System.out.println(list.show());

		try {
			utility.writeFile(
					"C:\\Users\\Hello\\Desktop\\UnOrderedFileOut.txt",
					list.returnListInString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		scanner.close();
	}
	
	
}
