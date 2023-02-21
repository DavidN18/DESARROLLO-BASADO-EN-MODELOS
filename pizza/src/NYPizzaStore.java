public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String tipo) {

        if (tipo.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (tipo.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (tipo.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (tipo.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;

    }
}
