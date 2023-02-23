public class House {

    private boolean lightsOn = false;
    private boolean doorOpen = false;

    public void turnLightsOn(){
        if(!lightsOn) {
            lightsOn = true;
            System.out.println("Luces encendidas");
        }
    }

    public void turnLightsOff(){
        if (lightsOn) {
            lightsOn = false;
            System.out.println("Luces apagadas");
        }
    }

    public void openDoor() {
        if (!doorOpen) {
            doorOpen = true;
            System.out.println("Puerta abierta");
        }
    }

    public void closeDoor(){
        if (doorOpen) {
            doorOpen = false;
            System.out.println("Puerta cerrada");
        }
    }


}
