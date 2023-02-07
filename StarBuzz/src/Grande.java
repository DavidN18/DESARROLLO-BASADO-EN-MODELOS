public class Grande extends Size{
    Beverage beverage;
    public Grande(Beverage beverage){

        this.beverage = beverage;
        beverage.size = "Grande";

    }
    @Override
    public double cost() {
        return (beverage.cost())*2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , " + beverage.getSize();
    }
}
