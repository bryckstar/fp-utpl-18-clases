// Ejercicio N 2 

package deberS3;

import java.util.Scanner; // Se importa la librerria para poder ingresar datos
/**
 *
 * @author Bryan
 */
public class Ejercicio2 {
    // el método principal de la ejecución del programa
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
    
        String nombre; // Nombre del cliente
        int tipo; // Tipo de cliente
        int cantidad; // Cantidad de celualres que compra
        int precio = 300; // Precio por cada celular
        int subtotal; // Precio por cada celular multiplicado por la cantidad
        double descuento; // Descuento asociado al tipo del cliente
        double pFinal; // Subtotal menos el descuento
        
        System.out.printf("Ingrese el nombre del cliente:\n");
        nombre = entrada.nextLine(); // Se lee el nombre del cliente
        System.out.println("Ingrese el tipo de cliente: ");
        tipo = entrada.nextInt();  // Se lee el tipo de cliente
        System.out.println("Ingrese la cantidad de celulares a comprar: ");
        cantidad = entrada.nextInt(); // Se lee la cantidad a comprar
        
        // Procesos:
        subtotal = precio*cantidad; // Se calcula el subtotal
        if (tipo==1){ // Se inicia la condicional
            descuento = (subtotal*10)/100;
        }else{
            if (tipo==2){
                descuento = (subtotal*20)/100;
            }else{
                descuento = (subtotal*30)/100;
            }
        } // Se cierra la condicional
        pFinal = subtotal-descuento;
        
        // A continuacion se presentan los datos:
        System.out.printf("Nombre: %s\n",nombre);
        System.out.printf("Tipo de Cliente: %d\n",tipo);
        System.out.printf("Cantida de Celulares: %d\n",cantidad);
        System.out.printf("Subtotal a pagar: %d\n",subtotal);       
        System.out.printf("Descuento: %.2f\n",descuento);
        System.out.printf("Valor final a pagar: %.2f\n",pFinal);
        
        
    } // Se cierra el main
    
} // Se cierra la clase
