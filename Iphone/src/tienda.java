import java.util.ArrayList;
import java.util.Iterator;

public class tienda implements subject{

    //SE CREA EL ARRAY QUE CONTENDRA A LOS CLIENTES
    ArrayList<cliente> N_clients = new ArrayList<cliente>();
    String nIphone;

    //LA REGISTRAR EL USUARIO QUE LLEGA COMO PARAMETRO
    @Override
    public void registerObserver(cliente clients_R) {

        N_clients.add(clients_R);
        System.out.println("Se regisro el cliente");
        System.out.println(clients_R.getUser());
    }
    //BORRAR AL USUARIO ESPECIFICADO
    @Override
    public void deleteObserver(cliente clients_D) {

        N_clients.remove(clients_D);
    }

    //SE NOTIFICA A LOS USUARIOS EXISTENTES RECORRIENDO EL ARREGLO
    @Override
    public void notifyObserver(ArrayList Notificar) {
        Iterator<cliente> it = N_clients.iterator();
        cliente num;
        while (it.hasNext()) {
            num = it.next();
            //System.out.println(num.update());
            System.out.print(num.getUser() + "");
            num.update(nIphone);
        }
    }
    //MUESTRA LOS USUARIOS QE ACTUALMENTE ESTAN REGISTRADOS
    public void setState() {

        Iterator<cliente> it = N_clients.iterator();
        cliente num;
        while (it.hasNext()) {
            num = it.next();
            System.out.println(num.getUser());
        }
    }

    //ACTUALIZACION DEL PRODUCTO EN LA TIENDA
    public void newProduct(String nuevo){

        nIphone = nuevo;

        notifyObserver(N_clients);

    }
}
