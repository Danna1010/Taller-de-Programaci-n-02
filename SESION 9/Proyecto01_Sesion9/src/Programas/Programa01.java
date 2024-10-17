/*
 Crear un programa en Java que permita registrar las edades de los n alumnos en
un arreglo de datos. Visualizar la edad promedio.
Por ejemplo:
n=5
edad1=18
edad2=18
edad3=42
edad4=24
edad5=35
Resultados:
pe=27.4
 */
package Programas;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[]args){
        //Declarar variables
        int i,n,edad;
        double se,pe;
        Scanner lectura=new Scanner (System.in);
        //Entrada
        System.out.print("Ingresar cantidad de alumnos:");
        n=lectura.nextInt();
        int [] aedad=new int [n];
        for (i=0;i<n;i++){
            System.out.print("Ingresar edad"+(i+1)+":");
            edad=lectura.nextInt();
            aedad[i]=edad;
        }
        //Proceso
        se=0.0;
        pe=0.0;
        for (i=0;i<n;i++){
              se+=aedad[i];
        }
        pe=se/n;
        //Salida
        System.out.println("El promedio de edad es:"+pe);
    } 
}
