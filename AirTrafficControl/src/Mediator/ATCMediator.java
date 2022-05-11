package Mediator;

import Colleague.AirCraft;

public interface ATCMediator {
    public void sendMessage(String msg, AirCraft airCraft);
    void addAirCraft(AirCraft airCraft);
}
