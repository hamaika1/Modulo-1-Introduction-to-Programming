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
        
        CuentaBancaria cuenta = new CuentaBancaria();
        
        System.out.println("Ingrese en titular de la cuenta: ");
        cuenta.setTitular(input.nextLine());
        
        System.out.println("Ingrese el saldo de la cuenta: ");
        cuenta.setSaldo(input.nextFloat());
        
        System.out.println("Ingrese el codigo de la cuenta: ");
        cuenta.setIdCodigo(input.nextInt());
        
        System.out.println("Titular de la cuenta: " + cuenta.getTitular());
        System.out.println("Saldo de la cuenta: " + cuenta.getSaldo());
        System.out.println("Codigo de la cuenta: " + cuenta.getIdCodigo());
    }
    
}
