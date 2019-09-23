package com.tinyb0y.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator calc = new Calculator();
        int result = calc.add(5,5);
        assertEquals(10, result);
    }

    @Test
    public void testMul(){
        Calculator calc = new Calculator();
        int res = calc.mul(5,5);
        assertEquals(25, res);
    }


}