package ar.com;

import ar.com.model.Caminera;
import ar.com.model.Multa;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejucutable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int conteo[] = new int[20];
        int cantMultas;
        float monto, total;
        int codigo;
        long acta;
        Caminera objetoCaminera;
        Multa multa;

        //Pedimos la entrada de cantidad de multas y la validacion;
        do {
            System.out.println("Porfavor ingrese la cantidad de multas a cargar: ");
            cantMultas = input.nextInt();
        } while (cantMultas <= 0);

        objetoCaminera = new Caminera(cantMultas);

        //Entrada de datos:
        for (int i = 0; i < cantMultas; i++) {
            //Leer el codigo de la multa y validar;
            do {
                System.out.println("Ingrese el codigo de la multa: ");
                codigo = input.nextInt();
            } while (codigo < 1 || codigo > 20);

            //Leer el monto de la infraccion:
            System.out.println("Ingrese el monto de la multa: ");
            monto = input.nextFloat();

            //Leer el numero del acta labrada;
            System.out.println("Ingrese el numero de acta labrada: ");
            acta = input.nextLong();

            multa = new Multa(acta, codigo, monto);//Se crea la multa;
            objetoCaminera.registrarMulta(multa);//Registrando la multa a la caminera;
        }

        //Salidas de datos;
        total = objetoCaminera.calcularTotal();
        System.out.println("El monto total acumulado es de: $" + total);

        conteo = objetoCaminera.contabilizarCodigosMultas();
        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] > 0) {
                System.out.println("Actas con codigo: " + (i + 1) + " |--> " + conteo[i]);
            }
        }
        System.out.println(objetoCaminera.mostrarMayorCodigo());
    }

}
