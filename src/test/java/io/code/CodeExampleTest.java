package io.code;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class CodeExampleTest {

	@Test
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

}
