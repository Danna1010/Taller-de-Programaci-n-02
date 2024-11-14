
package Programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
        //Declarar variables
        double s1, s2, s3, s4;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresar sueldo 1:");
        s1=lectura.nextDouble();
        System.out.print("Ingresar sueldo 2:");
        s2=lectura.nextDouble();
        System.out.print("Ingresar sueldo 3:");
        s3=lectura.nextDouble();
        System.out.print("Ingresar sueldo 4:");
        s4=lectura.nextDouble();
        //Crear el objeto mediante la instancia de la clase
        Empleado objempleado = new Empleado();
        objempleado.setSueldo1 (s1);
        objempleado.setSueldo2 (s2);
        objempleado.setSueldo3 (s3);
        objempleado.setSueldo4 (s4);
        //Salida de datos
        System.out.println ("El total de sueldos es: "+objempleado.gettotalsueldo());
        System.out.println ("El total de ventas es: "+objempleado.getpromedio());
        System.out.println ("El total de ventas es: "+objempleado.getmayor());
        System.out.println ("El total de ventas es: "+objempleado.getmenor());
    }    
}
