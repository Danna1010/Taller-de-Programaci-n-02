
package Programas;
import java.util.Scanner;
public class TareaEjercicio2 {
    public static void main(String[] args) {
        int i, mesMayor = 0;
        double consumo, sumaConsumo = 0.0, mayorConsumo = 0.0;
        Scanner lectura = new Scanner(System.in);
        
        for (i = 1; i <= 6; i++) {
            System.out.print("Ingrese el consumo de agua del mes " + i + " en m³: ");
            consumo = lectura.nextDouble();
            sumaConsumo += consumo;
            
            if (consumo > mayorConsumo) {
                mayorConsumo = consumo;
                mesMayor = i;
            }
        }
        
        double promedioConsumo = sumaConsumo / 6;
        
        // Salida
        System.out.println("El consumo total de agua es: " + sumaConsumo + " m³");
        System.out.println("El consumo promedio de agua es: " + promedioConsumo + " m³");
        System.out.println("El mayor consumo fue en el mes " + mesMayor + " con: " + mayorConsumo + " m³");
    }
}

