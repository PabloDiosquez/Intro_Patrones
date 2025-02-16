package pila;

import iterator.Iterable;
import iterator.IteradorPila;
import iterator.Iterator;
import nodo.Nodo;

public class PilaImpl<T> implements Pila<T>, Iterable<T> {
    private Nodo<T> tope;

    @Override
    public void apilar(T dato) {
        tope = new Nodo<T>(dato, tope);
    }

    @Override
    public T desapilar() throws Exception {
        if(tope == null){
            throw new Exception("Pila vacía");
        }
        T dato = tope .getDato();
        tope = tope.getProx();
        return dato;
    }

    @Override
    public T verTope() throws Exception {
        if(tope == null){
            throw new Exception("Pila vacía");
        }
        return tope.getDato();
    }

    @Override
    public boolean estaVacia() {
        return tope == null;
    }

    public Nodo<T> getTope() {
        return tope;
    }

    @Override
    public Iterator<T> crearIterador() {
        return new IteradorPila<T>(this);
    }
}
