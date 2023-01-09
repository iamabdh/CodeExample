package io.code;

import java.util.ArrayList;

public class CodeExample {
	
	public static void main(String[] arg) {
		System.out.println(reverseStringWithString("", " "));
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

}
