package nodo;

public class Nodo<T> {
    private T dato;
    private Nodo<T> prox;

    public Nodo(T dato, Nodo<T> prox){
        this.dato = dato;
        this.prox = prox;
    }

    public Nodo(T dato){
        this(dato, null);
    }

    public T getDato() {
        return dato;
    }

    public Nodo<T> getProx() {
        return prox;
    }
}
