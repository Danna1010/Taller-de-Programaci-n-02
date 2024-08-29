
package PROGRAMAS;
import java.util.Scanner;  
public class Programa02 {
    public static void main(String[] args) {
       //declarar variables
       int numero;
       double cubo;
       //creando el objeto lectura
       Scanner lectura= new Scanner(System.in);
       //Entrada de datos
       System.out.print("Ingresa un numero entero: ");
       numero=lectura.nextInt();
     
       //proceso de datos
       cubo=Math.pow (numero, 3);
       
       //Salida de datos
       System.out.println("El cubo de un numero es: "+cubo);
    
    }//Fin del metodo
   }//fin del programa

    
