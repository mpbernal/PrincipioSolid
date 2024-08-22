/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principioliskov;

/**
 *
 * @author sala4
 */
public class ConfiguracionSistema implements RecursoPersistente, Notificable {
    @Override
    public void load() {
        System.out.println("Configuración sistema cargada");
    }

    @Override
    public void save() {
        System.out.println("Configuración sistema almacenada");
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Notificación de sistema: " + mensaje);
    }
}
