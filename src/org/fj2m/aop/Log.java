package org.fj2m.aop;

/**
 * Created by Angelio Manuel on 24/02/2015.
 */
public class Log {
    private long id;
    private Tabla tabla;
    private String campo;
    private Object valorPrevio;
    private Object valorNuevo;

    public Log() {
        this.tabla = new Tabla();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Tabla getTabla() {
        return tabla;
    }

    public void setTabla(Tabla tabla) {
        this.tabla = tabla;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public Object getValorPrevio() {
        return valorPrevio;
    }

    public void setValorPrevio(Object valorPrevio) {
        this.valorPrevio = valorPrevio;
    }

    public Object getValorNuevo() {
        return valorNuevo;
    }

    public void setValorNuevo(Object valorNuevo) {
        this.valorNuevo = valorNuevo;
    }
}
