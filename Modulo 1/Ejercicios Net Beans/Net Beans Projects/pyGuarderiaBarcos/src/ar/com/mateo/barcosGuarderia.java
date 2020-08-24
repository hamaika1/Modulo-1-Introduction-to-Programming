package ar.com.mateo;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class barcosGuarderia {

    public static void main(String[] args) {

        //Defino herramientas Java;
        Scanner inputNumber = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        //Defino y inicializo variables:
        int cantBarcos;
        int tipoBarco; //Tipo 1 velero; Tipo 2 Lancha;
        float cuotaMensual;
        float cuotaPromedio;
        float acuVelero = 0, acuLancha = 0;//Contadores;
        float cuotaMayor = 0;
        String nombreBarco;
        String nombreMayor = "";
        boolean primerVelero = false; //Bandera;

        //Entrada de datos:
        do {
            System.out.println("Ingrese la cantidad de embarcaciones: ");
            cantBarcos = inputNumber.nextInt();
        } while (cantBarcos <= 0);//Mientras la cantidad sea negativo o cero vuelve a pedi;

        //Proceso de datos:
        for (int i = 0; i < cantBarcos; i++) {
            System.out.println("Ingrese el nombre de la embarcacion: ");
            nombreBarco = inputString.nextLine();

            do {
                System.out.println("Ingrese el tipo de embarcacion: 1 Velero | 2 Lancha");
                tipoBarco = inputNumber.nextInt();

                if (tipoBarco < 1 || tipoBarco > 2) {
                    System.out.println("El tipo ingresado no es valido!");
                }
            } while (tipoBarco < 1 || tipoBarco > 2);

            System.out.println("Ingrese la cuota mensual: ");
            cuotaMensual = inputNumber.nextFloat();

            if (tipoBarco == 1) {
                acuVelero += cuotaMensual;
                if (primerVelero == false) {
                    nombreMayor = nombreBarco; //EL primer mayor encontrado;
                    cuotaMayor = cuotaMensual;
                    primerVelero = true;
                } else if (cuotaMensual > cuotaMayor) {
                    nombreMayor = nombreBarco; //El ultimo mayor encontrado;
                    cuotaMayor = cuotaMensual;
                }
            } else {
                acuLancha += cuotaMensual;
            }
        }

        //Salida de datos:
        cuotaPromedio = (acuVelero + acuLancha) / cantBarcos;

        System.out.println("Total anual recaudado por veleros: $" + (acuVelero * 12));
        System.out.println("Total anual recaudado por lanchas: $" + (acuLancha * 12));

        if (primerVelero == true) {
            System.out.println("Mayor couta mensual del velero: $" + cuotaMayor + " -- Nombre del velero: " + nombreMayor);
        }

        System.out.println("Cuota promedio de las embarcaciones: $" + cuotaPromedio);
    }

}
