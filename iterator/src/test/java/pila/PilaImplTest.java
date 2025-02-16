package pila;

import static org.junit.Assert.*;
import org.junit.Test;

public class PilaImplTest {

    @Test
    public void testPilaRecienCreadaEstaVacia() {
        PilaImpl<Object> pila = new PilaImpl<>();
        assertTrue(pila.estaVacia());
    }

    @Test(expected = Exception.class)
    public void testVerTopeEnPilaVaciaLanzaExcepcion() throws Exception {
        PilaImpl<Object> pila = new PilaImpl<>();
        pila.verTope();
    }

    @Test(expected = Exception.class)
    public void testDesapilarEnPilaVaciaLanzaExcepcion() throws Exception {
        PilaImpl<Object> pila = new PilaImpl<>();
        pila.desapilar();
    }

    @Test
    public void testApilarUnElemento() throws Exception {
        PilaImpl<String> pila = new PilaImpl<>();
        pila.apilar("A");

        assertFalse(pila.estaVacia());
        assertEquals("A", pila.verTope());
        assertEquals("A", pila.desapilar());
        assertTrue(pila.estaVacia());
    }

    @Test
    public void testApilarMultiplesElementos() throws Exception {
        PilaImpl<Integer> pila = new PilaImpl<>();
        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);

        assertEquals(Integer.valueOf(3), pila.verTope());
        assertEquals(Integer.valueOf(3), pila.desapilar());

        assertEquals(Integer.valueOf(2), pila.verTope());
        assertEquals(Integer.valueOf(2), pila.desapilar());

        assertEquals(Integer.valueOf(1), pila.verTope());
        assertEquals(Integer.valueOf(1), pila.desapilar());

        assertTrue(pila.estaVacia());
    }

    @Test
    public void testOrdenDesapilarSigueLIFO() throws Exception {
        PilaImpl<Character> pila = new PilaImpl<>();
        pila.apilar('a');
        pila.apilar('b');
        pila.apilar('c');

        assertEquals('c', (char) pila.desapilar());
        assertEquals('b', (char) pila.desapilar());
        assertEquals('a', (char) pila.desapilar());
        assertTrue(pila.estaVacia());
    }

    @Test
    public void testApilarNull() throws Exception {
        PilaImpl<Object> pila = new PilaImpl<>();
        pila.apilar(null);

        assertFalse(pila.estaVacia());
        assertNull(pila.verTope());
        assertNull(pila.desapilar());
        assertTrue(pila.estaVacia());
    }

    @Test
    public void testOperacionesCombinadas() throws Exception {
        PilaImpl<String> pila = new PilaImpl<>();
        pila.apilar("X");
        assertEquals("X", pila.desapilar());
        assertTrue(pila.estaVacia());

        pila.apilar("Y");
        pila.apilar("Z");
        assertEquals("Z", pila.desapilar());
        assertEquals("Y", pila.verTope());
        assertEquals("Y", pila.desapilar());
        assertTrue(pila.estaVacia());
    }
}