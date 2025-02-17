package persona;

import comparable.Comparable;

public class Persona implements Comparable {
    private String nombre;
    private int DNI;

    public Persona(String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDNI() {
        return DNI;
    }

    @Override
    public boolean sosIgual(Comparable otro) {
        return this.getDNI() == ((Persona)otro).getDNI();
    }

    @Override
    public boolean sosMenor(Comparable otro) {
        return this.getDNI() > ((Persona)otro).getDNI();
    }

    @Override
    public boolean sosMayor(Comparable otro) {
        return this.getDNI() < ((Persona)otro).getDNI();
    }
}
