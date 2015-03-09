package org.fj2m.aop;

/**
 * Created by fjmontesinos on 25/2/15.
 */
public class AuditoriaAdvice {

    private AuditoriaService auditoriaService;
    private EntidadesService entidadesService;
    
    public Object invoke(Object returnObject, String method){
        long id = 12;
        // obtener la entidad antes de acutalizar
        EntidadAuditable objetoA = this.entidadesService.getEntidadById(id);

        // ejecutar tarea concreta
        executeAction();

        // obtener la entidad despues
        EntidadAuditable objetoB = this.entidadesService.getEntidadById(id);



        this.auditoriaService.persist(objetoA.comparar(objetoB));
        return null;
    }

    private void executeAction(){
        System.out.println("Ejecutar tarea de actualización... que se desea auditar");
    }
}
