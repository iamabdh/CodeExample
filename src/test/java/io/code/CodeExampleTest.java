package io.code;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CodeExampleTest {

	@Test
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
	}

}
