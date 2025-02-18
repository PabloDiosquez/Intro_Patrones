package persona;

import comparable.Comparable;

public class Persona implements Comparable {
    private String nombre;
    private int DNI;

    protected EstrategiaComparacion estrategiaComparacion;

    public Persona(String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        estrategiaComparacion = new EstrategiaComparacionPorDNI();
    }
    public String getNombre() {
        return nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setEstrategiaComparacion(EstrategiaComparacion estrategiaComparacion){
        this.estrategiaComparacion = estrategiaComparacion;
    }

    @Override
    public boolean sosIgual(Comparable otro) {
        return estrategiaComparacion.sosIgual(this, (Persona)otro);
    }

    @Override
    public boolean sosMenor(Comparable otro) {
        return estrategiaComparacion.sosMenor(this, (Persona)otro);
    }

    @Override
    public boolean sosMayor(Comparable otro) {
        return estrategiaComparacion.sosMayor(this, (Persona)otro);
    }
}
