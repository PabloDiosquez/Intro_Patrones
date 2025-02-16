package cola;

import iterator.Iterable;
import iterator.Iterator;

public class ColaImpl<T> implements Cola<T>, Iterable<T> {
    @Override
    public void encolar(T dato) {

    }

    @Override
    public T desencolar() throws Exception {
        return null;
    }

    @Override
    public T verFrente() throws Exception {
        return null;
    }

    @Override
    public boolean estaVacia() {
        return false;
    }

    @Override
    public Iterator<T> crearIterador() {
        return null;
    }
}
