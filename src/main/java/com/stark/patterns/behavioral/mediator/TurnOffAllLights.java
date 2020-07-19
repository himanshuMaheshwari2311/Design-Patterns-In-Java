package com.stark.patterns.behavioral.mediator;

public class TurnOffAllLights implements Command {
    private Mediator med;

    public TurnOffAllLights(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOffAllLights();
    }
}
