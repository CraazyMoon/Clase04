package Ejercicio2;

import java.util.Scanner;

public class ProgramaGolosinas {

    public static void main(String[] args) {
        
        maquinaDeGolosinas();
        
        
        
        
        
    }
    
    public static void maquinaDeGolosinas(){
        Scanner programa = new Scanner(System.in);
        int eleccion;
        do{
        System.out.println("Bienvenido a la maquina de golosinas\nAqui "
                + "encontraras 4 opciones para comprar, pero ten cuidado y "
                + "corrobora que tienes el dinero exacto para depositarme!\n"
                + "Que empiece el juego >:D");
        
        System.out.println("Las opciones seran las siguientes:\n"
                + "$150 = Mogul\n"
                + "$245 = Alfajor Jorgito\n"
                + "$250 = Pitusas\n"
                + "$300 = M&M\n"
                + "$260 = Kitkat\n"
                + "$290 = Stickles\n"
                + "Porfavor escribe el precio de la golosina que quieras y deposita el dinero correspondiente :)");
        
                while (true) {
                if (programa.hasNextInt()) {
                    eleccion = programa.nextInt();
                    if (eleccion >= 0 && eleccion <= 999) {
                        break;
                    } else {
                        System.out.println("Debes ingresar un número de tres dígitos válido.");
                    }
                } else {
                    System.out.println("Debes ingresar un número de tres dígitos válido.");
                    programa.next();
                }
            }

        switch(eleccion){
            case 150: System.out.println("Elegiste un rico Mogul! Debes abonar = $150"); break;
            case 245: System.out.println("Elegiste un rico Alfajor Jorgito! Debes abonar = $245"); break;
            case 250: System.out.println("Elegiste unas ricas Pitusas! Debes abonar = $250"); break;
            case 300: System.out.println("Elegiste unos ricos M&M! Debes abonar = $300"); break;
            case 260: System.out.println("Elegiste un rico Kitkat! Debes abonar = $260"); break;
            case 290: System.out.println("Elegiste unos ricos Stickles! Debes abonar = $300"); break;
            default: System.out.println("Debes elegir una de las opciones!");
            }
        
            System.out.println("Quieres elegir otra cosa? (Si/No): ");
            String respuesta = programa.next();

            if (!respuesta.equalsIgnoreCase("Si")) {
                break;
            }

        } while (true);
    }
//
//    public static int contarVuelto() {
//    int [] valorDeBilletes = {100,50,20,10,5,2,1};
//    int [] cantidadDeBilletes = new int [valorDeBilletes.length()];
//            
//            
//    
//    }
//    
    
    
}
