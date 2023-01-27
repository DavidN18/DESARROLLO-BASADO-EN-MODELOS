import java.util.ArrayList;

public interface subject {

    public void registerObserver(cliente clients_R);
    public void deleteObserver(cliente clients_D);

    public void notifyObserver(ArrayList Notificar);

}
