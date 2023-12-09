import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrizSumaTest {
    @Test
    void testSumarMatrices() {
        Fraccion[][] matrizA = {
            { new Fraccion(1, 2), new Fraccion(3, 4) },
            { new Fraccion(5, 6), new Fraccion(7, 8) }
        };

        Fraccion[][] matrizB = {
            { new Fraccion(1, 3), new Fraccion(2, 5) },
            { new Fraccion(3, 7), new Fraccion(4, 9) }
        };

        Fraccion[][] expected = {
            { new Fraccion(5, 6), new Fraccion(23, 20) },
            { new Fraccion(47, 42), new Fraccion(59, 72) }
        };

        Fraccion[][] resultado = MatrizSuma.sumarMatrices(matrizA, matrizB);

        assertArrayEquals(expected, resultado);
    }
}