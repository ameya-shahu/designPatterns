package strategy.flyingabilities;

import strategy.abilityinterfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly!");
    }
}
