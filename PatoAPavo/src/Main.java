import static java.lang.System.*;
public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Turkey PatoaPavo = new DuckAdapter(duck);

        out.println("\nThe Turkey says...");
        testTurkey(turkey);

        out.println("\nThe Duck adapter says...");
        testTurkey(PatoaPavo);
    }
    static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}

