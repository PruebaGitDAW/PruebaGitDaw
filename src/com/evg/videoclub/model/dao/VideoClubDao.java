package com.evg.videoclub.model.dao;

import com.evg.videoclub.model.domain.Pelicula;

import java.util.List;

/**
 * Created by fjmontesinos on 16/2/15.
 */
public interface VideoClubDao {

    List<Pelicula> filtrarPeliculas(String titulo, int anio);
}
