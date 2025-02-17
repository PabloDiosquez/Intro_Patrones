package coleccionMult;

import cola.Cola;
import coleccionable.Coleccionable;
import comparable.Comparable;
import pila.Pila;

public class ColeccionMultiple implements Coleccionable {
    Pila pila;
    Cola cola;

    public ColeccionMultiple(Pila pila, Cola cola){
        this.pila = pila;
        this.cola = cola;
    }

    @Override
    public int cuantos() {
        return pila.cuantos() + cola.cuantos();
    }

    @Override
    public Comparable minimo() {
        return (pila.minimo().sosMenor(cola.minimo())) ? pila.minimo() : cola.minimo();
    }

    @Override
    public Comparable maximo() {
        return (pila.maximo().sosMayor(cola.maximo())) ? pila.maximo() : cola.maximo();
    }

    @Override
    public void agregar(Comparable comparable) {}

    @Override
    public boolean contiene(Comparable comparable) {
        return pila.contiene(comparable) || cola.contiene(comparable);
    }
}
