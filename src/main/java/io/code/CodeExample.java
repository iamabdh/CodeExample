package io.code;

import java.util.ArrayList;
import java.util.HashMap;

public class CodeExample {
	
	public static void main(String[] arg) {
		
	}
	
	public int DummyFunction(int a) {
		return a;
	}
	
	
	public  HashMap<String, ArrayList<Integer>> OddEvenNumber (int[] arr) {
		HashMap<String, ArrayList<Integer>> oddEvenNumberResultHashMap = new HashMap<String, ArrayList<Integer>>();
		oddEvenNumberResultHashMap.put("even", new ArrayList<Integer>());
		oddEvenNumberResultHashMap.put("odd", new ArrayList<Integer>());
		for (int i = 0; i < arr.length; i ++) {
			if (arr[i] % 2 == 0) {
				ArrayList<Integer> oddEvenResultArrayList = oddEvenNumberResultHashMap.get("even");
				oddEvenResultArrayList.add(arr[i]);
				oddEvenNumberResultHashMap.put("even", oddEvenResultArrayList);
			} else {
				ArrayList<Integer> oddEvenResultArrayList = oddEvenNumberResultHashMap.get("odd");
				oddEvenResultArrayList.add(arr[i]);
				oddEvenNumberResultHashMap.put("odd", oddEvenResultArrayList);
			}
		}
		return oddEvenNumberResultHashMap;
	}
}
