package com.example.demo.utils;

public class JsonResponse {

    private boolean status;

    private double calcResponse;


    public JsonResponse() {
        super();
    }


    public JsonResponse(boolean status, double calcResponse) {
        super();
        this.status = status;
        this.calcResponse = calcResponse;
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getCalcResponse() {
        return calcResponse;
    }

    public void setMessage(double calcResponse) {
        this.calcResponse = calcResponse;
    }


}
