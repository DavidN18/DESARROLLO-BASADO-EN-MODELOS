package Duck;

// Implementacion de la clase pato
public class Duck {
    FlyBehavior fb;
    QuackBehavior qb;

    // constructor de la clase pato
    // se aignan las instancias fb y qb
    public Duck(FlyBehavior fb, QuackBehavior qb) {
        this.fb = fb;
        this.qb = qb;
    }

    // performFly es la funcion que muestra la funcion fly() de fb
    public void performFly() {
        fb.fly();
    }
    public void performQuack() {
        qb.quack();
    }
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
    public void display() {
        System.out.println("I'm a real Duck");
    }
    public void showDuck() {
        display();
        performFly();
        performQuack();
        swim();
    }
}
