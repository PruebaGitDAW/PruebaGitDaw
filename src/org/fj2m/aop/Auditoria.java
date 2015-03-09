package org.fj2m.aop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Angelio Manuel on 24/02/2015.
 */
public class Auditoria {
    private String prefijoTablas;
    private long id;
    private int padreId;
    private Date fecha;

    private List<Log> logs;

    public Auditoria() {

        this.logs = new ArrayList<Log>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPadreId() {
        return padreId;
    }

    public void setPadreId(int padreId) {
        this.padreId = padreId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Log> getLogs() {
        return logs;
    }

    public void setLogs(List<Log> logs) {
        this.logs = logs;
    }

    public String getPrefijoTablas() {
        return prefijoTablas;
    }

    public void setPrefijoTablas(String prefijoTablas) {
        this.prefijoTablas = prefijoTablas;
    }
}
