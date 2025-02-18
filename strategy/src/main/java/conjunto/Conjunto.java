package conjunto;

import coleccionable.Coleccionable;
import comparable.Comparable;

public interface Conjunto extends Coleccionable {
    /**
     * Agrega el elemento al conjunto si es que éste no existe.
     * */
    void agregar(Comparable elemento);

    /**
     * Indica si el elemento recibido por parámetro está dentro del conjunto.
     * */
    boolean pertenece(Comparable elemento);
}
