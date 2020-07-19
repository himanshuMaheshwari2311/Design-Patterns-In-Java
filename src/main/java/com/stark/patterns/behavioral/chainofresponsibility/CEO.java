package com.stark.patterns.behavioral.chainofresponsibility;

public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO can approve anything they want");
    }
}
