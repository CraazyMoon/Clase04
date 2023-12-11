package Ejercicio1;

import java.util.Scanner;

public class ProgramaNotas {
    public static void main(String[] args) {
        arregloNotas();
    }

    public static void arregloNotas() {
        int[] array = ingresarNotas();
        System.out.println("Aqui te las muestro para que chequees que fueron bien ingresadas:");
        for (int a : array) System.out.println(a);

        double promedio = promediarNotas(array);
        System.out.println("Tu promedio es: " + promedio+" :)");

        if (promedio >= 6) {
            System.out.println("APROBADO, FELICIDADES!");
        } else if (tieneNotaEntre(array, 3, 6)) {
            System.out.println("A RECUPERATORIO\nUn esfuerzo mas, vos podes!");
        } else {
            System.out.println("NO APROBADO\nIntenta de nuevo.. No te rindas!");
        }
    }

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

    public static double promediarNotas(int[] arreglo) {
        double suma = 0;
        for (double a : arreglo) suma += a;
        return suma / arreglo.length;
    }
    /**
     * Esta funcion busca si hay 
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
                        // usar java.doc!!!!!!!!!!!
                
/*
En este código, se agregó una condición para verificar si el promedio es mayor o 
igual a 6 y se imprimen los mensajes correspondientes. También se agregó la función 
tieneNotaEntre para verificar si hay alguna nota entre 3 y 6, y así determinar 
si debe ir a recuperatorio. Ahora, el programa imprimirá el mensaje adecuado 
según las condiciones establecidas.

User
No lo entiendo, podrias explicarlo paso por paso?
ChatGPT
¡Claro! Vamos a revisar el código paso a paso:

arregloNotas método:

Se llama a ingresarNotas() para obtener el array de notas.
Se imprime el array de notas.
Se calcula el promedio de las notas llamando a promediarNotas(array) y se almacena en la variable promedio.
Se imprime el promedio.
Condiciones según el promedio:

Se añadió una estructura de control if-else para determinar el mensaje que se imprimirá según el valor de promedio:
Si promedio es mayor o igual a 6, imprime "APROBADO, FELICIDADES!".
Si el promedio está entre 3 y 6 y tiene alguna nota mayor a 3 y menor a 6, imprime "A RECUPERATORIO".
Si ninguna de las condiciones anteriores se cumple, imprime "NO APROBADO".
Función tieneNotaEntre:

Se agregó una función llamada tieneNotaEntre que recibe un array de notas y dos valores, min y max.
La función verifica si alguna nota en el array está entre min y max. Retorna true si encuentra al 
menos una nota en ese rango, de lo contrario, retorna false.
Entonces, en resumen, el programa ahora imprime el promedio y un mensaje específico según las 
condiciones establecidas en el enunciado. Si tienes alguna pregunta específica sobre alguna parte
del código, estaré encantado de ayudarte a aclararla.
*/        
        

