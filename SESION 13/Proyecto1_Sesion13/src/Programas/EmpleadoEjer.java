/*
Diseñar una aplicación utilizando la programación orientada a objetos mediante
una clase con sus atributos y métodos que permita registrar el ingreso mensual,
otros ingresos y además los gastos mensuales de un empleado. Determinar el
ahorro mensual, semestral y anual proyectado.
PROGRAMA 3
 */
package Programas;
public class EmpleadoEjer {
    // Atributos de la clase
    private double ingresoMensual;
    private double otrosIngresos;
    private double gastosMensuales;

    // Métodos de clase
    public double getIngresoMensual() {
        return ingresoMensual;
    }
    public void setIngresoMensual(double ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }
    public double getOtrosIngresos() {
        return otrosIngresos;
    }
    public void setOtrosIngresos(double otrosIngresos) {
        this.otrosIngresos = otrosIngresos;
    }
    public double getGastosMensuales() {
        return gastosMensuales;
    }
    public void setGastosMensuales(double gastosMensuales) {
        this.gastosMensuales = gastosMensuales;
    }
    public double getAhorroMensual() {
        return (ingresoMensual + otrosIngresos) - gastosMensuales;
    }
    public double getAhorroSemestral() {
        return getAhorroMensual() * 6;
    }
    public double getAhorroAnual() {
        return getAhorroMensual() * 12;
    }
}
