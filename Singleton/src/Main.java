public class Main {

    public static void main(String [] args){

        Singleton b1 = Singleton.getInstancia("url1", "base 1");
        System.out.println(b1.getBaseDeDatos());
        System.out.println(b1.getUrl());

        Singleton b2 = Singleton.getInstancia("url2", "base 2");
        System.out.println(b2.getBaseDeDatos());
        System.out.println(b2.getUrl());
    }

}
