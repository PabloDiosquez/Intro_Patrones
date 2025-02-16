package cola;
import iterator.IteradorCola;
import nodo.Nodo;

import iterator.Iterable;
import iterator.Iterator;

public class ColaImpl<T> implements Cola<T>, Iterable<T> {
    private Nodo<T> frente;
    private Nodo<T> ultimo;

    public ColaImpl() {
        this.frente = null;
        this.ultimo = null;
    }
    @Override
    public void encolar(T dato) {
        Nodo<T> nuevo = new Nodo<T>(dato);
        if(frente == null){
            frente = nuevo;
        } else {
            ultimo.setProx(nuevo);
        }
        ultimo = nuevo;
    }

    @Override
    public T desencolar() throws Exception {
        if(frente == null){
            throw new Exception("Cola vacía");
        }
        T dato = frente.getDato();
        frente = frente.getProx();
        if(frente == null){
            ultimo = null;
        }
        return dato;
    }

    @Override
    public T verFrente() throws Exception {
        if(frente == null){
            throw new Exception("Cola vacía");
        }
        return frente.getDato();
    }

    @Override
    public boolean estaVacia() {
        return frente == null;
    }

    @Override
    public Iterator<T> crearIterador() {
        return new IteradorCola<T>(this);
    }

    public Nodo<T> getFrente() {
        return frente;
    }
}
