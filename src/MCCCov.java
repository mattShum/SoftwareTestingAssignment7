import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MCCCov {

	@Test
	/*
	 * Test Case ID: MCCCov 1
	 * This test case asserts the conditionals: 
	 * C1(true), C2(true), C3(true), C4(true)
	 */	 
	void multipleCoverage1() {
		assertEquals(-8, Function.Fun(-8, 5, -1), "MCCCov1 result should be -8");
	}

}
