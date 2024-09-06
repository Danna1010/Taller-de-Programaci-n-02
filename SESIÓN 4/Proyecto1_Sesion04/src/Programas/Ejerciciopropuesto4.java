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
public class Ejerciciopropuesto4 {
    public static void main(String[] args) {
        //declarar variables
        int n;
        String numPer;
        Scanner lectura=new Scanner (System.in);
        //entrada de datos
        System.out.print("Ingrese un  numero del (1, 2, 3, 4, 6, 12):");
        n=lectura.nextInt();
        //proceso de datos
        numPer = switch (n) {
            case 1 -> "Mensual";
            case 2 -> "Bimestral";
            case 3 -> "Trimestral";
            case 4 -> "Cuatrimestral";
            case 6 -> "Semestral";
            case 12 -> "Anual";    
            default -> "Solo numero del 1, 2, 3, 4, 6 o 12 ";
        };
        //salida de datos
        System.out.println("El numero del periodo es:"+numPer);
    }    
} 

