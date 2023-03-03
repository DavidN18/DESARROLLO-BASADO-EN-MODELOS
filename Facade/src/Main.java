public class Main {

    public static void main(String [] args){

        Fachada cliente1 = new Fachada();
        cliente1.buscar("14-02-2023","6-4-2023","Puebla","Guadalajara");

        Fachada cliente2 = new Fachada();
        cliente2.buscar("7-6-2023","21-7-2023","Puebla","España");
    }

}
