public class Singleton {

    private String url;
    private String baseDeDatos;
    private static  Singleton instanciaUnica;

    private Singleton(String url,String baseDeDatos){
        this.url = url;
        this.baseDeDatos = baseDeDatos;
    }

    public static Singleton getInstancia(String url, String baseDeDatos){

        if(instanciaUnica == null){
            System.out.println("Instancia vacia... creando una");
            instanciaUnica = new Singleton(url, baseDeDatos);
        }
        System.out.println("cerrando la instancia anterior");
        System.out.println("creado nueva instancia");
        instanciaUnica = new Singleton(url, baseDeDatos);
        return instanciaUnica;
    }

    public String getBaseDeDatos(){
        return baseDeDatos;
    }

    public String getUrl(){
        return url;
    }
}
