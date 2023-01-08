package io.code;

import java.util.HashMap;

public class CodeExample {
	
	public static void main(String[] arg) {
	}
	
	public int DummyFunction(int a) {
		return a;
	}
	
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
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		outpHashMap.put("output", a);
		return outpHashMap;
	}
}
