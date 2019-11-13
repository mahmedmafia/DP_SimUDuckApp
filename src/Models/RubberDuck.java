package Models;

import Models.interfaces.FlyNoWay;
import Models.interfaces.MuteQuack;

public class RubberDuck extends Duck {
    public RubberDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber Duck");
    }
}
