/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principiodip;

/**
 *
 * @author johan
 */
public class Deduccion implements IDeduccion {
    @Override
    public float calculaDeduccion(float importe, int porcentaje) {
        // Implementación del cálculo de deducción
        return (importe * porcentaje) / 100;
    }
}
