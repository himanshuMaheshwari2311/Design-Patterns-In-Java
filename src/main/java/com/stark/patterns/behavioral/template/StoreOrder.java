package com.stark.patterns.behavioral.template;

public class StoreOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("Store checkout");
    }

    @Override
    public void doPayment() {
        System.out.println("Store Payment");
    }

    @Override
    public void doReceipt() {
        System.out.println("Store Receipt");
    }

    @Override
    public void doDelivery() {
        System.out.println("Store delivery");
    }
}
