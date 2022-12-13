package com.example.demo.service;

import com.example.demo.InvalidOperationException;
import com.example.demo.services.MathOperatorImpl;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class MathServiceTests {
    @Test
    public void doAddition() throws InvalidOperationException {
        double operand1 = 7;
        double operand2 = 10;
        String operation = "+";
        double expected = 17;

        MathOperatorImpl mathService = new MathOperatorImpl();

        double result = mathService.doMath(operand1, operand2, operation);

        assertEquals(expected, result);
    }

    @Test
    public void doMultiplication() throws InvalidOperationException {
        double operand1 = 7;
        double operand2 = 10;
        String operation = "*";
        double expected = 70;

        MathOperatorImpl mathService = new MathOperatorImpl();

        double result = mathService.doMath(operand1, operand2, operation);

        assertEquals(expected, result);
    }

    @Test
    public void doDivision() throws InvalidOperationException {
        double operand1 = 10;
        double operand2 = 2;
        String operation = "/";
        double expected = 5;

        MathOperatorImpl mathService = new MathOperatorImpl();

        double result = mathService.doMath(operand1, operand2, operation);

        assertEquals(expected, result);
    }

    @Test
    public void returnExceptionByDivisionByZero() throws InvalidOperationException {
        double operand1 = 7;
        double operand2 = 0;

        String operation = "/";

        MathOperatorImpl mathService = new MathOperatorImpl();

        InvalidOperationException thrown = org.junit.jupiter.api.Assertions.assertThrows(InvalidOperationException.class, () -> mathService.doMath(operand1, operand2, operation));
        assertEquals("Can not divide number by 0", thrown.getMessage());
    }

    @Test
    public void doPower() throws InvalidOperationException {
        double operand1 = 10;
        double operand2 = 2;
        String operation = "**";
        double expected = 100;

        MathOperatorImpl mathService = new MathOperatorImpl();

        double result = mathService.doMath(operand1, operand2, operation);

        assertEquals(expected, result);
    }

    @Test
    public void doSubtraction() throws InvalidOperationException {
        double operand1 = 7;
        double operand2 = 10;
        String operation = "-";
        double expected = -3;

        MathOperatorImpl mathService = new MathOperatorImpl();

        double result = mathService.doMath(operand1, operand2, operation);

        assertEquals(expected, result);
    }

    @Test
    public void doLogarithmBase10() throws InvalidOperationException {
        double operand1 = 5;
        double operand2 = 3;
        String operation = "log";

        double expected = 2.385606273598312;

        MathOperatorImpl mathService = new MathOperatorImpl();
        double actual = mathService.doMath(operand1, operand2, operation);
        assertEquals(expected, actual);
    }

    @Test
    public void doLogarithmLn() throws InvalidOperationException {
        double operand1 = 5;
        double operand2 = 3;
        String operation = "log";

        double expected = 5.493061443340549;

        MathOperatorImpl mathService = new MathOperatorImpl();
        double actual = mathService.doMath(operand1, operand2, operation);
        assertEquals(expected, actual);
    }

}
