package io.code;

<<<<<<< HEAD
import java.util.ArrayList;
=======
<<<<<<< HEAD
import java.util.ArrayList;
=======
<<<<<<< HEAD
=======
import java.util.ArrayList;
>>>>>>> main
import java.util.HashMap;
>>>>>>> main
>>>>>>> main

public class CodeExample {
	
	public static void main(String[] arg) {
<<<<<<< HEAD
		System.out.println(reverseStringWithString("", " "));
=======
>>>>>>> main
	}
	
	
	
	public  static ArrayList<String> reverseStringWithString(String str, String dli) {
		ArrayList<String> reString = new ArrayList<String>();
		try {
			String[] strArrStrings = str.split(dli);
			
			for (int i =  strArrStrings.length - 1; i >= 0; i--) {
				reString.add(strArrStrings[i]);
			}	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return reString;
	}
<<<<<<< HEAD

=======
	
<<<<<<< HEAD
	public  String reverseString(String str) {
		ArrayList<Character> strCharsArrayList = new ArrayList<Character>();
		String newString = new String();
		try {
			for (int i = str.length() - 1; i >= 0; i--) {
				strCharsArrayList.add(str.charAt(i));
			}
			
			for (int i = 0; i < strCharsArrayList.size(); i ++) {
				newString += strCharsArrayList.get(i);
			}
				
		} catch (Exception e) {
			// TODO: handle exception
		}
		return newString;
=======
<<<<<<< HEAD
	public   HashMap<String, Integer> POW(Integer a, Integer b) {
		HashMap<String, Integer> outpHashMap = new HashMap<String, Integer>();
		outpHashMap.put("output", a);
		Integer g = a;
		try {
			if (b == 0) {
				a = 1;
			} else  {
				for (int i  = 1; i < b; i ++) {
					a *= g;
=======
	
	public  HashMap<String, ArrayList<Integer>> OddEvenNumber (Integer[] arr) {
		HashMap<String, ArrayList<Integer>> oddEvenNumberResultHashMap = new HashMap<String, ArrayList<Integer>>();
		oddEvenNumberResultHashMap.put("even", new ArrayList<Integer>());
		oddEvenNumberResultHashMap.put("odd", new ArrayList<Integer>());
		try {
			for (int i = 0; i < arr.length; i ++) {
				if (arr[i] % 2 == 0) {
					ArrayList<Integer> oddEvenResultArrayList = oddEvenNumberResultHashMap.get("even");
					oddEvenResultArrayList.add(arr[i]);
					oddEvenNumberResultHashMap.put("even", oddEvenResultArrayList);
				} else {
					ArrayList<Integer> oddEvenResultArrayList = oddEvenNumberResultHashMap.get("odd");
					oddEvenResultArrayList.add(arr[i]);
					oddEvenNumberResultHashMap.put("odd", oddEvenResultArrayList);
>>>>>>> main
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
<<<<<<< HEAD
		
		outpHashMap.put("output", a);
		return outpHashMap;
=======
		return oddEvenNumberResultHashMap;
>>>>>>> main
>>>>>>> main
	}
>>>>>>> main
}
