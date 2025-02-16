package cliente;

import cola.ColaImpl;
import iterator.IteradorCola;
import iterator.Iterator;

public class Main {
    public static void main(String[] args) {
        ColaImpl<Integer> cola = new ColaImpl<>();

        cola.encolar(21);
        cola.encolar(34);
        cola.encolar(42);
        cola.encolar(19);

        Iterator<Integer> it = new IteradorCola<Integer>(cola);
        while(it.hayAlgoMasParaVer()){
            System.out.println(it.verActual());
            it.siguiente();
        }
    }
}
