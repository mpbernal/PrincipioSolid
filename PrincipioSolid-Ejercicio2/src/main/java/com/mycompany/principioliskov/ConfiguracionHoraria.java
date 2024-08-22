/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principioliskov;

/**
 *
 * @author jeramos61
 */
public class ConfiguracionHoraria implements RecursoPersistente, Notificable {
    @Override
    public void load() {
        System.out.println("Configuración horaria cargada");
    }

    @Override
    public void save() {
        System.out.println("Configuración horaria no puede ser almacenada");
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Configuración horaria no envía notificaciones.");
    }
}


