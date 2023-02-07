public class Mediano extends Size{

    Beverage beverage;

    public Mediano(Beverage beverage){

        this.beverage = beverage;
        beverage.size = "Mediano";

    }
    @Override
    public double cost() {
        return (beverage.cost()) + (beverage.cost()) * 0.5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , " + beverage.getSize();
    }
}
