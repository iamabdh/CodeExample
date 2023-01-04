package io.code;

import static org.junit.Assert.*;

import org.junit.Test;

public class CodeExampleTest {

	@Test
	public void dummyTest() {
		CodeExample cExample = new CodeExample();
		assertEquals(1, cExample.DummyFunction(1));
	}

}
