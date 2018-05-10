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
public class EjercicioFinal {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int cont = 1;
        double estatura = 0;
        
        double suma = 0;
        boolean opc = true;
        
        String cadenaFinal = String.format("%s\n", "Estatura Estudiante:");
        System.out.printf("Ingrese la estatura de los estudiantes\n");
        
        while(opc){
            System.out.printf("Ingrese la estatura numero %d\n", cont);
            estatura = entrada.nextDouble();
            if (estatura < 1.20){
                estatura = 1.20;
            }
            suma = suma + estatura;
            cadenaFinal = String.format("%s%.2f\n",cadenaFinal, estatura);
            cont++;
            
            entrada.nextLine();
            
            System.out.printf("Si desea agregar mas notas ingrese cualquier tecla, en caso contrario ingrese no\n");
            String temporal = entrada.nextLine();
            if(temporal.equals("no")){
                opc = false;
            }
        }
        double promedio = suma/(cont-1);
        System.out.printf("Reporte de Estaturas:\n");
        System.out.printf("%s\n", cadenaFinal);
        System.out.printf("Promedio de estaturas: %.2f\n",promedio);
        System.out.println("Reporte generado por Dep. Deportes");
        
    }
    
}
