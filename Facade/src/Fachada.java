public class Fachada {

    private final Avion FachadaAvion;
    private final Hotel FachadaHotel;

    public Fachada() {
        FachadaAvion = new Avion();
        FachadaHotel = new Hotel();
    }

    public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
        FachadaAvion.buscarAvion(fechaIda, fechaVuelta, origen, destino);
        FachadaHotel.buscarHotel(fechaIda, fechaVuelta, origen, destino);
    }
}
