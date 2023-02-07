public class Chico extends Size{

    Beverage beverage;
    public Chico(Beverage beverage){

        this.beverage = beverage;
        beverage.size = "Chico";

    }
    @Override
    public double cost() {
        return beverage.cost();
    }



    @Override
    public String getDescription() {
        return beverage.getDescription() + " , " + beverage.getSize();
    }
}
