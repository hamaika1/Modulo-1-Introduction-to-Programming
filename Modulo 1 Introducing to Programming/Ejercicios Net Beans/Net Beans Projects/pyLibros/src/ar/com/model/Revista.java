package ar.com.model;

/**
 *
 * @author mateo
 */
public class Revista extends Publicacion{ //Extendemos o heredamos de publicacion los atributos;

    //Definimos los atributos de la clase;
    private int idCodigo;

    //Definimos el constructor de la clase;
    public Revista(int idCodigo) {
        this.idCodigo = idCodigo;  
    }

    //Definimos getters and setter;
    public int getIdCodigo() {
        return idCodigo;
    }

    public void setIdCodigo(int idCodigo) {
        this.idCodigo = idCodigo;
    }

  
    //Definimos el metodo toString para las revistas;
    public String mostrarRevistas() {

        return "La revista " + getTitulo() + ", con codigo " + getIdCodigo() + ", tiene " + getCantPags() + " paginas.";
    }

}
