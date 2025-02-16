package pila;

import coleccionable.Coleccionable;
import comparable.Comparable;

public interface Pila extends Coleccionable {

    /**
     * Agrega (apila) el elemento especificado en el tope de la pila.
     */
    void apilar(Comparable comparable);

    /**
     * Elimina (desapila) y retorna el elemento que se encuentra en el tope de la pila.
     *
     * @throws Exception si la pila está vacía o no se puede desapilar.
     */
    Comparable desapilar() throws Exception;

    /**
     * Retorna el elemento que se encuentra en el tope de la pila sin eliminarlo.
     *
     * @throws Exception si la pila está vacía.
     */
    Comparable verTope() throws Exception;

    /**
     * Indica si la pila no contiene elementos.
     */
    boolean estaVacia();
}

