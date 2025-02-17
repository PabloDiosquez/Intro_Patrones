package cliente;

import cola.Cola;
import cola.ColaImpl;
import coleccionMult.ColeccionMultiple;
import coleccionable.Coleccionable;
import comparable.Comparable;
import numero.Numero;
import persona.Alumno;
import persona.Persona;
import pila.Pila;
import pila.PilaImpl;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Pila pila = new PilaImpl();
        Cola cola = new ColaImpl();

        ColeccionMultiple multiple = new ColeccionMultiple(pila, cola);

        llenar(pila, 20);
        llenar(cola, 20);

        informar(pila);
        informar(cola);

        informar(multiple);
        System.out.println();

        Pila personas = new PilaImpl();
        llenarPersonas(personas, 10);
        informar(personas);

        Cola alumnos = new ColaImpl();
        llenarAlumnos(alumnos, 10);
        informar(alumnos);
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

    public static void llenarPersonas(Coleccionable coleccionable, int len){
        for (int i = 0; i < len; i++){
            coleccionable.agregar(new Persona("###", 0));
        }
    }

    public static void llenarAlumnos(Coleccionable coleccionable, int len){
        for (int i = 0; i < len; i++){
            coleccionable.agregar(new Alumno("###", 0, 0, 0.0));
        }
    }
}
