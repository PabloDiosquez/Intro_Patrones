package conjunto;

import comparable.Comparable;
import java.util.List;

/**
 * Es una colección que almacena elementos sin repetición.
 * */
public class ConjuntoImpl implements Conjunto{
    public void agregar(Comparable elemento){
        if(pertenece(elemento)){
            return;
        }
        elementos.add(elemento);
    }
    public boolean pertenece(Comparable elemento){
        return elementos.stream().anyMatch(elem -> elem.sosIgual(elemento));
    }
    private List<Comparable> elementos;

    @Override
    public int cuantos() {
        return elementos.size();
    }

    @Override
    public Comparable minimo() {
        return elementos.stream()
                .reduce(elementos.getFirst(), (elem, otro) -> elem.sosMenor(otro) ? elem : otro);
    }

    @Override
    public Comparable maximo() {
        return elementos.stream()
                .reduce(elementos.getFirst(), (elem, otro) -> elem.sosMayor(otro) ? elem : otro);
    }
    
    @Override
    public boolean contiene(Comparable comparable) {
        return pertenece(comparable);
    }
}
