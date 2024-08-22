/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.principioliskov;

/**
 *
 * @author sala4
 */
public interface RecursoPersistente {
    void load();
    void save(); // El método save sigue siendo requerido, pero ahora cada clase debe manejar el caso de no soportar la operación
}
