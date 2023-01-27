//IMPLEMENTACION DE LA CLASE CLIENTE CON LA INTERFAZ OBSERVER
public class cliente implements observer {
    //NOMBRE PARA IDENTIFICAR AL USUARIO
    private String user;

    public void setUser(String nombre){

        user = nombre;

    }

    public String getUser(){

        return user;

    }

    //EL METODO UPDATE NOTIFICA AL CLIENTE EL PRODUCTO MAS RECIENTE
    @Override
    public void update(String iphone) {
        System.out.println("El ultimo iphone es :" + iphone);
    }


}
