package io.code;

<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
=======
<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
=======
import static org.junit.Assert.assertEquals;

<<<<<<< HEAD
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

>>>>>>> main
>>>>>>> main

public class CodeExampleTest {


	@Test
<<<<<<< HEAD
	@DisplayName("Take null as an arguments.")
	void CheckValidStatementTestCase1() throws Exception {
		CodeExample cExample = new CodeExample();
		assertEquals(true, cExample.checkingValidStatementBalance(null));
	}
	
	@Test
	@DisplayName("Take an empty string as an argument.")
	void CheckValidStatementTestCase2() throws Exception {
		CodeExample cExample = new CodeExample();
		assertEquals(true, cExample.checkingValidStatementBalance("  "));
	}
	
	@Test
	@DisplayName("Can throw an exception.")
	void CheckValidStatementTestCase3() throws Exception {
		CodeExample cExample = new CodeExample();
		assertEquals(Exception.class, cExample.checkingValidStatementBalance(""));
=======
<<<<<<< HEAD
	@DisplayName("Take null for both of the arguments.")
	public void SplitStringUsingDlimeterCase1() {
		CodeExample cExample = new CodeExample();
		ArrayList<String> expectedTeStrings = new ArrayList<String>();
		assertEquals(expectedTeStrings, cExample.reverseStringWithString(null, null));
=======
	@DisplayName("String as argument")
	public void ReveseStringTestCase1() {
		CodeExample cExample = new CodeExample();
		assertEquals("ereht ih", cExample.reverseString("hi there"));
	}
	
	@Test
	@DisplayName("Null as argument")
	public void ReveseStringTestCase2() {
		CodeExample cExample = new CodeExample();
		assertEquals("", cExample.reverseString(null));
	}
	
	@Test
	@DisplayName("Empty String as argument")
	public void ReveseStringTestCase3() {
		CodeExample cExample = new CodeExample();
		assertEquals("", cExample.reverseString(""));
	}
	@Test
	@DisplayName("Single Char as argument")
	public void ReveseStringTestCase4() {
		CodeExample cExample = new CodeExample();
		assertEquals("a", cExample.reverseString("a"));
=======
import java.util.HashMap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


>>>>>>> main

public class CodeExampleTest {
	
	
	@Test
<<<<<<< HEAD
	@DisplayName("Postive number")
	public void POWTestCase1() {
		CodeExample cExample = new CodeExample();
		HashMap<String, Integer> resultHashMap = new HashMap<String, Integer>();
		resultHashMap.put("output", 9);
		assertEquals(resultHashMap, cExample.POW(3, 2));
	}
	
	@Test
	@DisplayName("Negtive number")
	public void POWTestCase2() {
		CodeExample cExample = new CodeExample();
		HashMap<String, Integer> resultHashMap = new HashMap<String, Integer>();
		resultHashMap.put("output", 9);
		assertEquals(resultHashMap, cExample.POW(-3, 2));
	}
	
	@Test
	@DisplayName("Zero number")
	public void POWTestCase3() {
		CodeExample cExample = new CodeExample();
		HashMap<String, Integer> resultHashMap = new HashMap<String, Integer>();
		resultHashMap.put("output", 1);
		assertEquals(resultHashMap, cExample.POW(0, 0));
	}
	
	@Test
	@DisplayName("null")
	public void POWTestCase4() {
		CodeExample cExample = new CodeExample();
		HashMap<String, Integer> resultHashMap = new HashMap<String, Integer>();
		resultHashMap.put("output", null);
		assertEquals(resultHashMap, cExample.POW(null, null));
=======
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
>>>>>>> main
	}
	
	
	@Test
<<<<<<< HEAD
	@DisplayName("Take an empty string as the first argument.")
	public void SplitStringUsingDlimeterCase2() {
		CodeExample cExample = new CodeExample();
		ArrayList<String> expectedTeStrings = new ArrayList<String>();
		expectedTeStrings.add("");
		assertEquals(expectedTeStrings, cExample.reverseStringWithString("", " "));
	}
	
	
	@Test
	@DisplayName("Take an empty string as the second argument.")
	public void SplitStringUsingDlimeterCase3() {
		CodeExample cExample = new CodeExample();
		ArrayList<String> expectedTeStrings = new ArrayList<String>();
		List<String> reStrings = Arrays.asList("e", "m", " " , "e", "s", "r", "e", "v", "e", "r");
		expectedTeStrings.addAll(reStrings);
		assertEquals(expectedTeStrings, cExample.reverseStringWithString("reverse me", ""));
	}
	
	@Test
	@DisplayName("Return an empty array.")
	public void SplitStringUsingDlimeterCase4() {
		CodeExample cExample = new CodeExample();
		ArrayList<String> expectedTeStrings = new ArrayList<String>();
		expectedTeStrings.add("");
		assertEquals(expectedTeStrings, cExample.reverseStringWithString("", ""));
=======
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
>>>>>>> main
>>>>>>> main
>>>>>>> main
>>>>>>> main
	}

}
