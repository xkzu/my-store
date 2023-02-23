package cl.ds.app.mystore.model.entity;

import lombok.Data;

@Data
public class Gpu {

    private String modelo;

    private String memoria;

    private String frecuenciaCore;

    private String frecuenciaMemorias;

    private String bus;

    private String fabricante;

    public Gpu() {
    }

    public Gpu(String modelo, String memoria, String frecuenciaCore, String frecuenciaMemorias, String bus, String fabricante) {
        this.modelo = modelo;
        this.memoria = memoria;
        this.frecuenciaCore = frecuenciaCore;
        this.frecuenciaMemorias = frecuenciaMemorias;
        this.bus = bus;
        this.fabricante = fabricante;
    }
}
