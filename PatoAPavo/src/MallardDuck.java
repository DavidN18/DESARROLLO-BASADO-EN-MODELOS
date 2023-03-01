import static java.lang.System.out;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        out.println("Quack!");
    }

    @Override
    public void fly() {
        out.println("I'm flying");
    }
}
