public class WindowDecorator implements Window {

    protected Window windowDecorada;

    public WindowDecorator(Window windowDecorada){

        this.windowDecorada = windowDecorada;

    }
    @Override
    public void mostrar() {

        windowDecorada.mostrar();

    }
}
