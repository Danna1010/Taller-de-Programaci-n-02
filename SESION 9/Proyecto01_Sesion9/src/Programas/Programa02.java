/*
 Crear un programa en Java que permita almacenar en un arreglo de datos con
cinco números ingresados y realizar una búsqueda mediante un número
ingresado. Visualizar un mensaje indicando si el número existe o no existe.
Ejemplo:
anumeros[5]=10 20 30 40 50
nbus=30
Resultado:
mensaje=”Si existe el número”
 */
package Programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[]args){
        //Declarar variables
        int i,nbus,numero;
        String mensaje="";
        int[] anumeros=new int[5];
        Scanner lectura=new Scanner (System.in);
        //Entrada
        for(i=0;i<anumeros.length;i++){
            System.out.print("Ingresar numero"+(i+1)+":");
            numero=lectura.nextInt();
            anumeros[i]=numero;
        }
        System.out.print("Ingresar numero a buscar:");
        nbus=lectura.nextInt();
        //Proceso
        for(i=0;i<anumeros.length;i++){
            if(nbus==anumeros[i]){
                mensaje="Numero existe";
                break;
            }else{
                mensaje="Numero no existe";
            }
        }  
        //Salida
        System.out.println(mensaje);
    }
    
}
