public class DescuentoFijo implements Descuento{
    @Override
    public double descuento(double precio) {

        return precio - 50;
    }
}
