package com.evg.videoclub.model.domain;

import java.util.List;

/**
 * Created by fjmontesinos on 16/2/15.
 */
public interface VideoClubService {

    List<Pelicula> filtrarPeliculas(String titulo, int anio);

    Pelicula getPelicularById(int id);

    List<Identidad> buscarIdentidadByApellidos(int tipoIdentidad, String patronApellidos);
}
