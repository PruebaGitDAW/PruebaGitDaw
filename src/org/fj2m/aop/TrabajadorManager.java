package org.fj2m.aop;

/**
 * Created by fjmontesinos on 25/2/15.
 */
public class TrabajadorManager implements EntidadesService {


    public EntidadAuditable getEntidadById(long id) {
        Trabajador t = new Trabajador();
        return t;
    }
}
