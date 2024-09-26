
package Programas;

/*
Crear un programa en java que permita entrar una cantidad.
Visualizar el digito mayor, la cantidad de digitos
impares y la suma digitos pares

Por ejemeplo:
cantidad=78952
Resultados:
dmay=9

cdimp=3
sdpares=10
 */
import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args) { 
        //Declarar variables
        int cantidad, dmay, cdimp, sdpares,r, dig;
        Scanner lectura=new Scanner (System.in);
        //Entrada de datos
        System.out.print("Ingresar una cantidad:");
        cantidad=lectura.nextInt();
        //Proceso de datos
        cdimp=0;
        sdpares=0;
        dmay=0;
        while (cantidad>0){
            dig=cantidad%10;
            if(dig>dmay){
                dmay=dig;
            }
            r=dig%2;
            if(r==0){
                sdpares+=dig;
            }else{
                cdimp++; 
            }
            cantidad=cantidad/10;
        }
        //Salida de datos
        System.out.println("El digito mayor es:"+dmay);
        System.out.println("La cantidad de digitos impares es:"+cdimp);
        System.out.println("La suma de digitos pares es:"+sdpares);
    }
    
}
