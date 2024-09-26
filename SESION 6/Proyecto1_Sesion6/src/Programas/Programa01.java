
package Programas;

/*
Crear un programa en java que permita ingresar una cantidad.
Visualizar el nuemro e digitos de la cantidad ingresada.

Por ejemplo:
cantidad=1234
Resultado:
candig=4
 */
import java.util.Scanner;
public class Programa01 {
    public static void main (String[] args) {
        //declarar variables
        int cantidad, candig;
        Scanner lectura=new Scanner (System.in);
        //entrada de datos
        System.out.print("Ingresar una cantidad:");
        cantidad=lectura.nextInt();
        //proceso de datos
        candig=0;
        while(cantidad>0){
            //variable contador
            candig++;
            cantidad=cantidad/10;
        }
        //salida de datos
        System.out.println("La cantidad es");
    }
}
