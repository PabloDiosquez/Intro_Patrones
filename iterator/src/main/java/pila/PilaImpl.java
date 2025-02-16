package pila;

import nodo.Nodo;

public class PilaImple<T> implements Pila<T>{
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
}
