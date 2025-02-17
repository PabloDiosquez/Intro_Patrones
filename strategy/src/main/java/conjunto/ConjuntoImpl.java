package conjunto;

import comparable.Comparable;
import java.util.List;

/**
 * Es una colección que almacena elementos sin repetición.
 * */
public class ConjuntoImpl implements Conjunto{
    private List<Comparable> elementos;
    public void agregar(Comparable elemento){
        if(pertenece(elemento)){
            return;
        }
        elementos.add(elemento);
    }

    public boolean pertenece(Comparable elemento){
        for (Comparable elem: elementos) {
            if(elem.sosIgual(elemento)){
                return true;
            }
        }
        return false;
    }
}
