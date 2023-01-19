package Duck;

//subclase de la clase Duck con metodo display y constructor
public class DecoyDuck extends Duck {
    public DecoyDuck(FlyBehavior fb, QuackBehavior qb) {
        super(fb, qb);
    }
    public void display() {
        System.out.println("I'm a simple Decoy duck");
    }
}