package com.bptn.course.week4.day5.jUnitTests.sum2Num;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3)); // assertEquals
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2)); // assertEquals
        assertEquals(0, calculator.subtract(0, 0));
        assertEquals(-1, calculator.subtract(-2, -1));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3)); // assertEquals
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(-6, calculator.multiply(2, -3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, calculator.divide(5, 2)); // assertEquals with delta for floating-point comparison
        assertEquals(0.0, calculator.divide(0, 5));
        
//        assertNull(calculator.divide(1, 0)); // assertNull
        
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0)); // assertThrows
    }
    
    @Test
    public void testSquareRoot() {
        double result = calculator.squareRoot(25);
        assertEquals(5.0, result, 0.0001); // assertEquals for square root
    }
    
    @Test
    public void testPositiveNumber() {
        int num = calculator.abs(-7);
        assertTrue(num > 0); // assertTrue for a positive number
    }
    
    @Test
    public void testIsEven() {
        boolean isEven = calculator.isEven(6);
        assertTrue(isEven); // assertTrue for checking if a number is even
        
        isEven = calculator.isEven(7);
        assertFalse(isEven); // assertFalse for checking if a number is not even
    }
    
    @Test
    public void testNotNull() {
        String text = calculator.getNonNullString();
        assertNotNull(text); // assertNotNull for a non-null string
    }
    
    @Test
    public void testNull() {
        String text = calculator.getNullString();
        assertNull(text); // assertNull for a null string
    }

    @Test
    public void testSameObject() {
        Object obj1 = new Object();
        Object obj2 = obj1;
        assertSame(obj1, obj2); // assertSame for checking if two references point to the same object
    }

    @Test
    public void testNotSameObject() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        assertNotSame(obj1, obj2); // assertNotSame for checking if two references do not point to the same object
    }
}

