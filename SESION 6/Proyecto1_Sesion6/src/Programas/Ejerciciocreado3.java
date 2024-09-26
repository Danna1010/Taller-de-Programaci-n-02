
package Programas;

/*
Crear un programa que permita invertir un número y permita calcular la suma de sus dígitos pares.
 */
import java.util.Scanner;
public class Ejerciciocreado3 {
    public static void main(String[] args) {
        //Declarar variables
        int cantidad, caninv = 0, digito, sumaPares = 0;
        Scanner lectura = new Scanner(System.in);
        //Entrada de digitos
        System.out.print("Ingresar una cantidad: ");
        cantidad = lectura.nextInt();
        //Proceso de datos
        while (cantidad > 0) {
            digito = cantidad % 10;
            caninv = (caninv * 10) + digito;
            if (digito % 2 == 0) {
                sumaPares += digito;
            }
            cantidad = cantidad / 10;
        }
        //Salida de datos
        System.out.println("La cantidad invertida es: " + caninv);
        System.out.println("La suma de los dígitos pares es: " + sumaPares);
    }
}


