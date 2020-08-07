package ar.com.mateo;

import java.util.Scanner;

public class PracticaIfElse {
    //Definir si un numero es par o impar;

    public static void main(String[] args) {
        //Definimos herramientas;
        Scanner input = new Scanner(System.in);

        //Definir variables;
        int numero;

        //Entrada;
        System.out.println("Ingrese un numero porfavor: ");
        numero = input.nextInt();

        //Proceso;
        if (numero % 2 == 0) {
            System.out.println("El numero ingresado es par!");
        } else {
            System.out.println("El numero ingresado es impar!");
        }
    }

}
