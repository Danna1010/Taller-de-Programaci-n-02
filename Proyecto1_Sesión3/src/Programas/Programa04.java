/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

/*
 Crear un programa que permita ingresar tres números de mayor a menor
 Visualizar el orden
 */
import java.util.Scanner;
public class Programa04 {
    public static void main(String[] args) {
       //declarar variables
       int n1, n2, n3;
       Scanner lectura=new Scanner(System.in);
       //entrada de datos
       System.out.print("Ingresar Numero 1:");
       n1=lectura.nextInt();
       System.out.print("Ingresar Numero 2:");
       n2=lectura.nextInt();
       System.out.print("Ingresar Numero 3:");
       n3=lectura.nextInt();
       //proceso de datos
       if(n1 < n2){
           int temp =n1;
           n1=n2;
           n2=temp;
       }
       if (n1 < n3){
           int temp = n1;
           n1 = n3;
           n3 = temp;
       }
       if (n2 < n3){
           int temp = n2;
           n2 = n3;
           n3 =temp;
       }
       //salida de datos
       System.out.println("Números ordenados de mayor a menor:");
       System.out.println(n1);
       System.out.println(n2);
       System.out.println(n3);
    }
}