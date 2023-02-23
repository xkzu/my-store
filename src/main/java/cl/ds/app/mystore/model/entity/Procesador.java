package cl.ds.app.mystore.model.entity;

import lombok.Data;

@Data

public class Procesador {

    private String frecuencia;

    private String nucleos;

    private String socket;

    private String cache;

    private String arquitectura;

    public Procesador() {
    }

    public Procesador(String frecuencia, String nucleos, String socket, String cache, String arquitectura) {
        this.frecuencia = frecuencia;
        this.nucleos = nucleos;
        this.socket = socket;
        this.cache = cache;
        this.arquitectura = arquitectura;
    }
}
