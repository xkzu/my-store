package cl.ds.app.mystore.model.entity;

import lombok.Data;

@Data
public class Hdd {

    private String fabricante;

    private String capacidad;

    private String rpm;

    private String tamano;

    private String bus;

    public Hdd() {
    }

    public Hdd(String fabricante, String capacidad, String rpm, String tamano, String bus) {
        this.fabricante = fabricante;
        this.capacidad = capacidad;
        this.rpm = rpm;
        this.tamano = tamano;
        this.bus = bus;
    }
}
