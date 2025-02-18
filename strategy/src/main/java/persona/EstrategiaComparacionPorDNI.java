package persona;

public class EstrategiaComparacionPorDNI implements EstrategiaComparacion{

    @Override
    public boolean sosIgual(Persona persona, Persona otra) {
        return persona.getDNI() == otra.getDNI();
    }

    @Override
    public boolean sosMenor(Persona persona, Persona otra) {
        return persona.getDNI() > otra.getDNI();
    }

    @Override
    public boolean sosMayor(Persona persona, Persona otra) {
        return persona.getDNI() < otra.getDNI();
    }
}
