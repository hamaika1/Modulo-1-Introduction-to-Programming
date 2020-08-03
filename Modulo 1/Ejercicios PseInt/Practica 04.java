/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PRACTICA_04.java."

import java.io.*;

public class practica_04 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double cantlts;
		double consumolts;
		int kilometros;
		int kmporlts;
		double precio;
		// Entrada;
		System.out.println("Ingrese Kms recorridos: ");
		kilometros = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese relacion Km por litro: ");
		kmporlts = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese precio de combustible por litro: ");
		precio = Double.parseDouble(bufEntrada.readLine());
		// Proceso ;
		cantlts = kilometros/kmporlts;
		consumolts = cantlts*precio;
		// Salida;
		System.out.println("Total de litros consumidos: "+cantlts);
		System.out.println("Gasto total en pesos: "+consumolts);
	}


}

