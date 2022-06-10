package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculation() {
        //Given
        //When
        double sum = calculator.add(3.0, 3.0);
        double sub = calculator.sub(4.0, 2.0);
        double mul = calculator.mul(5.0,5.0);
        double div = calculator.div(6.0, 6.0);
        //Then
        assertEquals(6.0, sum, 0.01);
        assertEquals(2.0, sub, 0.01);
        assertEquals(25.0, mul, 0.01);
        assertEquals(1.0, div, 0.001);
    }
}
