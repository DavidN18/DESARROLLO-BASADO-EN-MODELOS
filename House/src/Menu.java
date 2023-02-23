import java.util.ArrayList;
import java.util.List;
public class Menu {

    private final List<menuItem> menuItems = new ArrayList<>();

    public void addMenuItem(menuItem MenuItem) {
        menuItems.add(MenuItem);
    }

    public void print() {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i).getName());
        }
        System.out.print("Selection: ");
    }

    public menuItem select(int selection) {
        return menuItems.get(selection - 1);
    }

}
