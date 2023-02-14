public class Descuento5 implements Descuento{
    @Override
    public double descuento(double precio) {

        return precio - (precio * 0.05);
    }
}
