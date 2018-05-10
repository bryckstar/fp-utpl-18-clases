/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;
import java.util.Scanner;
/**
 *
 * @author Bryan
 */
public class Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String cadenaFinal;
        int suma = 0;
        int cont = 1;
        int edad = 0;
        cadenaFinal = String.format("%s\t%s\n", "Edad", "Suma");
        
        while (cont <=5){
            System.out.println("Ingrese el valor de la edad: ");
            edad = entrada.nextInt();
            suma = suma + edad;  
            cadenaFinal = String.format("%s%d\t%d\n",cadenaFinal, edad, suma);
            cont++;
        }
        
        System.out.printf("%s\n", cadenaFinal);
        
    }
    
}
