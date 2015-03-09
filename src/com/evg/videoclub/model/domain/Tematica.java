package com.evg.videoclub.model.domain;

import java.util.List;

/**
 * Created by fjmontesinos on 16/2/15.
 */
public class Tematica {

    private int id;
    private String nombre;

    private List<Pelicula> peliculas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
}
