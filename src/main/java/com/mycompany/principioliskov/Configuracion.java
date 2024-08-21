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

public class Configuracion { // este es la clase creada para que lea la configuración
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
            try {
                recurso.save();
            } catch (UnsupportedOperationException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void main(String[] args) {
        Configuracion configuracion = new Configuracion();
        configuracion.cargarConfiguracion();
        configuracion.salvarConfiguracion();
    }
}
