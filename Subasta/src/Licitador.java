public class Licitador implements Observer {

    private String usuario;



    public Licitador(String nombre){

        usuario = nombre;

    }

    @Override
    public void update(Subject subject) {
        ObjetoSubasta objeto = (ObjetoSubasta) subject;
        System.out.println(this.usuario + ", el objeto" + objeto.getDescripcion() + "Cambio de precio a :" + objeto.getPrecio());

    }

    public void hacerOferta(ObjetoSubasta objeto, double cambio){

        objeto.setPrecio(cambio);
        objeto.notificarCambios();
    }
}
