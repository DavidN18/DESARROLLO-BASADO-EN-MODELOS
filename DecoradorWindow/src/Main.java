public class Main {

    public static void main(String [] args){

        System.out.println("Ventana nueva");
        System.out.println("--------------------------");
        Window win = new Windows();
        win.mostrar();
        System.out.println("--------------------------");
        System.out.println("Scroll vertical");
        System.out.println("--------------------------");
        win = new ScrollVertical(win);
        win.mostrar();
        System.out.println("--------------------------");
        System.out.println("Scroll horizontal y borde");
        System.out.println("--------------------------");
        win = new ScrollHorizontal(win);
        win = new WindowBorde(win);
        win.mostrar();
        System.out.println("--------------------------");

    }

}
