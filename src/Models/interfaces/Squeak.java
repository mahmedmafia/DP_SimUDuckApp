package Models.interfaces;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeaking");

    }
}
