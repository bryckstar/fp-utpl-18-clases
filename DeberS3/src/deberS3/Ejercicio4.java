// Ejercicio N 4

package deberS3;
import java.util.Scanner; // Se importa la librerria para poder ingresar dato

/**
 *
 * @author Bryan
 */
public class Ejercicio4 {
    
    // el método principal de la ejecución del programa
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double descuento; // Descuento que se aplica dependiendo de la cantidad
        int cantidad; // Cantida de balones a comprar
        int precio; // Precio por cada balon
        int subtotal; // precio por cada balon multiplicado por la cantidad
        double valorFinal; // subtotal menos el desuento
        
        System.out.printf("Ingrese el precio de cada balon: \n");
        precio = entrada.nextInt(); // Se lee el precio por cada balon
        System.out.printf("Ingrese la cantidad de balones a comprar: \n");
        cantidad = entrada.nextInt(); // Se lee ls cantidad de balones a comprar
        
        // Procesos:
        subtotal = cantidad*precio; // Se calcula el subtotal
        if (cantidad==1){ // Se inicia la condicional
            descuento = (subtotal*50)/100;
        }else{
            if (cantidad==2){
                descuento = (subtotal*70)/100;
            }else{
                descuento = (subtotal*80)/100;
            }
        } // Se cierra la condicional
        valorFinal = subtotal - descuento; // Se calcula el valor final a pagar
        
        
        
        
        System.out.printf("El valor final de la compra es: %.2f$\n",valorFinal); // Se presenta el valor final
        
    } // Se cierra el main
    
} // Se cierra la clase
