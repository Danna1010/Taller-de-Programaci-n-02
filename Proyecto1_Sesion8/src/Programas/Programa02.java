
package Programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
        int i, j=0;
        String mes="";
        double venta, promediov=0.0, sumav=0.0, mayor=0.0;
        Scanner lectura=new Scanner (System.in);
        //Proceso de datos
        sumav=0.0;
        mayor=0.0;
        j=0;
        for (i=1;i<=6;i++){
            System.out.println("Ingrese la "+i+"º venta del semestre:");
            venta=lectura.nextDouble();
            sumav+=venta;
            if(venta>mayor){
                mayor=venta;
                j=i;
            }
            
            venta=0.0;
        }
        switch (j){
            case 1:mes="Enero";
            break;
            case 2:mes="Febrero";
            break;
            case 3:mes="Marzo";
            break;    
            case 4:mes="Abril";
            break;
            case 5:mes="Mayo";
            break;
            case 6:mes="Junio";
            break;
        }
        promediov=sumav/6;
        //Salida de datos
        System.out.println ("La suma e las ventas del semestre es: "+sumav);
        System.out.println ("El promedio de las ventas del semestre es: "+promediov);
        System.out.println ("La mayor venta esta en "+mes+" y asciende a: "+mayor);
    }  
}
