package org.fj2m.aop;

import java.util.Date;

/**
 * Created by fjmontesinos on 25/2/15.
 */
public class Trabajador implements EntidadAuditable {
    
    private String id;
    private String nombre;
    private String apellidos;


    public Auditoria comparar(Object compararCon) {
        if(! (compararCon instanceof Trabajador) ){
            throw new RuntimeException("La objeto debe ser comparado con objetos de su misma clase");
        }

        Auditoria audi = new Auditoria();
        audi.setFecha(new Date());
        //...
        if(this.id != ((Trabajador) compararCon).id){
            audi.getLogs().add(new Log());
        }

        return audi;
    }
}
