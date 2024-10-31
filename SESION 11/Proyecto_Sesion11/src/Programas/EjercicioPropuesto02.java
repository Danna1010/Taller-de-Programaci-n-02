/*
Crear un programa en Java que permita registrar compras dentro de una matriz de 4x4.
Visualizar el total y el promedio de las compras.
 */
package Programas;
import java.util.Scanner;
public class EjercicioPropuesto02 {
    public static void main(String[] args) {
        //Declarar variables 
        int numero=0, f,c,cem;
        double promedio=0, suma=0;
        int[][] compras=new int [4][4];
        Scanner lectura=new Scanner (System.in);
        //Etrada de datos
        for(f=0; f<compras.length;f++){
            for(c=0;c<compras[0].length;c++){
                System.out.print("Ingrese el numero:");
                numero=lectura.nextInt();
                compras[f][c]=numero;
            }
        }
        //Proceso de datos
        suma=0.0;
         for(f=0; f<compras.length;f++){
            for(c=0;c<compras[0].length;c++){
                suma+=compras [f][c];
            }
        }
        cem=compras.length*compras[0].length;
        promedio=suma/cem;
        //Salida de datos
        System.out.println("La suma total de las compras es: "+suma);
        System.out.println("El promedio de las compras es: "+promedio);
    }    
}


