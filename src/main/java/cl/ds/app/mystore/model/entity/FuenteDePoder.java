package cl.ds.app.mystore.model.entity;

import lombok.Data;

@Data
public class FuenteDePoder {

    private String fabricante;

    private String potencia;

    private String certificacion;

    private String corriente;

    private String modular;

    private String rgb;

    public FuenteDePoder() {
    }

    public FuenteDePoder(String fabricante, String potencia, String certificacion, String corriente, String modular, String rgb) {
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.certificacion = certificacion;
        this.corriente = corriente;
        this.modular = modular;
        this.rgb = rgb;
    }
}
