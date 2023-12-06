package Ejercicio1;

import java.util.Scanner;

public class ProgramaNotas {
        public static void main(String[] args) {
            arregloNotas();     
            
           
        }
                public static void arregloNotas(){
                    int[] array = ingresoDeNotas();
                         System.out.println("Aqui te las muestro para que checkees que fueron bien ingresadas:");
                         for(int a:array) System.out.println(a);
                         System.out.println("Tu promedio es: "+promedioDeNotas(array));
                         
                }
                     
                public static int[] ingresoDeNotas(){    
             Scanner programa = new Scanner(System.in);
             System.out.println("Bienvenido al programa de registro de notas!\n"+
                     "Aqui podes ingresar tus notas y te dire en que estado estan :)\n"+ 
                     "Pero primero necesito que ingreses cuantas notas son y luego presiones enter:");
                int longitud = programa.nextInt();
                int[] vector = new int[longitud];
                System.out.println("Vamos, vamos, ingresalas sin miedo -No olvides presionar enter entre cada nota-:");
                for(int i=0; i<vector.length; i++){
                vector[i] = programa.nextInt();
                }
                System.out.println("Gracias por ingresarlas!");
                programa.close();
                return vector;
            }
        
                public static double promedioDeNotas(int[] arreglo){
                double suma = 0;
                for(double v:arreglo) suma+=v;
                double promedio = suma / arreglo.length;
                return promedio;
                
    }
        
        
        
}
