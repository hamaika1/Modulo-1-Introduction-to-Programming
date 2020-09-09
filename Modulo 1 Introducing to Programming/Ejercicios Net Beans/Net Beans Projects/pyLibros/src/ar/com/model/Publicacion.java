package ar.com.model;

/**
 *
 * @author mateo
 */
public class Publicacion extends Object {

    //Definimos los atributos;
    private String titulo;
    private int cantPags;

    //Definimos los constructores:
    public Publicacion() {
        titulo = "Sin definir";
        cantPags = 1;
    }

    public Publicacion(String titulo, int cantPags) {
        this.titulo = titulo;
        this.cantPags = validarPaginas(cantPags);
    }

    //Definimos getters and setters;
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantPags() {
        return cantPags;
    }

    public void setCantPags(int cantPags) {
        this.cantPags = validarPaginas(cantPags);
    }

    //Metodo de validacion de paginas;
    private int validarPaginas(int cantPags) {

        return (cantPags > 0) ? cantPags : 1;
    }

    @Override
    public String toString() {
        return "La publicacion " + getTitulo() + ", tiene un total de " + getCantPags() + " paginas.";
    }

}
