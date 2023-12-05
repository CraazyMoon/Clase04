package Ejercicio1;

import java.util.Scanner;

public class ProgramaNotas {
        public static void main(String[] args) {
            
            
            
            
            
            
            
            
            
        }
        public static int ArregloNotas(){
             Scanner programa = new Scanner(System.in);
             System.out.println("Bienvenido al programa de registro de notas!\n"+
                     "Aqui podes ingresar tus notas y te dire en que estado estan :)\n"+ 
                     "Pero primero necesito que me digas cuantas notas son:");
                int longitud = programa.nextInt();
                int[] vector = new int[longitud];
                System.out.println("Vamos, vamos, ingresalas sin miedo:");
                for(int i=0; i<vector.length; i++){
                vector[i] = programa.nextInt();
                }
                System.out.println("Estas son las notas que ingresaste:");
                programa.close();
                return vector;
                
        }
        
   
        
        
        
}
