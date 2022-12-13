package com.example.demo.dto;

public class DoMathRequest {
    private String operation;
    private double operand1;
    private double operand2;

    public DoMathRequest() {
    }

    public String getOperation() {
        return operation;
    }

    public double getOperand1() {
        return operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public DoMathRequest(String operation, double operand1, double operand2) {
        this.operation = operation;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
}
