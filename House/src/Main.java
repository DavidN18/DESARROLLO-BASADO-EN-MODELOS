import java.util.Scanner;
public class Main {

    public static void main(String [] args){

        House casa = new House();
        command encenderLuces = new turnLightsOnCommand(casa);
        command apagarLuces = new turnLightsOffCommand(casa);
        command cerrarPuerta = new closeDoorCommand(casa);
        command abrirPuerta = new openDoorCommand(casa);

        menuItem btLightsOn = new menuItem("interruptor encendido",encenderLuces);
        menuItem btLightsOff = new menuItem("interruptor apagado",apagarLuces);
        menuItem btCloseDoor = new menuItem("interruptor cerrar puerta",cerrarPuerta);
        menuItem btOpenDoor = new menuItem("interruptor abrir puerta",abrirPuerta);

        Menu menu = new Menu();
        menu.addMenuItem(btLightsOn);
        menu.addMenuItem(btLightsOff);
        menu.addMenuItem(btCloseDoor);
        menu.addMenuItem(btOpenDoor);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu.print();
            int selection = scanner.nextInt();
            menu.select(selection).execute();

        }
    }
}
