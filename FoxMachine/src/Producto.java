public class Producto {
    Descuento descuento;

    private final String descripcion;
    private final double precio;
    private final double precioDescuento;

    public Producto(String descripcion, double precio, Descuento descuento){

        this.descripcion = descripcion;
        this.precio = precio;
        this.descuento = descuento;
        this.precioDescuento = descuento.descuento(precio);

    }

    public String getDescripcion(){

        return descripcion;

    }

    public double getPrecio(){

        return precio;

    }

    public double getPrecioDescuento(){

        return precioDescuento;

    }
}
