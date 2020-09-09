package ar.com;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejecutable {

    public static void main(String[] args) {

        //Definimos las herramientas:
        Scanner input = new Scanner(System.in);

        //Definimos las variables y los vectores:
        int cantMultas;
        int posicionVector;
        int codigoMayor;
        int mayor;
        int codigo[];
        float monto[];
        float totalMonto; //Acumulador
        int conteoCodigos[];

        //Inicializacion de las variables y vectores:
        cantMultas = 0;
        totalMonto = 0;
        conteoCodigos = new int[20];

        //Entrada de datos:
        do {
            System.out.println("Ingrese la cantidad de multas a cargar: ");
            cantMultas = input.nextInt();
        } while (cantMultas < 0);

        //Inicializo los vectores luego de la obtencion de la dimencion del mismo:
        codigo = new int[cantMultas];
        monto = new float[cantMultas];

        //Recorro el vector de los codigos:
        for (int i = 0; i < codigo.length; i++) {
            //Leer codigo de infraccion:
            do {
                System.out.println("Ingrese el codigo de la multa: ");
                codigo[i] = input.nextInt();
            } while (codigo[i] < 1 || codigo[i] > 20);
            //Leer monto de la infraccion:
            System.out.println("Ingrese el monto de la infraccion: ");
            monto[i] = input.nextFloat();
            //Total del monto acumulado;
            totalMonto += monto[i];
        }

        //Proceso de los datos:
        for (int i = 0; i < codigo.length; i++) {
            posicionVector = codigo[i] - 1; //Si leo el codigo 3, lo cuento en la posicion 2 del vector conteoCodigos;
            conteoCodigos[posicionVector]++; //Acceso directo a la posicion en el vector;
        }

        //Buscar el codigo de infraccion que mas se presento:
        mayor = conteoCodigos[0];
        codigoMayor = 1;
        for (int i = 0; i < conteoCodigos.length; i++) {
            if (conteoCodigos[i] > mayor) {
                mayor = conteoCodigos[i];
                codigoMayor = i + 1;
            }
        }

        //Salida de datos:
        System.out.println("Total acumulado en multas: $" + totalMonto);
        for (int i = 0; i < conteoCodigos.length; i++) {
            if (conteoCodigos[i] > 0) {
                System.out.println("Actas con codigo: " + (i + 1) + " => " + conteoCodigos[i]);
            }
        }
        System.out.println("El codigo de infraccion que mas se presento es: " + codigoMayor + ", con: " + mayor + " actas labradas");

    }

}
