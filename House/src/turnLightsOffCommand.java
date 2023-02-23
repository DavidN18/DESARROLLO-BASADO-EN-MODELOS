public class turnLightsOffCommand implements command{

    private final House house;

    public turnLightsOffCommand(House house) {
        this.house = house;
    }

    @Override
    public void execute() {
        house.turnLightsOff();
    }
}
