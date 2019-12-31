package com.bridgelabz.DataStructuresPrograms;

import java.io.IOException;
import java.util.Arrays;

import com.bridgelabz.DataStructure.HashMap;
import com.bridgelabz.Utility.DataStructuresUtility;
import com.bridgelabz.Utility.Utility;

public class HashSlot {
	static int[] arr;

	public static void main(String[] args) {
		DataStructuresUtility utility = new DataStructuresUtility();
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		String readMessage = "";
		try {
			readMessage = utility.readFile(
					"D:\\Java_Programs\\FellowShip\\src\\Java\\com\\bridgelabz\\DataStructuresPrograms\\hashlist");
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] str = readMessage.split(",");
		arr = new int[str.length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Getting keys");
		for (int i = 0; i < arr.length; i++) {
			hashmap.add(arr[i], arr[i]);
		}
		hashmap.show();
		System.out.println("\nEnter key to search: ");
		
		int key = Utility.readInt();
		if (hashmap.get(key) != null) {
			hashmap.remove(key);
		} else {
			hashmap.add(key, key);
		}
		
		hashmap.show();
		try {
			utility.writeFile(
					"D:\\Java_Programs\\FellowShip\\src\\Java\\com\\bridgelabz\\DataStructuresPrograms\\hashlistoutput",
					hashmap.returnListInString());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
