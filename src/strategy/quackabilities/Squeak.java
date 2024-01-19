package strategy.quackabilities;

import strategy.abilityinterfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
