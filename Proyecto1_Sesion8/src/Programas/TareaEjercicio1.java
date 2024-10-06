
package Programas;
import java.util.Scanner;
public class TareaEjercicio1 {
    public static void main(String args[]){
        // Declarar variables
        int numCalificaciones;
        double calif, suma = 0, promedio;
        Scanner lectura = new Scanner(System.in);
        
        // Entrada
        System.out.print("Ingresar la cantidad de calificaciones: ");
        numCalificaciones = lectura.nextInt();
        
        // Proceso
        for (int i = 1; i <= numCalificaciones; i++) {
            System.out.print("Ingresar la calificación " + i + ": ");
            calif = lectura.nextDouble();
            suma += calif;
        }
        
        promedio = suma / numCalificaciones;
        
        // Salida
        System.out.println("El promedio de las calificaciones es: " + promedio);
    }
}

