package persona;

import comparable.Comparable;

public class Alumno extends Persona{
    private int legajo;
    private double promedio;

    public Alumno(String nombre, int DNI, int legajo, double promedio){
        super(nombre, DNI);
        this.legajo = legajo;
        this.promedio = promedio;
    }

    public int getLegajo() {
        return legajo;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public boolean sosIgual(Comparable otro) {
        return this.getPromedio() < ((Alumno)otro).getPromedio();
    }

    @Override
    public boolean sosMenor(Comparable otro) {
        return this.getPromedio() < ((Alumno)otro).getPromedio();
    }

    @Override
    public boolean sosMayor(Comparable otro) {
        return this.getPromedio() < ((Alumno)otro).getPromedio();
    }
}
