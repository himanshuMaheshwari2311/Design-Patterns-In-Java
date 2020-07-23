package com.stark.patterns.behavioral.strategy;

public class Main {
    public static void main(String args[]) {
        CreditCard amexCard = new CreditCard(new AmexStrategy());
        amexCard.setNumber("379185883464283");
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");

        System.out.println("Is card valid: " + amexCard.isValid());

        amexCard.setNumber("37918588346428");
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");

        System.out.println("Is card valid: " + amexCard.isValid());
    }
}
