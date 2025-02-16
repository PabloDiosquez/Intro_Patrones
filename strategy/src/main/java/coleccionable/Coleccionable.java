package coleccionable;

import comparable.Comparable;

public interface Coleccionable {
    /**
     * Describe la cantidad de elementos comparables que tiene el coleccionable.
     * */
    int cuantos();

    /**
     * Devuelve el elemento de menor valor de la colección.
     */
    Comparable minimo();

     /**
     Devuelve el elemento de mayor valor de la colección.
     */
    Comparable maximo();

    /**
     * Agrega el comparable recibido por parámetro a la colección que recibe el mensaje.
     * */
    void agregar(Comparable comparable);

    /**
     * Indica si el comparable recibido por parámetro está incluido en la colección.
     * */
    boolean contiene(Comparable comparable);
}
