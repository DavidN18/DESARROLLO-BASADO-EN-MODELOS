public class closeDoorCommand implements command{
    private final House house;

    public closeDoorCommand(House house) {
        this.house = house;
    }

    @Override
    public void execute() {
        house.closeDoor();
    }
}
