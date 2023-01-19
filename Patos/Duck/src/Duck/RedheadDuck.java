package Duck;

public class RedheadDuck extends Duck {

    public RedheadDuck(FlyBehavior fb, QuackBehavior qb) {
        super(fb, qb);
    }
    public void display() {
        System.out.println("I'm a real Redhead duck");
    }
}