package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddStrings {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		String result = junit.addString("The", "Beatles");
		assertEquals("TheBeatles", result);

	}

}
