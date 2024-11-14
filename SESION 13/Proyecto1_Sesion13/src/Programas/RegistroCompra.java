/*
Diseñar una aplicación utilizando la programación orientada a objetos mediante
una clase con sus atributos y métodos que permita registrar las cuatro compras
realizadas (compra1, compra2, compra3, compra4). Visualizar en total,
promedio, mayor y menor de las compras realizadas. Primero y luego lo otro.PROGRAMA4
 */
package Programas;

public class RegistroCompra {
    // Atributos de la clase
    private double compra1;
    private double compra2;
    private double compra3;
    private double compra4;

    // Métodos de la clase
    public double getCompra1() {
        return compra1;
    }
    public void setCompra1(double compra1) {
        this.compra1 = compra1;
    }
    public double getCompra2() {
        return compra2;
    }
    public void setCompra2(double compra2) {
        this.compra2 = compra2;
    }
    public double getCompra3() {
        return compra3;
    }
    public void setCompra3(double compra3) {
        this.compra3 = compra3;
    }
    public double getCompra4() {
        return compra4;
    }
    public void setCompra4(double compra4) {
        this.compra4 = compra4;
    }
    public double getTotal() {
        return this.getCompra1()+this.getCompra2()+this.getCompra3()+this.getCompra4();
    }
    public double getPromedio() {
        return this.getTotal() / 4;
    }
    public double getMayor() {
        double mayor = this.getCompra1();
        if (this.getCompra2() > mayor) {
            mayor = this.getCompra2();
        }
        if (this.getCompra3() > mayor) {
            mayor = this.getCompra3();
        }
        if (this.getCompra4() > mayor) {
            mayor = this.getCompra4();
        }
        return mayor;
    }
    public double getMenor() {
        double menor = this.getCompra1();
        if (this.getCompra2() < menor) {
            menor = this.getCompra2();
        }
        if (this.getCompra3() < menor) {
            menor = this.getCompra3();
        }
        if (this.getCompra4() < menor) {
            menor = this.getCompra4();
        }
        return menor;
    }
}
