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
public class Programa04 {
    public static void main(String[] args) {
     //declarar variables
        int numero;
        String estacion;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar un numero [1-12]: ");
        numero=lectura.nextInt();
        //proceso de datos
        estacion="";
        switch (numero) {
            case 1:
            case 2:
            case 3:
                estacion="Verano";
                break;
            case 4:
            case 5:
            case 6:
                estacion="Otoño";
                break;
            case 7:
            case 8:
            case 9:
                estacion="Invierno";
                break;
            case 10, 11, 12:
                estacion="Primavera";
                break;               
        }   
        //salida de datos
        System.out.println(estacion);
    }
}
