
package Programas;
import java.util.Scanner;
public class Programa01 {
    public static void main(String args[]){
        //Declarar variables
        double sueldo, ts, ps;
        int ns, i;
        Scanner lectura=new Scanner (System.in);
        //Entrada
        System.out.print ("Ingresar cantidad de sueldo:");
        ns=lectura.nextInt();
        ts=0.0;
        //Proceso
        for (i=1;i<=ns;i++){
            System.out.print ("Ingresar sueldo "+i+":");
            sueldo=lectura.nextDouble();
            ts+=sueldo; //acumulador
        }
        ps=ts/ns;
        //Salida
        System.out.println ("El total de sueldos es:"+ts);
        System.out.println("El promedio de sueldos es:"+ps);
    }
    
}
