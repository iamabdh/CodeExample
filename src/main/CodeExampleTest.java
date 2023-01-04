package io.code;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CodeExampleTest {

	@Test
	@DisplayName("two param are postive")
	void biggerNumberTest() {
		CodeExample codeExample = new CodeExample();
		assertEquals(2, codeExample.biggerNum(1, 2));
	}

}
