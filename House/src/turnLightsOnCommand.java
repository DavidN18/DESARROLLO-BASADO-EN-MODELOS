public class turnLightsOnCommand implements command{

    private final House house;

    public turnLightsOnCommand(House house) {
        this.house = house;
    }

    @Override
    public void execute() {
        house.turnLightsOn();
    }
}
