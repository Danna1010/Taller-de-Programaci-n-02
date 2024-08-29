package PROGRAMAS;
import java.util.Scanner;  
public class Programa03 {
    public static void main(String[] args) {
       //declarar variables
       double base, altura, area;
       //creando el objeto lectura
       Scanner lectura= new Scanner(System.in);
       //Entrada de datos
       System.out.print("Ingresa la base del triangulo: ");
       base=lectura.nextDouble();
       System.out.print("Ingresa la altura del triangulo: ");
       altura=lectura.nextDouble();
     
       //proceso de datos
       area=(base * altura)/ 2;
       
       
       //Salida de datos
       System.out.println("El area del triangulo es: "+area);
    
    }//Fin del metodo
   }//fin del programa

