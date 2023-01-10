package io.code;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class CodeExampleTest {
	
	
	@Test
	@DisplayName("array with mixed even and odd numbers.")
	public void OddEvenTestCase1() {
		CodeExample cExample = new CodeExample();
		HashMap<String, ArrayList<Integer>> resultHashMap = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> oddNumbersArrayList = new ArrayList<Integer>();
		ArrayList<Integer> evenNumbersArrayList = new ArrayList<Integer>();
		oddNumbersArrayList.add(1);
		oddNumbersArrayList.add(3);
		evenNumbersArrayList.add(4);
		evenNumbersArrayList.add(6);
		resultHashMap.put("even", evenNumbersArrayList);
		resultHashMap.put("odd", oddNumbersArrayList);
		assertEquals(resultHashMap, cExample.OddEvenNumber(new Integer[] {1, 3, 4, 6}));
	}
	
	
	@Test
	@DisplayName("Empty array as an argument.")
	public void OddEvenTestCase2() {
		CodeExample cExample = new CodeExample();
		HashMap<String, ArrayList<Integer>> resultHashMap = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> oddNumbersArrayList = new ArrayList<Integer>();
		ArrayList<Integer> evenNumbersArrayList = new ArrayList<Integer>();
		resultHashMap.put("even", evenNumbersArrayList);
		resultHashMap.put("odd", oddNumbersArrayList);
		assertEquals(resultHashMap, cExample.OddEvenNumber(new Integer[] {}));
	}
	
	@Test
	@DisplayName("array with all even numbers.")
	public void OddEvenTestCase3() {
		CodeExample cExample = new CodeExample();
		HashMap<String, ArrayList<Integer>> resultHashMap = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> oddNumbersArrayList = new ArrayList<Integer>();
		ArrayList<Integer> evenNumbersArrayList = new ArrayList<Integer>();
		evenNumbersArrayList.add(4);
		evenNumbersArrayList.add(6);
		resultHashMap.put("even", evenNumbersArrayList);
		resultHashMap.put("odd", oddNumbersArrayList);
		assertEquals(resultHashMap, cExample.OddEvenNumber(new Integer[] {4, 6}));
	}
	
	@Test
	@DisplayName("array with all odd numbers.")
	public void OddEvenTestCase4() {
		CodeExample cExample = new CodeExample();
		HashMap<String, ArrayList<Integer>> resultHashMap = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> oddNumbersArrayList = new ArrayList<Integer>();
		ArrayList<Integer> evenNumbersArrayList = new ArrayList<Integer>();
		oddNumbersArrayList.add(1);
		oddNumbersArrayList.add(3);
		resultHashMap.put("even", evenNumbersArrayList);
		resultHashMap.put("odd", oddNumbersArrayList);
		assertEquals(resultHashMap, cExample.OddEvenNumber(new Integer[] {1, 3}));
	}
	
	@Test
	@DisplayName("null as an argument, instead of an array.")
	public void OddEvenTestCase5() {
		CodeExample cExample = new CodeExample();
		HashMap<String, ArrayList<Integer>> resultHashMap = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> oddNumbersArrayList = new ArrayList<Integer>();
		ArrayList<Integer> evenNumbersArrayList = new ArrayList<Integer>();
		resultHashMap.put("even", evenNumbersArrayList);
		resultHashMap.put("odd", oddNumbersArrayList);
		assertEquals(resultHashMap, cExample.OddEvenNumber(null));
	}

}
