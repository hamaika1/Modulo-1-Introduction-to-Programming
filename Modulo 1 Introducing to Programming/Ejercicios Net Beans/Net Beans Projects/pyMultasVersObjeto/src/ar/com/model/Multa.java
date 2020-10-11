package ar.com.model;

/**
 *
 * @author mateo
 */
public class Multa {

    //Definimos los atributos de la clase;
    private long acta;
    private int codigo;
    private final float monto;

    //Definimos el constructor de la clase:
    public Multa(long acta, int codigo, float monto) {
        this.acta = acta;
        this.codigo = codigo;
        this.monto = monto;
    }

    //Definimos los metodos getters and setters;
    public long getActa() {
        return acta;
    }

    public void setActa(long acta) {
        this.acta = acta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getMonto() {
        return monto;
    }

    //Definimos el metodo toString;
    public String mostrarMulta() {
        return "El acta N: " + acta + ", con codigo: " + codigo + ", tiene un monto de: $" + monto;
    }

    //Definimos el metodo para calcular el monto total:
    public float calcularMonto() {

        return monto;
    }
}
