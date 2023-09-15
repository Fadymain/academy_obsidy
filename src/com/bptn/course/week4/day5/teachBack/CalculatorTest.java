package com.bptn.course.week4.day5.teachBack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.bptn.course.week4.day5.teachBack.Calculator;

import org.junit.jupiter.api.Test;


class CalculatorTest {
	
	private Calculator calculator = new Calculator();

	@Test
	public void testAdd() {
        assertEquals(5, calculator.add(2, 3)); // assertEquals
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-5, calculator.add(-2, -3));
    }
	
	@Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3)); // assertEquals
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(-6, calculator.multiply(2, -3));
    }
	
	@Test
    public void testIsEven() {
        boolean isEven = calculator.isEven(6);
        assertTrue(isEven);
	}
	
	@Test
    public void testPositiveNumber() {
        int num = calculator.abs(-7);
        assertTrue(num > 0); // assertTrue for a positive number
    }
	
    @Test
    public void testNull() {
        String text = this.calculator.getHello();
        assertNull(text); // assertNull for a null string
    }
    
    @Test
    public void testDivide() {
        assertEquals(2.5, calculator.divide(5, 2)); // assertEquals with delta for floating-point comparison
        assertEquals(0.0, calculator.divide(0, 5));
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0)); // assertThrows

    }
}
