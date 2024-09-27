
package Programas;

/**
 *
 * @author Maq
 */
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        // Declarar variables
        String nombre, mejoralumno = "", opc = "";
        int nota, n1, n2, n3, i = 0;
        double prom = 0, promax = 0;
        Scanner lectura = new Scanner(System.in);

        // Proceso de datos
        do {
            System.out.print("Ingrese el nombre del " + (i + 1) + "° alumno: ");
            nombre = lectura.next(); 
            System.out.print("Ingrese la nota 1: ");
            n1 = lectura.nextInt();
            System.out.print("Ingrese la nota 2: ");
            n2 = lectura.nextInt(); 
            System.out.print("Ingrese la nota 3: ");
            n3 = lectura.nextInt();

           
            prom = (n1 + n2 + n3) / 3.0; 
            System.out.println("El promedio es " + prom);

           
            if (prom > promax) {
                promax = prom;
                mejoralumno = nombre;
            }

            System.out.print("¿Desea continuar? [S o N]: ");
            opc = lectura.next();
            i++; 

        } while (opc.equalsIgnoreCase("S")); 

        // Salida de datos
        System.out.println("-----------------------------------");
        System.out.println(mejoralumno + " tiene el mayor promedio");
        System.out.println("Obtuvo: " + promax);
        System.out.println("-----------------------------------");
       
    }
}
