
package Programas;

/*
 Crear un programa en java que permita ingresar un cantidad.
Visualizar la cantidad ingresada de forma invertida.

Por ejemplo:
cantidad=123
Resultado:
caninv=321
 */
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
        //Declarar variables
        int cantidad, caninv, digito;
        Scanner lectura=new Scanner (System.in);
        //Entrada de datos
        System.out.print("Ingresar una cantidad:");
        cantidad=lectura.nextInt();
        //Proceso de datos
        caninv=0;
        digito=0;
        while(cantidad>0){
            digito=cantidad%10;
            caninv=(caninv*10)+digito;
            cantidad=cantidad/10; 
        }
        //Salida de datos
        System.out.println("La cantidad invertida es:"+caninv);
      
    }
    
}
