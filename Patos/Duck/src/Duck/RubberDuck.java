package Duck;

public class RubberDuck extends Duck {
    public RubberDuck(FlyBehavior fb, QuackBehavior qb) {
        super(fb, qb);
    }
    public void display() {
        System.out.println("I'm a Rubber duck");
    }
}
