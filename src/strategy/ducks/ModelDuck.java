package strategy.ducks;

import strategy.ducks.Duck;
import strategy.flyingabilities.FlyNoWay;
import strategy.quackabilities.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("I am a model duck!");
    }
}
