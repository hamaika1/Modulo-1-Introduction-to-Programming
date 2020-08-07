package ar.com.mateo;

import java.util.Scanner;

public class PyPruebaSwitchCase {

    public static void main(String[] args) {
        //Definicion de herramientas;
        Scanner input = new Scanner(System.in);

        //Definicion de variables;
        int calificacion;
        String valoracion;

        //Entrada:
        System.out.println("Ingrese la valoracion de la APP: ");
        calificacion = input.nextInt();

        //Proceso:
        switch (calificacion) {
            case 1: {
                valoracion = "Calificacion fue REGULAR";
                break;
            }
            case 2: {
                valoracion = "Calificacion fue MUY BUENA!";
                break;
            }
            case 3: {
                valoracion = "Calificacion fue RECOMENDADA!";
                break;
            }
            default: {
                valoracion = "valoracion NO ES PERMITIDA, intente nuevamente!";
            }
        }

        //Salida:
        System.out.println("La " + valoracion);

    }

}
