public class ChicagoPizzaStore extends PizzaStore{

    Pizza createPizza(String tipo){

        if (tipo.equals("Cheese")){
            return new chicagoStyleChessePizza();
        }else if (tipo.equals("veggie")){
            return new chicagoStyleVeggiePizza();
        } else if (tipo.equals("clam")) {
            return new chicagoStyleClamPizza();
        } else if (tipo.equals("pepperoni")) {
            return new chicagoStylePepperoniPizza();
        }else return null;

    }

}