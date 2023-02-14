public class ScrollVertical extends WindowDecorator {
    private Window windowDecorada;
    public ScrollVertical(Window windowDecorada){
        super(windowDecorada);
    }

    public void mostrar(){

        super.mostrar();
        System.out.println("Scroll vertical");

    }


}

