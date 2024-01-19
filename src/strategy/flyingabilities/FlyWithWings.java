package strategy.flyingabilities;

import strategy.abilityinterfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    public void fly(){
        System.out.println("I am able to fly!");
    }
}
