package com.evg.videoclub.model.domain;

import com.evg.videoclub.model.dao.VideoClubDao;

import java.util.List;

/**
 * Created by fjmontesinos on 16/2/15.
 */
public class VideoClubManager implements VideoClubService {

    private VideoClubDao videoClubDao;


    @Override
    public List<Pelicula> filtrarPeliculas(String titulo, int anio) {
        return videoClubDao.filtrarPeliculas(titulo, anio);
    }

    @Override
    public Pelicula getPelicularById(int id) {
        return null;
    }

    @Override
    public List<Identidad> buscarIdentidadByApellidos(int tipoIdentidad, String patronApellidos) {
        return null;
    }
}
