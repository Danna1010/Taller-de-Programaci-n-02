/*
Crear un programa en Java que permita registrar el ingreso económico de las n
personas en un arreglo de datos. Visualizar ingreso promedio, ingreso mayor de
las personas.
 */
package Programas;
import java.util.Scanner;
public class EjercicioPropuesto2 {
    public static void main(String[] args) {
        // Declarar variables
        int i, n;
        double ingreso, sumaIngresos, promedioIngreso, ingresoMayor;
        Scanner lectura = new Scanner(System.in);

        // Entrada
        System.out.print("Ingresar cantidad de personas: ");
        n = lectura.nextInt();
        double[] aingresos = new double[n]; 
        for (i = 0; i < n; i++) {
            System.out.print("Ingresar ingreso de la persona " + (i + 1) + ": ");
            ingreso = lectura.nextDouble();
            aingresos[i] = ingreso; 
        }
        // Proceso
        sumaIngresos = 0.0;
        ingresoMayor = aingresos[0];
        for (i = 0; i < n; i++) {
            sumaIngresos += aingresos[i]; 
            if (aingresos[i] > ingresoMayor) {
                ingresoMayor = aingresos[i]; 
            }
        }
        promedioIngreso = sumaIngresos / n;
        // Salida
        System.out.println("El ingreso promedio es: " + promedioIngreso);
        System.out.println("El ingreso mayor es: " + ingresoMayor);
    }
}
