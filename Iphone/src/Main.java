public class Main {
    public static void main(String[] args){

        cliente cliente1 = new cliente();
        cliente cliente2 = new cliente();
        cliente cliente3 = new cliente();
        cliente1.setUser("David");
        cliente2.setUser("Juan");
        cliente3.setUser("Samantha");

        tienda store = new tienda();
        // REGISTRO MANUAL DE LOS CLIENTES
        store.registerObserver(cliente1);

        store.registerObserver(cliente2);
        
        store.registerObserver(cliente3);
        //SE MUESTRAN LOS USUARIOS REGISTRADOS
        store.setState();
        //SE ELIMINA A EL USUARIO SAMANTHA
        //Y SE IMPRIMEN LOS USUARIOS RGISTRADOS
        System.out.println("Se elimina el usuario Samantha");
        store.deleteObserver(cliente3);
        System.out.println("---------------------");
        store.setState();
        //store.notifyObserver(store.N_clients);
        //SE AGREGA UN NUEVO PRODUCTO Y A LA VEZ SE NOTIFICA A TODOS
        System.out.println("Se agrega un nuevo producto y se notifica a todos los usuarios");
        store.newProduct("Iphone 14");
        //SE REALIZA EL UPDATE DE UN UNICO USUARIO
        System.out.println("Update de David");
        (store.N_clients.get(0)).update(store.nIphone);

    }
    

}