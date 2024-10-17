/*
Crear un programa en Java que permita almacenar cinco números en el
arreglo
a y b. Visualizar los valores del arreglo a y b en forma intercalada al arreglo c.
a[]=10 20 30 40 50
b[]=60 70 80 90 100
c[]=10 60 20 70 30 80……100
 */
package Programas;
import java.util.Scanner;
public class EjercicioPropuesto5 {
    public static void main(String[] args) {
        // Declarar variables
        int[] a = new int[5]; 
        int[] b = new int[5]; 
        int[] c = new int[10]; 
        Scanner lectura = new Scanner(System.in);
        // Entrada "a"
        System.out.println("Ingrese 5 números para el arreglo a:");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Número"+(i + 1)+":");
            a[i] = lectura.nextInt(); 
        }
        // Entrada "b"
        System.out.println("Ingrese 5 números para el arreglo b:");
        for (int i = 0; i < b.length; i++) {
            System.out.print("Número"+(i + 1)+":");
            b[i] = lectura.nextInt(); 
        }
        // Proceso 
        for (int i = 0; i < a.length; i++) {
            c[i * 2] = a[i]; 
            c[i * 2 + 1] = b[i]; 
        }
        // Salida 
        System.out.println("Arreglo c intercalado:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}

