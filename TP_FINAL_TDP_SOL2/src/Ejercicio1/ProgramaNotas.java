package Ejercicio1;

import java.util.Scanner;

public class ProgramaNotas {
    public static void main(String[] args) {
        arregloNotas();
    }
    /**
     * Este arreglo sirve para resolver el Ejercicio 1
     */
    public static void arregloNotas() {
        int[] array = ingresarNotas();
        System.out.println("Aqui te las muestro para que chequees que fueron bien ingresadas:");
        for (int a : array) System.out.println(a);

        double promedio = promediarNotas(array);
        double promedioRedondeado = Math.round(promedio * 10.0) / 10.0;
            System.out.println("Tu promedio es: " + promedioRedondeado + " :)");

        if (promedioRedondeado >= 6) {
            System.out.println("APROBADO, FELICIDADES!");
        } else if (tieneNotaEntre(array, 3, 6)) {
            System.out.println("A RECUPERATORIO\nUn esfuerzo mas, vos podes!");
        } else {
            System.out.println("NO APROBADO\nIntenta de nuevo.. No te rindas!");
        }
    }
    
    /**
     * Esta funcion le pide al usuario que ingrese la cantidad de notas y las 
     * notas a promediar y las muestra por consola.
     * @return 
     */
    public static int[] ingresarNotas() {
        Scanner programa = new Scanner(System.in);
        System.out.println("Bienvenido al programa de registro de notas!\n" +
                "Aqui podes ingresar tus notas y te dire en que estado estan :)\n" +
                "Pero primero necesito que ingreses cuantas notas son y luego presiones enter:");
        int longitud = programa.nextInt();
        int[] vector = new int[longitud];
        System.out.println("Vamos, vamos, ingresa tus notas sin miedo"
                + "-No olvides presionar enter entre cada nota-:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = programa.nextInt();
        }
        System.out.println("Gracias por ingresarlas!");
        return vector;
    }
    /**
     * Esta funcion encuentra el promedio de las notas ingresadas.
     * @param arreglo
     * @return 
     */
    public static double promediarNotas(int[] arreglo) {
        double suma = 0;
        for (double a : arreglo) suma += a;
        return suma / arreglo.length;
    }
    /**
     * Esta funcion verifica si alguna nota en el array está entre el min y max
     * pedido.
     * @param arreglo
     * @param min
     * @param max
     * @return 
     */
    public static boolean tieneNotaEntre(int[] arreglo, int min, int max) {
        for (int nota : arreglo) {
            if (nota > min && nota < max) {
                return true;
            }
        }
        return false;
    }
}