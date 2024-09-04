/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

/*
 Crear un programa en Java que permita ingresar las tres notas de un alumno.
 Visualizar el problema y su condición.
 >=12 Aprobado
 <12 Desaprobado
 */
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
       //declarar variables
       double nt1,nt2,nt3,promedio;
       String alumno,condicion;
       Scanner lectura=new Scanner (System.in);
       //entrada de datos
       System.out.print("Ingresar nombre del alumno:");
       alumno=lectura.next();
       System.out.print("Ingresar la nota 1:");
       nt1=lectura.nextInt();
       System.out.print("Ingresar la nota 2:");
       nt2=lectura.nextInt();
       System.out.print("Ingresar la nota 3:");
       nt3=lectura.nextInt();
       //proceso de datos
       promedio=(nt1+nt2+nt3)/3;
       if (promedio>12){
           condicion="Aprobado";
       }else{
           condicion="Desaprobado";
       }
       //salida de datos
       System.out.println("El promedio es:"+promedio);
       System.out.println("La condición es:"+condicion);
       }
       }//Fin del metodo  
