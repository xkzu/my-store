package cl.ds.app.mystore.model.entity;

import lombok.Data;

@Data

public class PlacaMadre {

    private String socket;

    private String chipset;

    private String memorias;

    private String foramto;

    private String fabricante;

    public PlacaMadre() {
    }

    public PlacaMadre(String socket, String chipset, String memorias, String foramto, String fabricante) {
        this.socket = socket;
        this.chipset = chipset;
        this.memorias = memorias;
        this.foramto = foramto;
        this.fabricante = fabricante;
    }
}
