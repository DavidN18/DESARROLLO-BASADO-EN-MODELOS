package Duck;


// implementacio de MallardDuck
public class MallardDuck extends Duck {
    public MallardDuck(FlyBehavior fb, QuackBehavior qb) {
        super(fb, qb);
    }
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}