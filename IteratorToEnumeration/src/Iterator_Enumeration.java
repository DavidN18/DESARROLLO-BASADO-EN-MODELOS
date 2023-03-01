import java.util.Enumeration;
import java.util.Iterator;
public class Iterator_Enumeration implements Enumeration {
    Iterator i;
    public Iterator_Enumeration(Iterator i){

        this.i = i;

    }
    @Override
    public boolean hasMoreElements() {
        return i.hasNext();
    }

    @Override
    public Object nextElement() {
        return i.next();
    }
}
