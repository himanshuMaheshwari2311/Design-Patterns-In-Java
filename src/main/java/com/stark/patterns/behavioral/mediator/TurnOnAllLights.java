package com.stark.patterns.behavioral.mediator;

public class TurnOnAllLights implements Command{
    private Mediator med;

    public TurnOnAllLights(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOnAllLights();
    }
}
