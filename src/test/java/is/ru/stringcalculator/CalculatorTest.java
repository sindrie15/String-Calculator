package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]){
		org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
	}

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber () {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers () {
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testMultipleNumbers(){
		assertEquals(6, Calculator.add("1,2,3"));
	}

	@Test
	public void testMultipleNumbers2(){
		assertEquals(6, Calculator.add("1 2 3"));
	}

	@Test
	public void testMultipleNumbers3(){
		assertEquals(6, Calculator.add("1 2,3"));
	}

	//@Test
	//public void testMinusNumbers(){
	//	assertEquals("Negatives not allowed:", Calculator.add("1,-2,3"));
	//}

	@Test 
	public void testMoreThan1000(){
		assertEquals(10, Calculator.add("2,3 1001,4 1"));
	}
}
