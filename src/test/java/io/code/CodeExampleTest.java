package io.code;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

public class CodeExampleTest {
	
	
	@Test
	public void OddEvenTest() {
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
		assertEquals(resultHashMap, cExample.OddEvenNumber(new int[] {1, 3, 4, 6}));
	}

}
