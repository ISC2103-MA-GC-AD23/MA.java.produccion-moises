import java.util.Scanner;



public class MatrizSuma {
    static int seleccion = -1; //opción elegida del usuario
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu();
    }

    private static void Menu(){
        while(seleccion != 0){
			//Try catch para evitar que el programa termine si hay un error
			try{

                System.out.println("Elige una opción: \n1.- Suma de matrices \n2.- Suma de fracciones \n3.- Multiplicación de fracciones \n4.- Multiplicación de matrices \n0.- Salir");
				//Recoger una variable por consola
				seleccion = entrada.nextInt();
	
				//Ejemplo de switch case en Java
				switch(seleccion){
				case 1: 
					SumaMatrices();
                    break;
				case 2: 
					SumaFracciones();
                    break;
				case 3: 
					MultiplicarFracciones();
                    break;
				case 4: 
					
                    break;
				case 0: 
                    System.out.println("==========================");
                    System.out.println("Gracias, vuelva pronto.");
                    System.out.println("==========================");
                    break;
				default:
					System.out.println("Número no reconocido");
                    break;
				}
				
				System.out.println("\n"); 
				
			}catch(Exception e){
				System.out.println("Uoop! Error!");
			}
		}
    }

    private static void MultiplicarFracciones(){
        Scanner scanner = new Scanner(System.in);
        // Tamaño de las matrices
        System.out.print("Ingrese el numerador de la primera fracción: ");
        int numerador1 = scanner.nextInt();
        System.out.print("Ingrese el denominador de la primera fracción: ");
        int denominador1 = scanner.nextInt();
        System.out.print("Ingrese el numerador de la segunda fracción: ");
        int numerador2 = scanner.nextInt();
        System.out.print("Ingrese el denominador de la segunda fracción: ");
        int denominador2 = scanner.nextInt();

        // Crear matrices
        Fraccion fraccion1 = new Fraccion(numerador1, denominador1);
        Fraccion fraccion2 = new Fraccion(numerador2, denominador2);

        // Sumar las matrices
        Fraccion resultado = fraccion1.Multiplicar(fraccion2);

        // Mostrar resultado
        System.out.println("\nLa multiplicacion de las matrices es:");
        System.out.println(resultado);
    }

    private static void SumaFracciones(){
        Scanner scanner = new Scanner(System.in);
        // Tamaño de las matrices
        System.out.print("Ingrese el numerador de la primera fracción: ");
        int numerador1 = scanner.nextInt();
        System.out.print("Ingrese el denominador de la primera fracción: ");
        int denominador1 = scanner.nextInt();
        System.out.print("Ingrese el numerador de la segunda fracción: ");
        int numerador2 = scanner.nextInt();
        System.out.print("Ingrese el denominador de la segunda fracción: ");
        int denominador2 = scanner.nextInt();

        // Crear matrices
        Fraccion fraccion1 = new Fraccion(numerador1, denominador1);
        Fraccion fraccion2 = new Fraccion(numerador2, denominador2);

        // Sumar las matrices
        Fraccion resultado = fraccion1.sumar(fraccion2);

        // Mostrar resultado
        System.out.println("\nLa suma de las fracciones es:");
        System.out.println(resultado);
    }

    private static void SumaMatrices(){
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
