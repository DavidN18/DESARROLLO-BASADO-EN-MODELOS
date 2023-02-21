public abstract class PizzaStore {

    abstract Pizza createPizza(String tipo);

    public Pizza orderPizza(String tipoPizza){

        Pizza pizza = createPizza(tipoPizza);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }
}
