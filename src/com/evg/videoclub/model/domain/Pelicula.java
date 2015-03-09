package com.evg.videoclub.model.domain;

import java.util.List;

/**
 * Created by fjmontesinos on 16/2/15.
 */
public class Pelicula {

    private int id;
    private String titulo;
    private String argumento;
    private int anio;
    private String[] tags;

    private List<Identidad> directores;
    private List<Identidad> actores;
    private Tematica tematica;

    public Pelicula(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArgumento() {
        return argumento;
    }

    public void setArgumento(String argumento) {
        this.argumento = argumento;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
