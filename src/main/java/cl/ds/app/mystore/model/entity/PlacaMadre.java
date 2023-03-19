package cl.ds.app.mystore.model.entity;

import lombok.Data;

@Data

public class PlacaMadre {

    private String id;

    private String socket;

    private String chipset;

    private String memorias;

    private String formato;

    private String fabricante;

    public PlacaMadre() {
    }
}