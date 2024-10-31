/*
Crear un programa en Java que permita registrar números enteros dentro de una matriz
de 3x3. Visualizar la suma de los números pares y la cantidad de los números impares.
Ejemplo:
1 2 3
4 5 6
7 8 9
Resultados:
sp:20
ci=5
 */

package Programas;
import java.util.Scanner;
public class EjercicioClase01 {
    public static void main(String[] args) {
        //Declarar variables
        int sp, ci, r, numero, c, f;
        int [][] mnumeros=new int[3][3];
        Scanner lectura=new Scanner (System.in);
        //Entrada de datos
        for (f=0;f<mnumeros.length;f++){
            for (c=0;c<mnumeros[0].length;c++){
                System.out.print("Ingresar número:");
                numero=lectura.nextInt();
                mnumeros[f][c]=numero; 
            }
        }
        //Proceso de datos
        sp=0;
        ci=0;
        for (f=0;f<mnumeros.length;f++){
            for (c=0;c<mnumeros[0].length;c++){
                r=mnumeros[f][c]%2;
                if (r == 0) {
                    sp += mnumeros[f][c];
                } else {
            }
        }
        //Salida de datos
        System.out.println("La suma de los digitos pares es:"+sp);
        System.out.println("La cantidad de los digitos impares es:"+ci);
    }    
}
