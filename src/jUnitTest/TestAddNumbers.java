package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumbers {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		int result = junit.addNumbers(200, 100);
		assertEquals(300, result);


	}

}