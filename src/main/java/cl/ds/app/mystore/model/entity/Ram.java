package cl.ds.app.mystore.model.entity;

import lombok.Data;

@Data
public class Ram {

    private String capacidad;

    private String tipo;

    private String frecuencia;

    private String formato;

    private String fabricante;

    private String voltaje;

    private String rgb;

    public Ram() {
    }

    public Ram(String capacidad, String tipo, String frecuencia, String formato, String fabricante, String voltaje, String rgb) {
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.frecuencia = frecuencia;
        this.formato = formato;
        this.fabricante = fabricante;
        this.voltaje = voltaje;
        this.rgb = rgb;
    }
}
