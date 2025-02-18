package persona;

public interface EstrategiaComparacion {
    boolean sosIgual(Persona persona, Persona otra);
    boolean sosMenor(Persona persona, Persona otra);
    boolean sosMayor(Persona persona, Persona otra);
}
