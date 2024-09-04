/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

/*
 *Crear un programa que permita ingresar las horas trabajadas de un empleado
  Visualizar su rendimiento y si es apto para un bono.
 * @author Maq
 */
import java.util.Scanner;
public class Programa05 {
    public static void main(String[] args) {
       //declarar variables
       double htrabajadas, tarifaxhora, rendimiento, salario, bono;
       Scanner lectura=new Scanner (System.in);
       //entrada de datos
       System.out.print("Ingresar las horas trabajadas:");
       htrabajadas=lectura.nextDouble();
       
       System.out.print("Ingresar la tarifa por hora:");
       tarifaxhora=lectura.nextDouble();
       
       System.out.print("Ingresar el rendimiento del empleado (de 1 a 20):");
       rendimiento=lectura.nextDouble();
       //proceso de datos
       salario=htrabajadas * tarifaxhora;
       if (rendimiento >= 15){
           bono=100; //Bono de 100 s el rendimiento es altoe
       } else{
           bono=0;
       }
       
       //salida de dato
       System.out.println("El salario base es:" +salario);
       System.out.println("El bono es:"+bono);
       System.out.println("El salario total es:"+(salario + bono));
    }
   }
