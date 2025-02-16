package comparable;

public interface Comparable {
    /**
     * Indica si el objeto que recibe el mensaje es igual
     * que el comparable recibido por parámetro.
     * */
    boolean sosIgual(Comparable otro);

    /**
     * Indica si el objeto que recibe el mensaje es menor
     * que el comparable recibido por parámetro.
     * */
    boolean sosMenor(Comparable otro);

    /**
     * Indica si el objeto que recibe el mensaje es mayor
     * que el comparable recibido por parámetro.
     * */boolean sosMayor(Comparable otro);
}
