
package Programas;
import java.util.Scanner;
public class Programa4 {
    public static void main(String[] args) {
        // Declarar variables
        double compra1, compra2, compra3, compra4;
        Scanner lectura = new Scanner(System.in);
        // Entrada de datos
        System.out.print("Ingresar compra 1: ");
        compra1 = lectura.nextDouble();
        System.out.print("Ingresar compra 2: ");
        compra2 = lectura.nextDouble();
        System.out.print("Ingresar compra 3: ");
        compra3 = lectura.nextDouble();
        System.out.print("Ingresar compra 4: ");
        compra4 = lectura.nextDouble();
        // Crear el objeto mediante la instancia de la clase
        RegistroCompra registro = new RegistroCompra();
        registro.setCompra1(compra1);
        registro.setCompra2(compra2);
        registro.setCompra3(compra3);
        registro.setCompra4(compra4);
        // Salida de datos
        System.out.println("El total de compras es: " + registro.getTotal());
        System.out.println("El promedio de compras es: " + registro.getPromedio());
        System.out.println("La compra mayor es: " + registro.getMayor());
        System.out.println("La compra menor es: " + registro.getMenor());
    }
}

