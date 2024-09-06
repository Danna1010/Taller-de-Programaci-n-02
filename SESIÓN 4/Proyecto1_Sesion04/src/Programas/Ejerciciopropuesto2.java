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
public class Ejerciciopropuesto2 {
    public static void main(String[] args) {
        //declarar variables
        int n;
        String numRom;
        Scanner lectura=new Scanner (System.in);
        //entrada de datos
        System.out.print("Ingrese un  numero del 1 al 10:");
        n=lectura.nextInt();
        //proceso de datos
        numRom = switch (n) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            case 10 -> "X";
            default -> "Solo numero del 1-10 ";
        };
        //salida de datos
        System.out.println("El numero en romanos es:"+numRom);
    }    
}

