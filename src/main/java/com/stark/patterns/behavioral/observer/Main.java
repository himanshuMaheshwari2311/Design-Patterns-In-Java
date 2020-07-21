package com.stark.patterns.behavioral.observer;

public class Main {
    public static void main(String args[]) {
        Subject subject =  new MessageStream();

        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);

        phoneClient.addMessage("New Message!");
        tabletClient.addMessage("Second Message!");
    }
}
