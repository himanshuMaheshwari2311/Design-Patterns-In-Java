package com.stark.patterns.behavioral.mediator;

public class Main {
    public static void main(String args[]) {
        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        Mediator mediator = new Mediator();

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command allLightsOnCommand = new TurnOnAllLights(mediator);
        allLightsOnCommand.execute();


        Command allLightsOffCommand = new TurnOffAllLights(mediator);
        allLightsOffCommand.execute();
    }
}
