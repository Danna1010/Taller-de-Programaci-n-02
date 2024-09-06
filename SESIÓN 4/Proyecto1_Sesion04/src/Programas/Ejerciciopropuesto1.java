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
public class Ejerciciopropuesto1 {
    public static void main(String[] args) {
        //declarar variables
        int n;
        String nombreNum;
        Scanner lectura=new Scanner (System.in);
        //entrada de datos
        System.out.print("Ingrese un  numero del 1 al 5:");
        n=lectura.nextInt();
        //proceso de datos
        nombreNum = switch (n) {
            case 1 -> "Uno";
            case 2 -> "Dos";
            case 3 -> "Tres";
            case 4 -> "Cuatro";
            case 5 -> "Cinco";
            default -> "Solo numero del 1-5 ";
        };
        //salida de datos
        System.out.println("El numero en palabras es:"+nombreNum);
    }    
}
