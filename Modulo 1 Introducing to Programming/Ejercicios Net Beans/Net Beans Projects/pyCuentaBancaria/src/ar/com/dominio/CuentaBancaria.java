package ar.com.dominio;

/**
 *
 * @author mateo
 */
public class CuentaBancaria {

    //Definicion de atributos;
    private String titular;
    private float saldo;
    private int idCodigo;

    //Constructor: se llama igual que la clase y no tiene tipo de retorno;
    public CuentaBancaria(String titular, float saldo, int idCodigo) {
        this.titular = titular; // -> (this.titular = atributo) y (titular = parametro);
        this.saldo = saldo;
        this.idCodigo = idCodigo;
    }

    //Metodos getters and setters:
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getIdCodigo() {
        return idCodigo;
    }

    public void setIdCodigo(int idCodigo) {
        this.idCodigo = idCodigo;
    }

    //Metodo de extraccion y deposito;
    public void depositar(float monto) {
        if (monto > 0) {
            saldo = saldo + monto;
        } else {
            System.out.println("Monto ingresado no valido!");
        }
    }

    public void extraer(float monto) {
        if (monto > 0 && saldo >= monto) {
            saldo = saldo - monto;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    //Metodo toString -> muestra por la salida estandar o pantalla los datos;
    @Override
    public String toString() {
        return "La cuenta bancaria del titular: " + titular + ", tiene un saldo de: " + saldo + ", y el Codigo de cuenta es: " + idCodigo;
    }

}
