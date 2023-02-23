public class menuItem {
    private final String name;
    private final command command;

    public menuItem(String name, command command) {
        this.name = name;
        this.command = command;
    }

    public void execute() {
        command.execute();
    }

    public String getName() {
        return name;
    }
}
