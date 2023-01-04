package io.code;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CodeExampleTestUit {

	@Test
	@DisplayName("two param are postive")
	void biggerNumberTestCase1() {
		CodeExample codeExample = new CodeExample();
		assertEquals(2, codeExample.biggerNum(1, 2));
	}
	
	@Test
	@DisplayName("two param are negtive")
	void biggerNumberTestCase2() {
		CodeExample codeExample = new CodeExample();
		assertEquals(-1, codeExample.biggerNum(-1, -2));
	}
	
	@Test
	@DisplayName("two param are equal")
	void biggerNumberTestCase3() {
		CodeExample codeExample = new CodeExample();
		assertEquals(2, codeExample.biggerNum(2, 2));
	}

}
