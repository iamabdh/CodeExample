package io.code;

import static org.junit.Assert.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CodeExampleTest {


	@Test
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
	}

}
