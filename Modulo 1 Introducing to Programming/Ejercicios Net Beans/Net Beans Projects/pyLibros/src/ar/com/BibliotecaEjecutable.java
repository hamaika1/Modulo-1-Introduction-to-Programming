package ar.com;

import ar.com.model.Biblioteca;
import ar.com.model.Libro;
import ar.com.model.Publicacion;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class BibliotecaEjecutable {

    public static void main(String[] args) {

        //Definimos las variables;
        int cantPubl;
        int cantPags;
        String autor;
        String titulo;
        String isbn;

        Scanner input = new Scanner(System.in);

        //Entrada de datos por usuario;
        do {
            System.out.println("Ingrese la cantidad de publicaciones de la biblioteca: ");
            cantPubl = input.nextInt();
        } while (cantPubl <= 0);

        //Luego de pedir la cantidad de libros, creamos el vector >>
        Biblioteca biblioteca = new Biblioteca(cantPubl);

        //Proceso de carga de datos de los libros;
        for (int i = 0; i < cantPubl; i++) {

            System.out.println("Porfavor ingrese el ISBN de la publicacion: ");
            isbn = input.nextLine();

            System.out.println("Porfavor ingrese el autor de la publicacion: ");
            autor = input.nextLine();

            System.out.println("Ingrese el titulo de la publicacion: ");
            titulo = input.nextLine();

            System.out.println("Ingrese la cantidad de paginas de la publicacion: ");
            cantPags = input.nextInt();

            Publicacion unaPublicacion = new Publicacion(titulo, cantPags);
            biblioteca.agregarPublicacion(unaPublicacion);//Por cada vuelta que da, carga los datos de c/u!
        }

        //Mostrar los libros de la biblioteca;
        String listado = biblioteca.mostrarListado();
        System.out.println(listado);
    }

}
