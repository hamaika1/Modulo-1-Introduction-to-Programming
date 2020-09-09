package ar.com.model;

/**
 *
 * @author mateo
 */
public class Biblioteca {

    //Definimos los atributos:
    private final Publicacion[] estanteria;

    //Definimos el constructor vacio, el usuario llena la estanteria de la biblioteca;
    public Biblioteca(int cantPubl) {
        estanteria = new Publicacion[cantPubl];
    }

    //Definimos getters, sin setters, la biblioteca se encarga de buscar, mostrar o eliminar los libros;
    public Publicacion[] getEstanteria() {
        return estanteria;
    }

    //Definimos los metodos de la biblioteca:
    public boolean agregarPublicacion(Publicacion unaPublicacion) {
        boolean flag = false;
        for (int i = 0; i < estanteria.length; i++) {
            if (estanteria[i] == null) {
                estanteria[i] = unaPublicacion;
                flag = true; //Aviso de espacio en estanteria y confirmacion del agregado;
                break;
            }
        }
        return flag;
    }

    public String mostrarListado() {
        String publicaciones = "";
        for (int i = 0; i < estanteria.length; i++) {
            if (estanteria[i] != null) {
                publicaciones += "Publicacion " + (i + 1) + ": " + estanteria[i].toString() + "\n";
            } else {
                publicaciones = "Lugar vacio!";
            }
        }
        return "Estanteria:\n" + publicaciones;
    }

}
