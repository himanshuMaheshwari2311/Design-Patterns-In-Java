package com.stark.patterns.creational.builder;

public class Main {
    public static void main(String args[]) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Ham");

        LunchOrder order = builder.build();

        System.out.println(order.toString());
    }
}
