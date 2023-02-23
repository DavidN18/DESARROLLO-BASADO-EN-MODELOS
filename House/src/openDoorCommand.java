public class openDoorCommand implements command{

    private final House house;

    public openDoorCommand(House house) {
        this.house = house;
    }
    @Override
    public void execute() {
        house.openDoor();
    }
}
