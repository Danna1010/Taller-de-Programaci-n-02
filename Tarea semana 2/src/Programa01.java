package programas;

import java.util.Scanner;
import java.lang.Math;
//import java.lang.System,
public class Programa01 {
    public static void main(String [] args){
        //declarar variables
        double numero,redondeado;
        Scanner lectura=new Scanner (System.in);
        //entrada de datos
        System.out.print("Ingresa un número decimal:");
        numero=lectura.nextDouble();
        //proceso de datos
        redondeado=Math.round(numero);
        //salida de datos
        System.out.println("El numero"+numero+"redondeado es:"+redondeado);
        
}//Fin del metodo
   }//fin del programa



