package persona;

public class EstrategiaComparacionNombre implements EstrategiaComparacion{
    @Override
    public boolean sosIgual(Persona persona, Persona otra) {
        return persona.getNombre().compareTo(otra.getNombre()) == 0;
    }

    @Override
    public boolean sosMenor(Persona persona, Persona otra) {
        return persona.getNombre().compareTo(otra.getNombre()) < 0;
    }

    @Override
    public boolean sosMayor(Persona persona, Persona otra) {
        return persona.getNombre().compareTo(otra.getNombre()) > 0;
    }
}
