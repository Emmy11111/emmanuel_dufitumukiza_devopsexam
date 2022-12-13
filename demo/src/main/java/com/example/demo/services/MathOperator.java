package com.example.demo.services;

import com.example.demo.InvalidOperationException;
import com.example.demo.dto.DoMathRequest;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public interface MathOperator {
    double doMath(double operand1, double operand2, String operation) throws InvalidOperationException;
}
