package com.in28minutes.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class SimpleClass {
	public int sum (int [] numbers) {
		int sum =0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
}

public class FirstJUnitTest {

	@Test
	public void test() {
		// fail("Not yet implemented");
		SimpleClass simpleclass = new SimpleClass();
		int actualResult = simpleclass.sum(new int[] { 12, 10, 16 });
		System.out.println(actualResult);

		int expectedResult = 38;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testFor0Elements() {
		// fail("Not yet implemented");
		SimpleClass simpleclass = new SimpleClass();
		int actualResult = simpleclass.sum(new int[] {});
		System.out.println(actualResult);

		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testFor5Elements() {
		// fail("Not yet implemented");
		SimpleClass simpleclass = new SimpleClass();
		int actualResult = simpleclass.sum(new int[] { 1, 2, 12, 10, 16 });
		System.out.println(actualResult);

		int expectedResult = 41;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testFor2Elements() {
		// fail("Not yet implemented");
		SimpleClass simpleclass = new SimpleClass();
		int actualResult = simpleclass.sum(new int[] { 12, 10 });
		System.out.println(actualResult);

		int expectedResult = 22;
		assertEquals(expectedResult, actualResult);
	}


}
