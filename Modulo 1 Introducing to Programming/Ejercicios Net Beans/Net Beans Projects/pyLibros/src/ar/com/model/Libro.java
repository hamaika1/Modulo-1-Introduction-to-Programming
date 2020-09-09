package ar.com.model;

/**
 *
 * @author mateo
 */
public class Libro extends Publicacion { //Extendemos o heredamos de publicacion los atributos;

    //Definimos variables:
    private String ISBN;
    private String autor;

    //Metodo constructor con parametros;
    public Libro() {
        ISBN = "Sin definir";
        autor = "Sin definir";
    }

    public Libro(String ISBN, String autor, String titulo, int cantPags) {
        this.ISBN = ISBN;
        this.autor = autor;
    }

    //Metodos getters and setters;
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //Metodo toString;
    public String mostrarLibro() {

        return "EL libro " + getTitulo() + " con 'ISBN' -> " + getISBN() + ", del autor " + getAutor() + ", tiene un total de " + getCantPags() + " paginas.";
    }

}
