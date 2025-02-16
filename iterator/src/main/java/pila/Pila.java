package pila;

public interface Pila<T> {
    void apilar(T dato);
    T desapilar() throws Exception;
    T verTope() throws Exception;
    boolean estaVacia();
}
