/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principioliskov;

/**
 *
 * @author sala4
 */
public class ConfiguracionHoraria implements RecursoPersistente {
    @Override
    public void load() {
        System.out.println("Configuracion horaria cargada");
    }

    @Override
    public void save() {
        // Informar que no se puede guardar sin lanzar una excepción inesperada
        System.out.println("Configuracion horaria no puede ser almacenada");
    }
}
