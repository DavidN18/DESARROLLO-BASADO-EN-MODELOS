package Duck;

//subclase de la clase Duck con metodo display y constructor
public class BallonDuck extends Duck {
    public BallonDuck(FlyBehavior fb, QuackBehavior qb) {
        super(fb, qb);
    }
    public void display() {
        System.out.println("I'm a Ballon duck");
    }
}
