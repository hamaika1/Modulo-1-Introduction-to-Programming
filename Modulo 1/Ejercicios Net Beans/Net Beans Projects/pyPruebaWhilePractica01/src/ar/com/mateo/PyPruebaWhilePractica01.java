package ar.com.mateo;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class PyPruebaWhilePractica01 {

    public static void main(String[] args) {
        //Defino herramientas:
        Scanner input = new Scanner(System.in);

        //Defino variables:
        int countPar, countImpar, num, vAnterior;
        boolean alertCero, alertPI;

        //Inicializo las variables:
        countPar = countImpar = num = vAnterior = 0; // <-- Asignacion multiple;
        alertCero = false;
        alertPI = true;

        //Entrada:
        System.out.println("Ingrese un numero positivo, se finaliza con numero negativo: ");
        num = input.nextInt();

        //Proceso:
        while (num > 0) { //Inicia el while;
            if (num != 0) {
                if (num % 2 == 0) {
                    countPar = countPar + 1;
                    if (vAnterior != 0 && vAnterior % 2 != 0) {
                        alertPI = false;
                    } else {
                        countImpar = countImpar + 1;
                        if (vAnterior != 0 && vAnterior % 2 != 0) {
                            alertPI = false;
                        } else {
                            alertCero = true;
                        }
                    }
                }
            }
            vAnterior = num;
            System.out.println("Ingrese un numero positivo, se finaliza con numero negativo: ");
            num = input.nextInt();

        }//Finaliza el while;

        //Salidas:
        System.out.println("La cantidad ingresada de numeros pares: " + countPar + " y de numero impares: " + countImpar);

        if (alertCero == true) {
            System.out.println("Paso al menos un cero!");
        } else {
            System.out.println("No se a ingresado ningun cero!");
        }
    }

}
