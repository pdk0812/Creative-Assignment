package Main;

import Colleague.AirCraft;
import ConcreteColleague.AirCraftImplementation;
import ConcreteMediator.ATCMediatorImplementation;
import Mediator.ATCMediator;

//Mediator Design Pattern Air Traffic Control System.
//Air Traffic Control System using a Mediator to control communications between different AirCrafts.
public class Main {
    public static void main(String[] args) {
        System.out.println("Mediator Design Pattern Air Traffic Control System.");
        System.out.println("Air Traffic Control System using a Mediator to control communications between different AirCrafts:\n");
        
    	ATCMediator mediator = new ATCMediatorImplementation();

        //Create a few aircrafts:
        AirCraft boeing = new AirCraftImplementation(mediator,"Boeing");
        AirCraft helicopter = new AirCraftImplementation(mediator, "Helicopter");
        AirCraft concorde = new AirCraftImplementation(mediator, "Concorde");
        AirCraft airbus = new AirCraftImplementation(mediator, "Airbus");

        //Adding aircrafts to the Mediator:
        mediator.addAirCraft(boeing);
        mediator.addAirCraft(helicopter);
        mediator.addAirCraft(concorde);
        mediator.addAirCraft(airbus);
        
        //Sending a Message from boeing Aircraft through the ATCMediator:
        System.out.println("\nAircraft Sending Message:");
        boeing.sendMessage("Hello from Boing Aircraft.");
    }
}
