/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principioliskov;

/**
 *
 * @author sala4
 */
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Configuracion { //Se actualiza la clase
    private List<RecursoPersistente> conf = new ArrayList<>();
    
    public void cargarConfiguracion() {
        conf.add(new ConfiguracionSistema());
        conf.add(new ConfiguracionUsuario());
        conf.add(new ConfiguracionHoraria());
        
        for (RecursoPersistente recurso : conf) {
            recurso.load();
        }
    }
    
    public void salvarConfiguracion() {
        for (RecursoPersistente recurso : conf) {
            recurso.save();
        }
    }
    
    public static void main(String[] args) {
        Configuracion configuracion = new Configuracion();
        configuracion.cargarConfiguracion();
        configuracion.salvarConfiguracion();
    }
}
