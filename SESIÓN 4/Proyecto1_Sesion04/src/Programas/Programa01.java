/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

/**
 *
 * @author Maq
 */
import java.util.Scanner;
public class Programa01 {
   public static void main(String[] args) {
       //declarar variables
       double n1, n2, r;
       int opc;
       Scanner lectura=new Scanner(System.in);
       //entrada de datos
       System.out.print("Ingresar número 1:");
       n1=lectura.nextDouble();
       System.out.print("Ingresar número 2:");
       n2=lectura.nextInt();
       System.out.print("Ingresar la opción(1=suma, 2=resta, 3=mult; 4=división:");
       opc=lectura.nextInt();
       //proceso de datos
       r=0;
       switch (opc){
           case 1:r=n1+n2;break;
           case 2:r=n1-n2;break;
           case 3:r=n1*n2;break;
           case 4:r=n1/n2;break;
       }
       //salida de datos
       System.out.println("El resultado es:"+r);
    }  
}