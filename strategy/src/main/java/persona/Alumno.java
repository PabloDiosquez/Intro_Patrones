package persona;

import comparable.Comparable;

public class Alumno extends Persona{
    private int legajo;
    private double promedio;

    public Alumno(String nombre, int DNI, int legajo, double promedio){
        super(nombre, DNI);
        this.legajo = legajo;
        this.promedio = promedio;
        setEstrategiaComparacion(new EstrategiaComparacionPromedio());
    }

    public int getLegajo() {
        return legajo;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public boolean sosIgual(Comparable otro) {
        return estrategiaComparacion.sosIgual(this, (Persona) otro);
    }

    @Override
    public boolean sosMenor(Comparable otro) {
        return estrategiaComparacion.sosMenor(this, (Persona) otro);
    }

    @Override
    public boolean sosMayor(Comparable otro) {
        return estrategiaComparacion.sosMayor(this, (Persona) otro);
    }
}
