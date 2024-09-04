/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;
/**
 Crear programa en java que permita ingresar cuatro números enteros.
 Visualizar el número mayor
 */
import java.util.Scanner;
public class Programa01 {
   public static void main(String[] args) {
       //declarar variables
       int n1, n2, n3, n4, mayor;
       Scanner lectura= new Scanner (System.in);
       //entrada de datos
       System. out.print ("Ingresar Número 1: ");
       n1=lectura.nextInt();
       System. out.print ("Ingresar Número 2: ");
       n2=lectura.nextInt();
       System. out.print ("Ingresar Número 3: ");
       n3=lectura.nextInt();
       System. out.print ("Ingresar Número 4: ");
       n4=lectura.nextInt();
       //proceso de datos
       mayor=n1;
       if (n2>mayor){
           mayor=n2;
       }
       if (n3>mayor){
           mayor=n3;
       }
       if (n4>mayor){
           mayor=n4;
       }
       //salida de datos
       System.out.println("El número mayor es: "+mayor);
       
       }//Fin del metodo
   }//fin del programa
