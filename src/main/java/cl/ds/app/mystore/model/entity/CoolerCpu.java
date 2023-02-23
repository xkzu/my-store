package cl.ds.app.mystore.model.entity;

import lombok.Data;

@Data
public class CoolerCpu {

    private String id;

    private String fabricante;

    private String tipo;

    private String peso;

    private String rpm;

    private String ruido;

    private String flujoDeAire;

    private String altura;

    private String rgb;

    public CoolerCpu() {
    }

    public CoolerCpu(String id, String fabricante, String tipo, String peso, String rpm, String ruido, String flujoDeAire, String altura, String rgb) {
        this.id = id;
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.peso = peso;
        this.rpm = rpm;
        this.ruido = ruido;
        this.flujoDeAire = flujoDeAire;
        this.altura = altura;
        this.rgb = rgb;
    }
}
