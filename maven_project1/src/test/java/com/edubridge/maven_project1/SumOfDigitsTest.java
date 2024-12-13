package com.edubridge.maven_project1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumOfDigitsTest {
	private SumOfDigits s = null;

	@BeforeEach
	public void setup() {
		s = new SumOfDigits();
		System.out.println("BeforeEach");
		
		@Test
		public void testSumOfDigits() {
			int actual = 2345;
			int expected = 14;
			assertEquals(expected, actual);
		}
	}
}
