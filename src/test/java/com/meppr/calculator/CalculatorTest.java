package com.meppr.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
	private Calculator calc = new Calculator();

	@Test
	public void testSum() {
		assertEquals(5, calc.sum(2, 3));
	}
}
