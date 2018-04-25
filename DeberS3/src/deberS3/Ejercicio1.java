// Ejecricio N 1

package deberS3;

import  java.util.Scanner; // Se importa la librerria para poder ingresar datos

/**
 *
 * @author Bryan
 */
public class Ejercicio1 {

    // el método principal de la ejecución del programa
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int dia; // El numero de dia a ingresar
        
        System.out.printf("Ingrese el numero de dia (del 1 al 7)\n");
        dia = entrada.nextInt(); // Se ingresa el numero de dia
        
        switch(dia){ // Se inicia el switch depiente de la variable dia
            case 1:
                System.out.printf("El dia es Lunes\n"); // Se presenta el dia
                break;
            case 2:
                System.out.printf("El dia es Martes\n"); //
                break;
            case 3:
                System.out.printf("El dia es Miercoles\n"); //
                break;
            case 4:
                System.out.printf("El dia es Jueves\n"); //
                break;
            case 5:
                System.out.println("El dia es Viernes\n"); //
                break;
            case 6:
                System.out.println("El dia es Sabado\n"); //
                break;
            case 7:
                System.out.printf("El dia es Domingo\n"); //
                break;
            default:
                System.out.printf("Se ha ingresado un numero no correcto\n");  // Mensaje por si el usuario ingresa una valor no valido
        } // Se cierra el switch
        
    } // Se cierra el main
    
} // Se cierra la clase
