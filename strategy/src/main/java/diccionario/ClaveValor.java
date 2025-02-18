package diccionario;

import comparable.Comparable;

import java.util.Objects;

public class ClaveValor<T extends Comparable, U> {
    private T clave;
    private U valor;

    public ClaveValor(T clave, U valor){
        this.clave = clave;
        this.valor = valor;
    }
    
    public T getClave() {
        return clave;
    }

    public U getValor() {
        return valor;
    }
}
