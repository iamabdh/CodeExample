package io.code;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CodeExampleTest {

	@Test
	@DisplayName("Take null as an arguments.")
	void CheckValidStatementTestCase1() {
		CodeExample cExample = new CodeExample();
		assertEquals(true, cExample.checkingValidStatementBalance(null));
	}
	
	@Test
	@DisplayName("Take an empty string as an argument.")
	void CheckValidStatementTestCase2() {
		CodeExample cExample = new CodeExample();
		assertEquals(true, cExample.checkingValidStatementBalance("  "));
	}

}
