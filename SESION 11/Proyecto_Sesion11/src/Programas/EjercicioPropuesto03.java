/*
Crear un programa en Java que permita registrar ventas de forma aleatoria (10 - 5000)
dentro de una matriz de 4x4. Visualizar la venta mayor y menor.
 */
package Programas;
import java.util.Scanner;
public class EjercicioPropuesto03 {
    public static void main(String[] args) {
        // Declarar variables
        int f, c;
        int ventaMyr = 10; 
        int ventaMnr = 5000;  
        int[][] ventas = new int[4][4]; 
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos
        for (f = 0; f < ventas.length; f++) {
            for (c = 0; c < ventas[0].length; c++) {
                int venta;
                do {
                    System.out.print("Ingrese la venta en el rango "
                            + "de 10 a 5000 para la posición"
                            + " [" + f + "][" + c + "]: ");
                    venta = lectura.nextInt();
                } while (venta < 10 || venta > 5000);
                ventas[f][c] = venta;

                // Proceso
                if (ventas[f][c] > ventaMyr) {
                    ventaMyr = ventas[f][c];
                }
                if (ventas[f][c] < ventaMnr) {
                    ventaMnr = ventas[f][c];
                }
            }
        }

        // Salida de datos
        System.out.println("La venta mayor es: " + ventaMyr);
        System.out.println("La venta menor es: " + ventaMnr);
    }
}