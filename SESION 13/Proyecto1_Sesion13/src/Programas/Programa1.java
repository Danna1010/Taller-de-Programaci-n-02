
package Programas;
import java.util.Scanner;
public class Programa1 {
    public static void main(String[] args) {
        //Declarar variables
        double vt1, vt2, vt3;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresar venta 1:");
        vt1=lectura.nextDouble();
        System.out.print("Ingresar venta 2:");
        vt2=lectura.nextDouble();
        System.out.print("Ingresar venta 3:");
        vt3=lectura.nextDouble();
        //Crear el objeto mediante la instancia de la clase
        RegistroVenta1 objregventa = new RegistroVenta1();
        objregventa.setVenta1 (vt1);
        objregventa.setVenta2 (vt2);
        objregventa.setVenta3 (vt3);
        //Salida de datos
        System.out.println ("El total de ventas es: "+objregventa.gettotal());
        System.out.println ("El total de ventas es: "+objregventa.getpromedio());
        System.out.println ("El total de ventas es: "+objregventa.getmayor());
        System.out.println ("El total de ventas es: "+objregventa.getmenor());
    }
}
