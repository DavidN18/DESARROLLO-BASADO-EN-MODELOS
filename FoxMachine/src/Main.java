public class Main {

    public static void main(String [] args){

        Producto producto1 = new Producto("Impresora HP",6000.00,new Descuento5());
        Producto producto2 = new Producto("Impresora DELL",7000.00,new DescuentoFijo());
        Producto producto3 = new Producto("Impresora HP",6000.00,new SocioFrecuente());
        Producto producto4 = new Producto("Impresora DELL",7000.00,new SinDescuento());

        System.out.println(producto1.getDescripcion() + ", Precio:" + producto1.getPrecio() + ", con descuento : " + producto1.getPrecioDescuento());
        System.out.println(producto2.getDescripcion() + ", Precio:" + producto2.getPrecio() + ", con descuento : " + producto2.getPrecioDescuento());
        System.out.println(producto3.getDescripcion() + ", Precio:" + producto3.getPrecio() + ", con descuento : " + producto3.getPrecioDescuento());
        System.out.println(producto4.getDescripcion() + ", Precio:" + producto4.getPrecio() + ", con descuento : " + producto4.getPrecioDescuento());
    }

}
