package org.fj2m.aop;

/**
 * Created by fjmontesinos on 25/2/15.
 */
public class AuditoriaServiceImpl implements AuditoriaService {
    public void persist(Auditoria auditoria) {
        System.out.println("crear transacción");
        System.out.println("auditar " + auditoria.getPrefijoTablas() + " : " + auditoria.toString());
        for(Log log : auditoria.getLogs()){
            System.out.println("Auditar cada campo " + log.toString());
        }
        System.out.println("finalizar transacción");
    }
}
