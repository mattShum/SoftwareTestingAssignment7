import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SCov {

	@Test
	/**
	 * Test Case ID: testSC01
	 * Created by: Elvis Blanco Gonzalez
	 * This test asserts the conditionals:
	 * C1(True), C2(True), C3(False)
	 */
    public void testSC01() {
    	System.out.println("Test Case testSC01 result should be: 5");
        int x = 1, k = 0, y = 3;
        int result = Function.Fun(x, k, y);
        
        int expected = 5; 
        Assertions.assertEquals(expected, result);
        System.out.println("Result is: " + result);
    }

    @Test
    /**
	 * Test Case ID: testSC02
	 * Created by: Elvis Blanco Gonzalez
	 * This test asserts the conditionals:
	 * C1(-), C2(-), C3(-)
	 */
    public void testSC02() {
    	System.out.println("Test Case testSC02 result should be: 1");
        int x = 1, k = 2, y = 5;
        int result = Function.Fun(x, k, y);
        
        int expected = 1; 
        Assertions.assertEquals(expected, result);
        System.out.println("Result is: " + result);
    }

    @Test
    /**
	 * Test Case ID: testSC03
	 * Created by: Elvis Blanco Gonzalez
	 * This test asserts the conditionals:
	 * C1(True), C2(-), C3(-)
	 */
    public void testSC03() {
    	System.out.println("Test Case testSC03 result should be: 7");
        int x = 1, k = 2, y = 4;
        int result = Function.Fun(x, k, y);
        
        int expected = 7;
        Assertions.assertEquals(expected, result);
        System.out.println("Result is: " + result);
    }

    @Test
    /**
	 * Test Case ID: testSC04
	 * Created by: Elvis Blanco Gonzalez
	 * This test asserts the conditionals:
	 * C1(false), C2(-), C3(false)
	 */
    public void testSC04() {
    	System.out.println("Test Case testSC04 result should be: 7");
        int x = 1, k = 2, y = 4;
        int result = Function.Fun(x, k, y);
        
        int expected = 7; 
        Assertions.assertEquals(expected, result);
        System.out.println("Result is: " + result);
    }
}
