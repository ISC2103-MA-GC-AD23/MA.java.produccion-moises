package calculadora.src.main.java.calculadora.fracciones;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;


public class AppTest {
    static Fraccion fraccion1;

    @BeforeAll 
    static void setUp() {
        fraccion1 = new Fraccion(1, 2);
    }

    @Test
    void testSumar() {
        Fraccion fraccion2 = new Fraccion(1, 2);
        Fraccion resultado = fraccion1.sumar(fraccion2);
        assertEquals(1, resultado.getNumerador());
        assertEquals(1, resultado.getDenominador());
    }

    @Test
    void testSumar2() {
        Fraccion fraccion2 = new Fraccion(1, 3);
        Fraccion resultado = fraccion1.sumar(fraccion2);
        assertEquals(5, resultado.getNumerador());
        assertEquals(6, resultado.getDenominador());
    }

    @Test
    void testMultiplicar() {
        Fraccion fraccion2 = new Fraccion(1, 2);
        Fraccion resultado = fraccion1.Multiplicar(fraccion2);
        assertEquals(1, resultado.getNumerador());
        assertEquals(4, resultado.getDenominador());
    }



}
