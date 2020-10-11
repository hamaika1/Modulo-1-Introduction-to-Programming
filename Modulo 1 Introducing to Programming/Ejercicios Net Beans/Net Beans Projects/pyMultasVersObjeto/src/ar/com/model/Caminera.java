package ar.com.model;

/**
 *
 * @author mateo
 */
public class Caminera {

    //Definimos los atributos --> en este caso es un Vector de multa;
    private Multa multas[];
    private int ultimaCarga;

    //Definimos el constructores;
    public Caminera(int cantMulta) {
        multas = new Multa[cantMulta];
        ultimaCarga = 0;
    }

    //Definimos el metodo getter;
    public Multa[] getMultas() {
        return multas;
    }

    //Definimos el metodo para registrar las multas;
    public boolean registrarMulta(Multa multa) {
        boolean flag = false;
        if (ultimaCarga < multas.length) {
            multas[ultimaCarga] = multa;
            flag = true;
            ultimaCarga++;
        }
        return flag;
    }

    //Definimos el metodo para calcular el total;
    public float calcularTotal() {
        float auxContador = 0;
        //For each:
        for (Multa multa : multas) {
            if (multa != null) {
                auxContador += multa.calcularMonto();
            }
        }
        return auxContador;
    }

    //Definimos el metodo para contabilizar los codigos de las multas;
    public int[] contabilizarCodigosMultas() {
        int conteo[] = new int[20];
        int posicion;
        //Contar codigos de actas labradas!
        for (int i = 0; i < multas.length; i++) {
            posicion = multas[i].getCodigo() - 1;//Si leo el codigo 3, cuento o esta en la posicion 2 del vector;
            conteo[posicion]++;//De esta manera accedo de manera directa a la posicion del codigo!

        }

        return conteo;
    }

    //Definimos el metodo para buscar la mayor frecuencia de codigo de multa y mostrarlo;
    public String mostrarMayorCodigo() {
        String aux;
        int mayor, codMayor;
        int conteo[] = this.contabilizarCodigosMultas();

        mayor = conteo[0];
        codMayor = 1;

        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] > mayor) {
                mayor = conteo[i];
                codMayor = i + 1;
            }
        }
        aux = "Codigo de infraccion mas frecuente: " + codMayor + ", con " + mayor + " actas labradas.";
        return aux;
    }

    //Definimos el metodo para mostrar todas las multas registradas por la caminera;
    public String mostrarMultas() {
        StringBuilder aux = new StringBuilder("");

        for (Multa multa : multas) {
            if (multa != null) {
                aux.append(multa.mostrarMulta()).append("\n");
            }
        }

        return aux.toString();
    }
}
