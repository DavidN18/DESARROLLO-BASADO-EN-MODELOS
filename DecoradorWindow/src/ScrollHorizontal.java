public class ScrollHorizontal extends WindowDecorator{

    private Window windowDecorada;
    public ScrollHorizontal(Window windowDecorada) {
        super(windowDecorada);
    }

    public void mostrar() {
        super.mostrar();
        System.out.println(" Scroll Horizontal");
    }
}
