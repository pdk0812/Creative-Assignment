package ConcreteColleague;

import Colleague.AirCraft;
import Mediator.ATCMediator;

public class AirCraftImplementation extends AirCraft {

    public AirCraftImplementation (ATCMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("\t" + this.name + " : Sending Message:\t" + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receiveMessage(String msg) { System.out.println("\t" + this.name + " : Received Message:\t"+msg); }
}
