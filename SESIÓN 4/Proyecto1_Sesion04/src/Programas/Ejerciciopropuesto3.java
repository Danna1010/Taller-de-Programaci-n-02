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
public class Ejerciciopropuesto3 {
    public static void main(String[] args) {
        //declarar variables
        int n;
        String numIng;
        Scanner lectura=new Scanner (System.in);
        //entrada de datos
        System.out.print("Ingrese un  numero del 1 al 6:");
        n=lectura.nextInt();
        //proceso de datos
        numIng = switch (n) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            default -> "Solo numero del 1-6 ";
        };
        //salida de datos
        System.out.println("El numero en ingles es:"+numIng);
    }    
} 

