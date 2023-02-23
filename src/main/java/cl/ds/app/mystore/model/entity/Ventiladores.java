package cl.ds.app.mystore.model.entity;

import lombok.Data;

@Data
public class Ventiladores {

    private String fabricante;

    private String rgb;

    private String flujoDeAire;

    private String rpm;

    private String ruido;

    private String tamano;

    public Ventiladores() {
    }

    public Ventiladores(String fabricante, String rgb, String flujoDeAire, String rpm, String ruido, String tamano) {
        this.fabricante = fabricante;
        this.rgb = rgb;
        this.flujoDeAire = flujoDeAire;
        this.rpm = rpm;
        this.ruido = ruido;
        this.tamano = tamano;
    }
}
