package strategy.flyingabilities;

import strategy.abilityinterfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I am flying with a rocket!");
    }
}
