/*
 Crear un programa en Java que permita registrar el peso de las n personas en
un arreglo de datos. Visualizar el peso promedio de las personas.
 */
    
package Programas;
import java.util.Scanner;
public class EjercicioPropuesto1 {
    public static void main(String[] args) {
        // Declarar variables
        int i, n;
        double sp, pp;
        Scanner lectura = new Scanner(System.in);
        // Entrada
        System.out.print("Ingresar cantidad de personas: ");
        n = lectura.nextInt();
        double[] apeso = new double[n]; 

        for (i = 0; i < n; i++) {
            System.out.print("Ingresar peso de la persona " + (i + 1) + ": ");
            apeso[i] = lectura.nextDouble();
        }

        // Proceso
        sp = 0.0;  // Suma de pesos
        for (i = 0; i < n; i++) {
            sp += apeso[i];
        }
        pp = sp / n;  // Calcular promedio de pesos

        // Salida
        System.out.println("El promedio de peso es: " + pp);
    }
}

