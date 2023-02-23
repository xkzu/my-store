package cl.ds.app.mystore.model.entity;

import lombok.Data;

@Data
public class Gabinete {

    private String formato;

    private String fabricante;

    private String ubicacionFuente;

    private String panelLateral;

    private String ventiladores;

    private String rgb;

    public Gabinete() {
    }

    public Gabinete(String formato, String fabricante, String ubicacionFuente, String panelLateral, String ventiladores, String rgb) {
        this.formato = formato;
        this.fabricante = fabricante;
        this.ubicacionFuente = ubicacionFuente;
        this.panelLateral = panelLateral;
        this.ventiladores = ventiladores;
        this.rgb = rgb;
    }
}
