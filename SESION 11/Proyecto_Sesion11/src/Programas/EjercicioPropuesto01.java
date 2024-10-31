/*
Crear un programa en Java que permita registrar ventas dentro de una matriz de 4x4.
Visualizar el total de las ventas.
 */
package Programas;
import java.util.Scanner;
public class EjercicioPropuesto01 {
    public static void main(String[] args) {
        //Declarar variables
        int f,c, suma;
        int[][] ventas = new int[4][4];
        Scanner lectura=new Scanner (System.in);
        //Entrada de datos
        for (f=0;f<ventas.length;f++){
            for (c=0;c<ventas[0].length;c++){
                System.out.print("Ingresar número:");
                ventas[f][c]=lectura.nextInt();
            }
        }
        // Proceso de datos
        suma=0;
        for(f = 0; f < ventas.length; f++) {
            for(c = 0; c < ventas[0].length; c++) {
                suma += ventas[f][c];
            }
        }

        // Salida de datos
        System.out.println("El total de las ventas es: " + suma);
    }    
}
