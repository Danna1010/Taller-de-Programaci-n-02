
package Programas;

/*
Crear un programa en java que permita entrar una cantidad.
Visualizar contar Dígitos Pares y Sumar los Dígitos Mayores que 5
 */
import java.util.Scanner;
public class Ejerciciocreado1 {
    public static void main(String[] args) {  
        //Declarar variables
        int cantidad, cdpares, sdmay5, dig;
        Scanner lectura = new Scanner(System.in);
        // Entrada de datos
        System.out.print("Ingresar una cantidad: ");
        cantidad = lectura.nextInt();
        // Proceso de datos
        cdpares = 0;
        sdmay5 = 0;
        while (cantidad > 0) {
            dig = cantidad % 10;
            if (dig % 2 == 0) {
                cdpares++; 
            }
            if (dig > 5) {
                sdmay5 += dig;
            }
            cantidad = cantidad / 10;
        }
        // Salida de datos
        System.out.println("Cantidad de dígitos pares: " + cdpares);
        System.out.println("Suma de dígitos mayores que 5: " + sdmay5);
    }
}

