public class Windows implements Window{

    private String descripcion = "Ventana normal";

    @Override
    public void mostrar() {

        System.out.println("Contiene: " + descripcion);

    }
}
