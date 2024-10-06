
package Programas;
import java.util.Scanner;
public class TareaEjercicio3 {
    public static void main(String[] args) {
        int i, j = 0;
        String semana = "";
        double horas, totalHoras = 0.0, maxHoras = 0.0;
        Scanner entrada = new Scanner(System.in);
        
        // Proceso de datos
        for (i = 1; i <= 6; i++) {
            System.out.print("Ingrese las horas estudiadas en la semana " + i + ": ");
            horas = entrada.nextDouble();
            totalHoras += horas;
            if (horas > maxHoras) {
                maxHoras = horas;
                j = i;
            }
        }

        // Identificar la semana con más horas de estudio
        switch (j) {
            case 1: semana = "Semana 1"; break;
            case 2: semana = "Semana 2"; break;
            case 3: semana = "Semana 3"; break;
            case 4: semana = "Semana 4"; break;
            case 5: semana = "Semana 5"; break;
            case 6: semana = "Semana 6"; break;
        }
        
        // Salida de datos
        System.out.println("Total de horas estudiadas: " + totalHoras);
        System.out.println("La mayor cantidad de horas se estudió en " + semana + " con: " + maxHoras + " horas.");
    }
}

