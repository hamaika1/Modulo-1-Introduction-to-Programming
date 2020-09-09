package ar.com;

import java.util.Scanner;
import ar.com.model.Libro;

/**
 *
 * @author mateo
 */
public class EjecutableMain {

    public static void main(String[] args) {

        //Definimos las variables parametro para pasarle al constructor del objeto Libro!
        String isbn;
        String autor;
        String titulo;
        int cantPag;

        //Instanciamos al objeto Libro vacio!
        Libro libro1 = new Libro();

        //Pedido de datos a cargar sobre los libros!
        Scanner input = new Scanner(System.in);

        System.out.println("Porfavor ingrese el ISBN del libro: ");
        isbn = input.nextLine();

        System.out.println("Porfavor ingrese el autor del libro con ISBN -> " + isbn + ": ");
        autor = input.nextLine();

        System.out.println("Ingrese el titulo del libro de autor -> " + autor + ": ");
        titulo = input.nextLine();

        System.out.println("Ingrese la cantidad de paginas del libro " + titulo + ": ");
        cantPag = input.nextInt();

        Libro libro2 = new Libro(isbn, autor, titulo, cantPag);

        //Muestra los datos del libro;
        System.out.println(libro1.mostrarLibro());
        System.out.println(libro2.mostrarLibro());

        //Control del libro con mayor cantidad de paignas!
        if (libro1.getCantPags() > libro2.getCantPags()) {
            System.out.println("El libro de " + libro1.getTitulo() + " tiene la mayor cantidad de paginas.");
        } else if (libro1.getCantPags() < libro2.getCantPags()) {
            System.out.println("El libro de " + libro2.getTitulo() + " tiene la mayor cantidad de paginas.");
        }
    }

}
