package iterator;

import nodo.Nodo;
import pila.Pila;
import pila.PilaImpl;

public class IteradorPila<T> implements Iterator<T> {
    private final PilaImpl<T> pila;
    private Nodo<T> actual;

    public IteradorPila(PilaImpl<T> pila){
        this.pila = pila;
        this.actual = pila.getTope();
    }
    @Override
    public boolean hayAlgoMasParaVer() {
        return actual != null;
    }

    @Override
    public T verActual() {
        return actual.getDato();
    }

    @Override
    public void siguiente() {
        actual = actual.getProx();
    }
}