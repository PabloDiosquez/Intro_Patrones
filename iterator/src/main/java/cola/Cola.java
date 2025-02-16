package cola;

public interface Cola<T> {
    void encolar(T dato);
    T desencolar() throws Exception;
    T verFrente() throws Exception;
    boolean estaVacia();
}
