package ar.com.mateo;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class cajeroAutomatico {

    public static void main(String[] args) {

        //Definir herramientas;
        Scanner input = new Scanner(System.in);

        //Definir variables y inicializacion;
        int billete1000;
        int billete500;
        int billete200;
        int billete100;
        int cantidadEfectivo;
        int restoMil;
        int restoQuini;

        billete1000 = billete500 = billete200 = billete100 = cantidadEfectivo = 0; //Asiganacion multiple.

        //Entrada:
        System.out.println("Porfavor, ingrese la cantidad de dinero a extraer: ");
        cantidadEfectivo = input.nextInt();

        //Proceso:
        billete1000 = cantidadEfectivo / 1000;
        restoMil = cantidadEfectivo % 1000;

        billete500 = restoMil / 500;
        restoQuini = restoMil % 500;

        billete200 = restoQuini / 200;

        billete100 = (restoQuini % 200) / 100;

        //Salida:
        System.out.println("Cantidad de billetes de 1000: " + billete1000 + "\nCantidad de billetes de 500: " + billete500);
        System.out.println("Cantidad de billetes de 200: " +  billete200 + "\nCantidad de billetes de 100: " + billete100);
    }

}
