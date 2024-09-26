
package Programas;

/**
 Calcular el Producto de los Dígitos
 */
import java.util.Scanner;
public class Ejerciciocreado2 {
    public static void main(String[] args) {
        // Declarar variables
        int cantidad, producto = 1, dig;
        Scanner lectura = new Scanner(System.in);
        // Entrada de datos
        System.out.print("Ingresar una cantidad: ");
        cantidad = lectura.nextInt();
        // Proceso de datos
        while (cantidad > 0) {
            
            dig = cantidad % 10; 
            producto *= dig; 
            cantidad = cantidad / 10;
        }
        // Salida de datos
        System.out.println("El producto de los dígitos es: " + producto);
    }
}


