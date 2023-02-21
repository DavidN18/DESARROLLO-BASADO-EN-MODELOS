public class Main {

    public static void main(String[] args){

        NYPizzaStore pizzeria1 = new NYPizzaStore();
        ChicagoPizzaStore pizzeria2 = new ChicagoPizzaStore();

        Pizza pizza = pizzeria1.createPizza("veggie");
        System.out.println(pizza.getName());

        Pizza pizza2 = pizzeria2.createPizza("clam");
        System.out.println(pizza2.getName());

    }
}
