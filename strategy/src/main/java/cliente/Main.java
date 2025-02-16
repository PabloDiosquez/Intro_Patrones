package cliente;

import cola.Cola;
import cola.ColaImpl;
import coleccionable.Coleccionable;
import comparable.Comparable;
import numero.Numero;
import pila.Pila;
import pila.PilaImpl;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Pila pila = new PilaImpl();
        Cola cola = new ColaImpl();

        llenar(pila, 20);
        llenar(cola, 20);

        informar(pila);
        informar(cola);
    }

    public static void llenar(Coleccionable coleccionable, int len){
        for (int i = 0; i < len; i++){
            Comparable comparable = new Numero(new Random().nextInt(1000));
            coleccionable.agregar(comparable);
        }
    }

    public static void informar(Coleccionable coleccionable){
        StringBuilder sb = new StringBuilder();
        sb.append("Cuántos? %d".formatted(coleccionable.cuantos()));
        sb.append("Mínimo: %s".formatted(coleccionable.minimo()));
        sb.append("Máximo: %s".formatted(coleccionable.maximo()));
    }
}
