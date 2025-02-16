package cola;

import org.junit.Test;

import static org.junit.Assert.*;

public class ColaImplTest {

    @Test
    public void testColaRecienCreadaEstaVacia() {
        ColaImpl<Object> cola = new ColaImpl<>();
        assertTrue(cola.estaVacia());
    }

    @Test(expected = Exception.class)
    public void testVerFrenteEnColaVaciaLanzaExcepcion() throws Exception {
        ColaImpl<Object> cola = new ColaImpl<>();
        cola.verFrente();
    }

    @Test(expected = Exception.class)
    public void testDesencolarEnColaVaciaLanzaExcepcion() throws Exception {
        ColaImpl<Object> cola = new ColaImpl<>();
        cola.desencolar();
    }

    @Test
    public void testEncolarUnElemento() throws Exception {
        ColaImpl<String> cola = new ColaImpl<>();
        cola.encolar("A");

        assertFalse(cola.estaVacia());
        assertEquals("A", cola.verFrente());
        assertEquals("A", cola.desencolar());
        assertTrue(cola.estaVacia());
    }

    @Test
    public void testEncolarMultiplesElementos() throws Exception {
        ColaImpl<Integer> cola = new ColaImpl<>();
        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(3);

        assertEquals(Integer.valueOf(1), cola.verFrente());
        assertEquals(Integer.valueOf(1), cola.desencolar());

        assertEquals(Integer.valueOf(2), cola.verFrente());
        assertEquals(Integer.valueOf(2), cola.desencolar());

        assertEquals(Integer.valueOf(3), cola.verFrente());
        assertEquals(Integer.valueOf(3), cola.desencolar());

        assertTrue(cola.estaVacia());
    }

    @Test
    public void testOrdenDesencolarSigueFIFO() throws Exception {
        ColaImpl<Character> cola = new ColaImpl<>();
        cola.encolar('a');
        cola.encolar('b');
        cola.encolar('c');

        assertEquals('a', (char) cola.desencolar());
        assertEquals('b', (char) cola.desencolar());
        assertEquals('c', (char) cola.desencolar());
        assertTrue(cola.estaVacia());
    }

    @Test
    public void testEncolarNull() throws Exception {
        ColaImpl<Object> cola = new ColaImpl<>();
        cola.encolar(null);

        assertFalse(cola.estaVacia());
        assertNull(cola.verFrente());
        assertNull(cola.desencolar());
        assertTrue(cola.estaVacia());
    }

    @Test
    public void testDesencolarHastaVaciarCola() throws Exception {
        ColaImpl<String> cola = new ColaImpl<>();
        cola.encolar("Primero");
        cola.encolar("Segundo");

        cola.desencolar();
        assertFalse(cola.estaVacia());

        cola.desencolar();
        assertTrue(cola.estaVacia());
        // Verificar que ambos punteros se resetearon
        assertNull(cola.getFrente());
    }

    @Test
    public void testOperacionesCombinadas() throws Exception {
        ColaImpl<String> cola = new ColaImpl<>();
        cola.encolar("Inicio");
        assertEquals("Inicio", cola.desencolar());
        assertTrue(cola.estaVacia());

        cola.encolar("A");
        cola.encolar("B");
        cola.encolar("C");

        assertEquals("A", cola.desencolar());
        assertEquals("B", cola.verFrente());
        assertEquals("B", cola.desencolar());
        assertEquals("C", cola.desencolar());
        assertTrue(cola.estaVacia());
    }
}