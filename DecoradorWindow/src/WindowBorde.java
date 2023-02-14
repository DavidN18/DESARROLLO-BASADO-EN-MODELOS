public class WindowBorde extends WindowDecorator{
    private Window windowDecorada;
    public WindowBorde(Window windowDecorada) {
        super(windowDecorada);
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Window con borde");
    }
}
