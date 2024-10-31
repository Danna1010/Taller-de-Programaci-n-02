/*
Crear un programa en Java que permita generar ventas aleatorias (1000-10000) y
asignar los a una matriz de datos de 3 x 3. Visualizar el total y el promedio de las ventas.
 */
package Programas;
import java.util.Scanner;
public class EjercicioPropuesto04 {
    public static void main(String[] args) {
        // Declarar variables
        int numero=0,f,c,cem;
        double promedio=0, suma=0;
        int ventaMyr = 10000; 
        int ventaMnr = 1000;  
        int[][] ventas = new int[3][3]; 
        Scanner lectura = new Scanner(System.in);
        //Etrada de datos
        for(f=0; f<ventas.length;f++){
            for(c=0;c<ventas[0].length;c++){
                System.out.print("Ingrese el numero:");
                numero=lectura.nextInt();
                ventas[f][c]=numero;
            }
        }
        //Proceso de datos
        suma=0.0;
         for(f=0; f<ventas.length;f++){
            for(c=0;c<ventas[0].length;c++){
                suma+=ventas [f][c];
            }
        }
        cem=ventas.length*ventas[0].length;
        promedio=suma/cem;
        //Salida de datos
        System.out.println("La suma total de las compras es: "+suma);
        System.out.println("El promedio de las compras es: "+promedio);
    }    
}

   
