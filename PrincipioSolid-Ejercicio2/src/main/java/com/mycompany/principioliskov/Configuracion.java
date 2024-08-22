/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principioliskov;

/**
 *
 * @author Mpbernal09
 */
import java.util.ArrayList;
import java.util.List;

public class Configuracion {
    private List<RecursoPersistente> conf = new ArrayList<>();
    
    public void cargarConfiguracion() {
        conf.add(new ConfiguracionSistema());
        conf.add(new ConfiguracionUsuario());
        conf.add(new ConfiguracionHoraria());
        
        for (RecursoPersistente recurso : conf) {
            recurso.load();
            if (recurso instanceof Notificable) {
                ((Notificable) recurso).enviarNotificacion("Configuración cargada con éxito");
            }
        }
    }
    
    public void salvarConfiguracion() {
        for (RecursoPersistente recurso : conf) {
            recurso.save();
            if (recurso instanceof Notificable) {
                ((Notificable) recurso).enviarNotificacion("Configuración guardada con éxito");
            }
        }
    }
    
    public static void main(String[] args) {
        Configuracion configuracion = new Configuracion();
        configuracion.cargarConfiguracion();
        configuracion.salvarConfiguracion();
    }
}

