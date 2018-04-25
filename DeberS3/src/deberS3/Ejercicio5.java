// Ejercicio N 5

package deberS3;

import java.util.Scanner; // Se importa la librerria para poder ingresar datos
/**
 *
 * @author Bryan
 */
public class Ejercicio5 {
    // el método principal de la ejecución del programa
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double valor; // El valor que el usuario ingresa
        double f; // Operacion para transformar a farenheit
        double c; // Operacion para transformar a celcius
        int opc; // Variable para trabajar con el switch
        String mensaje = "Ingrese el valor en "; // Mensaje que sera reutilizado
        
        System.out.printf("Ingrese 1 si desea transformar de Celcius (C) a Farenheit (F)\n");
        System.out.printf("Ingrese 2 si desea transformar de Farenheit (F) a Celcius (C)\n");
        opc = entrada.nextInt(); // Lee la opcio que el usuario escoge
        
        switch (opc){ // Se inicia el switch depiente de la variable opc
            case 1:
                System.out.printf("%s Celcius: \n",mensaje);
                valor = entrada.nextDouble(); //Lee el valor ingresado
                f = 1.8*valor+32;
                System.out.printf("%.2f\u00B0C transformado a Farenheit es: %.2f\u00B0F\n",valor,f); // Se presenta el resultado
                break;
            case 2:
                System.out.printf("%s Farenheit: \n",mensaje);
                valor = entrada.nextDouble(); //Lee el valor ingresado
                c = ((valor-32)*5/9);
                System.out.printf("%.2f\u00B0F transformado a Farenheit es: %.2f\u00B0C\n",valor,c); // Se presenta el resultado
                break;
            default:
                System.out.printf("se ha jngresado una opción no valida\n"); // Mensaje por si el usuario ingresa una opcion difernte de 1 y 2
        } // Se cierra el switch
        
    } // Se cierra el main
    
} // Se cierra la clase
