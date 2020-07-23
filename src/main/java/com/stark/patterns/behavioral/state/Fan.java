package com.stark.patterns.behavioral.state;

public class Fan {

    State fanOffState;
    State fanLowState;
    State fanMedState;
    State state;

    public Fan() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMedState = new FanMedState(this);

        state = fanOffState;
    }

    public void pullChain() {
        state.handleRequest();
    }

    public String toString() {
        return state.toString();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public State getFanMedState() {
        return fanMedState;
    }

    public State getState() {
        return state;
    }
}
