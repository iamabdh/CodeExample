package io.code;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CodeExampleTest {

	@Test
	@DisplayName("Take null for both of the arguments.")
	public void SplitStringUsingDlimeterCase1() {
		CodeExample cExample = new CodeExample();
		ArrayList<String> expectedTeStrings = new ArrayList<String>();
		assertEquals(expectedTeStrings, cExample.reverseStringWithString(null, null));
	}
	
	
	@Test
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
	}

}
