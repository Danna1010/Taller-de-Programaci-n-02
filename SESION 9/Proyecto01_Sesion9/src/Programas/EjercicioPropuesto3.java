/*
Crear un programa en Java que permita registrar las compras de los n
personas en un arreglo de datos. Visualizar el total, promedio y compra mayor y
menor.
 */
package programas;
import java.util.Scanner;
public class EjercicioPropuesto3 {
    public static void main(String[] args) {
        // Declarar variables
        int i, n;
        double compra, sumaCompras, compraMayor, compraMenor, promedioCompras;
        Scanner lectura = new Scanner(System.in);
        // Entrada
        System.out.print("Ingresar el número de personas: ");
        n = lectura.nextInt();
        double[] compras = new double[n]; 
        for (i = 0; i < n; i++) {
            System.out.print("Ingrese la compra de la persona"+(i+1)+":");
            compra = lectura.nextDouble();
            compras[i] = compra;
        }
        // Proceso
        sumaCompras = 0.0;
        compraMayor = compras[0]; 
        compraMenor = compras[0]; 
        for (i = 0; i < n; i++) {
            sumaCompras += compras[i]; 
            if (compras[i] > compraMayor) {
                compraMayor = compras[i]; 
            }
            if (compras[i] < compraMenor) {
                compraMenor = compras[i];
            }
        }
        promedioCompras = sumaCompras / n; 
        // Salida
        System.out.println("El total de las compras es: " + sumaCompras);
        System.out.println("El promedio de las compras es: " + promedioCompras);
        System.out.println("La compra mayor es: " + compraMayor);
        System.out.println("La compra menor es: " + compraMenor);
    }
}

