import java.util.ArrayList;
import java.util.List;

public class ObjetoSubasta implements Subject {

    private double precio;
    private String descripcion;
    private List<Licitador> licitadores = new ArrayList<>();

    public ObjetoSubasta(String descripcion, double precio){

        this.descripcion = descripcion;
        this.precio = precio;
    }
    @Override
    public void registrarLicitador(Licitador licitador) {

        licitadores.add(licitador);
    }

    @Override
    public void removerLicitador(Licitador licitador) {

        licitadores.remove(licitador);

    }

    @Override
    public void notificarCambios() {

        for(Licitador licitador : licitadores ){

            licitador.update(this);

        }

    }

    public String getDescripcion(){

        return descripcion;

    }

    public Double getPrecio(){

        return precio;

    }

    public void setPrecio(double precio){

        this.precio = precio;

    }
}
