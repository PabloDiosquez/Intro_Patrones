package persona;

public class EstrategiaComparacionPromedio implements EstrategiaComparacion{
    @Override
    public boolean sosIgual(Persona persona, Persona otra) {
        return ((Alumno)persona).getPromedio() == ((Alumno)otra).getPromedio();
    }

    @Override
    public boolean sosMenor(Persona persona, Persona otra) {
        return ((Alumno)persona).getPromedio() < ((Alumno)otra).getPromedio();
    }

    @Override
    public boolean sosMayor(Persona persona, Persona otra) {
        return ((Alumno)persona).getPromedio() > ((Alumno)otra).getPromedio();
    }
}
