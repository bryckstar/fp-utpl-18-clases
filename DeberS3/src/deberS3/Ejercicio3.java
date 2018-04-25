// Ejercicio N 3 

package deberS3;

import java.util.Scanner; // Se importa la librerria para poder ingresar datos

/**
 *
 * @author Bryan
 */
public class Ejercicio3 {
    
    // el método principal de la ejecución del programa
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int x; // El valor ingresado por el usuario
        int y; // Proceso dependiente de la variable x

        System.out.printf("Ingrese el valor de x: \n");
        x = entrada.nextInt(); // Se lee el valor de x
        
        if (x>0){ // Se inicia la condicional
            y = (3*x)+10;
        }else{
            if (x<0){
                y = (x*2)+6;
            }else{
                y = 1;
            }
        } // Se cierra la condicional
        
        System.out.printf("El valor de y es: %d\n",y); // Se presenta el valor de y
    } // Se cierra el main
} // Se cierra la clase
