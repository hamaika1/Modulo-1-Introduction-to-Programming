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

    //Metodos:
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

}
