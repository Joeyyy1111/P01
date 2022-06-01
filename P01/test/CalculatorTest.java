import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test //Junit part
	public void testAdd() {
		//Arrange --> set up, initialize the variable 
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		
		//Act -->calling the method .add function
		int actual = cal.add(a, b);
		
		//Assert -->put in the expected and u call for the Junit method to check whether your expected outcome = actual.
		int expected = 5555;
		assertEquals(expected,actual);
	}
	@Test
	public void testSubtract() {
		//Arrange
		int a =9876;
		int b =4321;
		Calculator cal = new Calculator();
	
		//Act
		int actual = cal.subtract(a,b);
		
		//Assert
		int expected =5555;
		assertEquals(expected,actual);
	}
	@Test
	public void testMultiply() {
		//Arrange
		int a = 3;
		int b = 5;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.multiply(a, b);
		
		//Assert
		int expected = 15;
		assertEquals(expected,actual);
	}
	@Test
	public void testDivide() {
		//Arrange
		int a = 6;
		int b = 2;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.divide(a, b);
		
		//Assert
		int expected = 3;
		assertEquals(expected,actual);
	}
	//public void test() {
	//	fail("Not yet implemented");
	//}

}
