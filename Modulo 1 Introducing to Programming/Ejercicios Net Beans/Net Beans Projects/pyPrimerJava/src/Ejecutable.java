
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejecutable {
        
    public static void main(String[] args) {
        //Import de Utilidades;
        Scanner in = new Scanner(System.in);
       
        // Definir variables;
        int numero, cuadrado;
        
        //Entrada;
        System.out.println("Ingrese un numero entero: ");
        numero = in.nextInt();
        
        //Proceso;
        cuadrado = numero * numero;
        
        //Salida
        System.out.println("El cuadrado del numero es: " + cuadrado);
       
    }
    
}
