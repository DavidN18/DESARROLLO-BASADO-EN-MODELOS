public class SocioFrecuente implements  Descuento{
    @Override
    public double descuento(double precio) {

        return precio - (precio * 0.15);
    }
}
