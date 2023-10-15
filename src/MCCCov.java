import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MCCCov {

	@Test
	/*
	 * Test Case ID: MCCCov 1
	 * Created by Matt Shuman
	 * This test case asserts the conditionals: 
	 * C1(true), C2(true), C3(true), C4(true)
	 */	 
	void multipleCoverage1() {
		System.out.println("Test Case MCCCov 1 result should be: -8");
		int result = Function.Fun(-8, 5, -1);
		assertEquals(-8, result, "MCCCov1 result should be -8");
		System.out.println("Result is: " + result);
	}
	
	@Test
	/*
	 * Test Case ID: MCCCov 2
	 * Created by Matt Shuman
	 * This test case asserts the conditionals: 
	 * C1(true), C2(true), C3(false), C4(true)
	 */	 
	void multipleCoverage2() {
		System.out.println("Test Case MCCCov 2 result should be: 0");
		int result = Function.Fun(0, 1, 4);
		assertEquals(0, result, "MCCCov2 result should be 0");
		System.out.println("Result is: " + result);
	}
	
	@Test
	/*
	 * Test Case ID: MCCCov 3
	 * Created by Matt Shuman
	 * This test case asserts the conditionals: 
	 * C1(true), C2(true), C3(false), C4(false)
	 */	 
	void multipleCoverage3() {
		System.out.println("Test Case MCCCov 3 result should be: 3");
		int result = Function.Fun(1, 1, 2);
		assertEquals(3, result, "MCCCov3 result should be 3");
		System.out.println("Result is: " + result);
	}
	
	@Test
	/*
	 * Test Case ID: MCCCov 4
	 * Created by Matt Shuman
	 * This test case asserts the conditionals:
	 * C1(true), C2(false), C3(true), C4(true)
	 */	 
	void multipleCoverage4() {
		System.out.println("Test Case MCCCov 4 result should be: -1");
		int result = Function.Fun(4, 1, 20);
		assertEquals(-1, result, "MCCCov4 result should be -1");
		System.out.println("Result is: " + result);
	}
	
	@Test
	/*
	 * Test Case ID: MCCCov 5
	 * Created by Matt Shuman
	 * This test case asserts the conditionals:
	 * C1(true), C2(false), C3(false), C4(true)
	 */	 
	void multipleCoverage5() {
		System.out.println("Test Case MCCCov 5 result should be: 6");
		int result = Function.Fun(4, 8, 60);
		assertEquals(6, result, "MCCCov5 result should be 6");
		System.out.println("Result is: " + result);
	}
	
	@Test
	/*
	 * Test Case ID: MCCCov 6
	 * Created by Matt Shuman
	 * This test case asserts the conditionals:
	 * C1(true), C2(false), C3(true), C4(false)
	 */	 
	void multipleCoverage6() {
		System.out.println("Test Case MCCCov 6 result should be: -44");
		int result = Function.Fun(4, -42, 6);
		assertEquals(-44, result, "MCCCov6 result should be -44");
		System.out.println("Result is: " + result);
	}
	
	@Test
	/*
	 * Test Case ID: MCCCov 7
	 * Created by Matt Shuman
	 * This test case asserts the conditionals:
	 * C1(true), C2(false), C3(false), C4(false)
	 */	 
	void multipleCoverage7() {
		System.out.println("Test Case MCCCov 7 result should be: 4");
		int result = Function.Fun(4, 17, 20);
		assertEquals(4, result, "MCCCov7 result should be 4");
		System.out.println("Result is: " + result);
	}	
	
	@Test
	/*
	 * Test Case ID: MCCCov 8
	 * Created by Matt Shuman
	 * This test case asserts the conditionals:
	 * C1(false), C2(-), C3(true), C4(true)
	 */	 
	void multipleCoverage8() {
		System.out.println("Test Case MCCCov 8 result should be: -1");
		int result = Function.Fun(-1, 1, -2);
		assertEquals(-1, result, "MCCCov8 result should be -1");
		System.out.println("Result is: " + result);
	}
	
	@Test
	/*
	 * Test Case ID: MCCCov 9
	 * Created by Matt Shuman
	 * This test case asserts the conditionals:
	 * C1(false), C2(-), C3(false), C4(true)
	 */	 
	void multipleCoverage9() {
		System.out.println("Test Case MCCCov 9 result should be: 1");
		int result = Function.Fun(1, 1, -1);
		assertEquals(1, result, "MCCCov9 result should be 1");
		System.out.println("Result is: " + result);
	}
	
	@Test
	/*
	 * Test Case ID: MCCCov 10
	 * Created by Matt Shuman
	 * This test case asserts the conditionals:
	 * C1(false), C2(-), C3(false), C4(false)
	 */	 
	void multipleCoverage10() {
		System.out.println("Test Case MCCCov 10 result should be: 2");
		int result = Function.Fun(1, 1, 1);
		assertEquals(2, result, "MCCCov10 result should be 2");
		System.out.println("Result is: " + result);
	}
}
