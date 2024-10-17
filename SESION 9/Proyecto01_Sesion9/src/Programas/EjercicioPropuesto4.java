/*
Crear un programa en Java que permita almacenar en un arreglo de datos
cinco nombres de personas ingresadas y realizar una búsqueda mediante un
nombre ingresado. Visualizar un mensaje indicando si la persona existe o no
existe y la posición del número en el arreglo de datos.
 */
package Programas;
import java.util.Scanner;
public class EjercicioPropuesto4 {
    public static void main(String[] args) {
        // Declarar variables
        int i;
        String nbus; 
        String mensaje = "El nombre no existe.";
        String[] anombres = new String[5]; 
        Scanner lectura = new Scanner(System.in);

        // Entrada
        for (i = 0; i < anombres.length; i++) {
            System.out.print("Ingresar nombre " + (i + 1) + ": ");
            anombres[i] = lectura.nextLine(); 
        }
        System.out.print("Ingresar nombre a buscar: ");
        nbus = lectura.nextLine(); 
        // Proceso
        for (i = 0; i < anombres.length; i++) {
            if (nbus.equals(anombres[i])) {
                mensaje = "El nombre existe en la posición: " + i; 
                break; 
            } 
        }
        // Salida
        System.out.println(mensaje); 
    }
}

