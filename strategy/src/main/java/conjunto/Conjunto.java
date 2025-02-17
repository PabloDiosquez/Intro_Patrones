package conjunto;

import comparable.Comparable;

public interface Conjunto {
    /**
     * Agrega el elemento al conjunto si es que éste no existe.
     * */
    void agregar(Comparable elemento);

    /**
     * Indica si el elemento recibido por parámetro está dentro del conjunto.
     * */
    boolean pertenece(Comparable elemento);
}
