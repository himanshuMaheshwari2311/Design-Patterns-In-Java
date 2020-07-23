package com.stark.patterns.behavioral.template;

public class WebOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("Web checkout");
    }

    @Override
    public void doPayment() {
        System.out.println("Web Payment");
    }

    @Override
    public void doReceipt() {
        System.out.println("Web Receipt");
    }

    @Override
    public void doDelivery() {
        System.out.println("Web delivery");
    }
}
