package iterator;

import cola.Cola;
import cola.ColaImpl;
import nodo.Nodo;

public class IteradorCola<T> implements Iterator<T>{
    private ColaImpl<T> cola;
    private Nodo<T> actual;

    public IteradorCola(ColaImpl<T> cola){
        this.cola = cola;
        this.actual = cola.getFrente();
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
