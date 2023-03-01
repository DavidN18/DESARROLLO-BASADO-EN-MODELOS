import static java.lang.System.out;

class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        out.println("gobble gobble");
    }

    @Override
    public void fly() {
        out.println("I'm flying a short distance");
    }
}
