package ar.com;

import ar.com.dominio.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejecutable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Perez", 1000, 1);
        CuentaBancaria cuenta2 = new CuentaBancaria("Mateo Plante", 2000, 2);
        
        //Prueba de deposito y extraccion;
        System.out.println("Porfavor ingrese el monto a depositar en la cuenta codigo 1: ");
        cuenta1.depositar(input.nextFloat());

        System.out.println("Porfavor ingrese el montro a extraer de la cuenta codigo 1: ");
        cuenta1.extraer(input.nextFloat());

        //Muestro los datos de las cuentas;
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());

        //Control de igualdad de saldos;
        if (cuenta1.getSaldo() == cuenta2.getSaldo()) {
            System.out.println("El saldo de las cuentas 1 y 2 es el mismo!");
        }

        //Control de cuenta con mayor saldo;
        if (cuenta1.getSaldo() > cuenta2.getSaldo()) {
            System.out.println("La cuenta con mayor saldo es la codigo: 1!");
        } else if (cuenta1.getSaldo() < cuenta2.getSaldo()) {
            System.out.println("La cuenta con mayor saldo es la codigo: 2!");
        }
    }

}
