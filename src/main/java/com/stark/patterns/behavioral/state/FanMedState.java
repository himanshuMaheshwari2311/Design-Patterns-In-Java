package com.stark.patterns.behavioral.state;

public class FanMedState extends State {

    private Fan fan;

    public FanMedState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan to Off");
        fan.setState(fan.getFanOffState());
    }

    public String toString() {
        return "Fan is on Med";
    }
}
