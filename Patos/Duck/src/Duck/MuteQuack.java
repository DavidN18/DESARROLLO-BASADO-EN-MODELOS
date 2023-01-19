package Duck;
public class MuteQuack implements QuackBehavior {
    // se implementa la interfaz QuackBehavior
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
