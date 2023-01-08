package io.code;

import java.util.ArrayList;

public class CodeExample {
	
	public static void main(String[] arg) {
	}
	
	public int DummyFunction(int a) {
		return a;
	}
	
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
	}
}
