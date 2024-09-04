/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

/*
  Crear un programa que permita ingresar un dos números y un tipo de operación aritmética (+,-,*,/)
  Visualizar el resultado de la operación aritmética

  n1=4
  n2=2
  opa="*"
  resultado=8
 */
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args) {
        double n1, n2, resultado;
        String opa;
        Scanner lectura=new Scanner (System.in);
        //entrada de datos
        System.out.print ("Ingresar número 1: ");
        n1=lectura.nextDouble();
        System.out.print ("Ingresar número 2: ");
        n2=lectura.nextDouble();
        System.out.print ("Ingresar operación [+,-,*,/]: ");
        opa=lectura.next();
        //proceso de datos
        if(opa.equals("+")){
            resultado=n1+n2;
        }else if(opa.equals("-")){
            resultado=n1-n2;
        }else if(opa.equals("*")){
            resultado=n1*n2;
        }else{
            resultado=n1/n2;
        }
        //salida de datos
        System.out.println(resultado);
    }
}
