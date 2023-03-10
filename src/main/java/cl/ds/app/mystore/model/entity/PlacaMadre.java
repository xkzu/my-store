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

    public PlacaMadre(String id, String socket, String chipset, String memorias, String formato, String fabricante) {
        this.id = id;
        this.socket = socket;
        this.chipset = chipset;
        this.memorias = memorias;
        this.formato = formato;
        this.fabricante = fabricante;
    }
}
