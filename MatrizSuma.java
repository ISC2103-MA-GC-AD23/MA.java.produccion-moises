import java.util.Scanner;



public class MatrizSuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tamaño de las matrices
        System.out.print("Ingrese el número de filas de las matrices: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de las matrices: ");
        int columnas = scanner.nextInt();

        // Crear matrices
        Fraccion[][] matrizA = new Fraccion[filas][columnas];
        Fraccion[][] matrizB = new Fraccion[filas][columnas];

        // Llenar matriz A
        System.out.println("Ingrese los valores de la matriz A:");
        llenarMatriz(matrizA, scanner);

        // Llenar matriz B
        System.out.println("Ingrese los valores de la matriz B:");
        llenarMatriz(matrizB, scanner);

        // Sumar las matrices
        Fraccion[][] resultado = sumarMatrices(matrizA, matrizB);

        // Mostrar resultado
        System.out.println("\nLa suma de las matrices es:");
        mostrarMatriz(resultado);
    }

    private static void llenarMatriz(Fraccion[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el numerador para la posición [" + i + "][" + j + "]: ");
                int numerador = scanner.nextInt();
                System.out.print("Ingrese el denominador para la posición [" + i + "][" + j + "]: ");
                int denominador = scanner.nextInt();
                matriz[i][j] = new Fraccion(numerador, denominador);
            }
        }
    }

    private static Fraccion[][] sumarMatrices(Fraccion[][] matrizA, Fraccion[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        Fraccion[][] resultado = new Fraccion[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matrizA[i][j].sumar(matrizB[i][j]);
            }
        }

        return resultado;
    }

    private static void mostrarMatriz(Fraccion[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
