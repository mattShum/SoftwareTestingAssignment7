import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MCCCov {

	@Test
	/*
	 * Test Case ID: MCC 1
	 * Created by Matt Shuman
	 * This test case asserts the conditionals: 
	 * C1(true), C2(true), C3(true)
	 */	 
	void multipleCoverage1() {
		System.out.println("Test Case MCC 1 result should be: -8");
		int result = Function.Fun(-8, 5, -1);
		assertEquals(-8, result, "MCC 1 result should be -8");
		System.out.println("Result is: " + result);
	}
	
	@Test
	/*
	 * Test Case ID: MCC 2
	 * Created by Matt Shuman
	 * This test case asserts the conditionals: 
	 * C1(true), C2(true), C3(false)
	 */	 
	void multipleCoverage3() {
		System.out.println("Test Case MCC 2 result should be: 3");
		int result = Function.Fun(1, 1, 2);
		assertEquals(3, result, "MCC 2 result should be 3");
		System.out.println("Result is: " + result);
	}
	
	@Test
	/*
	 * Test Case ID: MCC 3
	 * Created by Matt Shuman
	 * This test case asserts the conditionals:
	 * C1(true), C2(false), C3(true)
	 */	 
	void multipleCoverage4() {
		System.out.println("Test Case MCC 3 result should be: -1");
		int result = Function.Fun(4, 1, 20);
		assertEquals(-1, result, "MCC 3 result should be -1");
		System.out.println("Result is: " + result);
	}
	
	@Test
	/*
	 * Test Case ID: MCC 4
	 * Created by Matt Shuman
	 * This test case asserts the conditionals:
	 * C1(true), C2(false), C3(false)
	 */	 
	void multipleCoverage7() {
		System.out.println("Test Case MCC 4 result should be: 4");
		int result = Function.Fun(4, 17, 20);
		assertEquals(4, result, "MCC 4 result should be 4");
		System.out.println("Result is: " + result);
	}	
	
	@Test
	/*
	 * Test Case ID: MCC 5
	 * Created by Matt Shuman
	 * This test case asserts the conditionals:
	 * C1(false), C2(-), C3(true)
	 */	 
	void multipleCoverage8() {
		System.out.println("Test Case MCC 5 result should be: -1");
		int result = Function.Fun(-1, 1, -2);
		assertEquals(-1, result, "MCC 5 result should be -1");
		System.out.println("Result is: " + result);
	}
	
	@Test
	/*
	 * Test Case ID: MCC 6
	 * Created by Matt Shuman
	 * This test case asserts the conditionals:
	 * C1(false), C2(-), C3(false)
	 */	 
	void multipleCoverage10() {
		System.out.println("Test Case MCC 6 result should be: 2");
		int result = Function.Fun(1, 1, 1);
		assertEquals(2, result, "MCC 6 result should be 2");
		System.out.println("Result is: " + result);
	}
}
