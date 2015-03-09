package com.evg.videoclub.model.dao;

import com.evg.videoclub.model.domain.Pelicula;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fjmontesinos on 16/2/15.
 */
public class TestVideoClubDao implements VideoClubDao {

    private List<Pelicula> lista = null;

    public TestVideoClubDao() {
        lista = new ArrayList<Pelicula>();
        for(int i = 0; i <10; i++){
            lista.add(new Pelicula(i, "título " + i));
        }
    }

    @Override
    public List<Pelicula> filtrarPeliculas(String titulo, int anio) {
        List<Pelicula> retValue = new ArrayList<Pelicula>();

        for(Pelicula p : this.lista){
            if(p.getTitulo().indexOf(titulo) != -1)
            retValue.add(p);
        }

        return retValue;
    }
}
