/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programas;

/*Cear un programa que permita ingresar la edad.
 Visualizar la edad en diferentes unidades
 *
 * @author Maq
 */
import java.util.Scanner;
public class Programa06 {
    public static void main(String[] args) {
        int edad;
        String unidad;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su edad en años: ");
        edad = entrada.nextInt();
        System.out.print("Convertir a (meses / días): ");
        unidad = entrada.next();

        if (unidad.equals("meses")) {
            System.out.println("Edad en meses: " + (edad * 12));
        } else if (unidad.equals("días")) {
            System.out.println("Edad en días: " + (edad * 365));
        } else {
            System.out.println("Unidad no válida.");
        }
    }
}

