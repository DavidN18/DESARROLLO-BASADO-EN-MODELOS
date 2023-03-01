import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class Main {

    public static void main(String [] args){

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Lunes");
        lista.add("Martes");
        lista.add("Miercoles");
        lista.add("Jueves");
        lista.add("Viernes");

        System.out.println(lista + "\n");

        Iterator<String> iterador = lista.iterator();
        Enumeration itToEn = new Iterator_Enumeration(iterador);

        while(itToEn.hasMoreElements()){
            System.out.println(itToEn.nextElement()+ "\n");
        }

    }

}
