package Duck;

public class Main {
    // Metodo principal
    public static void main(String[] args) {
        // Creando un objetos de los tipos de patos
        // y asignando el tipo de vuelo y tio de Quack
        Duck mallard = new MallardDuck(new FlyWithWings(), new Quack());
        mallard.showDuck();
        Duck redhead = new RedheadDuck(new FlyWithWings(), new Quack());
        redhead.showDuck();
        Duck rubber = new RubberDuck(new FlyNoWay(), new Squeak());
        rubber.showDuck();
        Duck decoy = new DecoyDuck(new FlyNoWay(), new MuteQuack());
        decoy.showDuck();
    }
}