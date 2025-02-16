package cola;

import coleccionable.Coleccionable;
import comparable.Comparable;

public interface Cola extends Coleccionable {

    /**
     * Agrega (encola) el elemento especificado al final de la cola.
     */
    void encolar(Coleccionable coleccionable);

    /**
     * Elimina (desencola) y retorna el elemento que se encuentra al inicio de la cola.
     *
     * @throws Exception si la cola está vacía o no se puede desencolar.
     */
    Comparable desencolar() throws Exception;

    /**
     * Retorna el primer elemento de la cola sin eliminarlo.
     *
     * @throws Exception si la cola está vacía.
     */
    Comparable verPrimero() throws Exception;

    /**
     * Indica si la cola no contiene elementos.
     */
    boolean estaVacia();
}