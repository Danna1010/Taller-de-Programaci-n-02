package Programas;
import java.util.Scanner;
public class Programa3 {
    public static void main(String[] args) {
        // Declarar variables para ingresos y gastos
        double ingresoMensual, otrosIngresos, gastosMensuales;
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingresar ingreso mensual: ");
        ingresoMensual = lectura.nextDouble();
        System.out.print("Ingresar otros ingresos: ");
        otrosIngresos = lectura.nextDouble();
        System.out.print("Ingresar gastos mensuales: ");
        gastosMensuales = lectura.nextDouble();

        // Crear el objeto de la clase EmpleadoEjer
        EmpleadoEjer empleado = new EmpleadoEjer();
        empleado.setIngresoMensual(ingresoMensual);
        empleado.setOtrosIngresos(otrosIngresos);
        empleado.setGastosMensuales(gastosMensuales);

        // Salida de datos: mostrar los ahorros calculados
        System.out.println("Ahorro mensual: " + empleado.getAhorroMensual());
        System.out.println("Ahorro semestral proyectado: " + empleado.getAhorroSemestral());
        System.out.println("Ahorro anual proyectado: " + empleado.getAhorroAnual());

        lectura.close();
    }
}

