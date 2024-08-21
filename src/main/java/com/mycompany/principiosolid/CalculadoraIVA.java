/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principiosolid;

/**
 *
 * @author wsant
 */
public class CalculadoraIVA {
    private final float tasaIVA;

    public CalculadoraIVA(float tasaIVA) {
        this.tasaIVA = tasaIVA;
    }

    public float calcularIVA(float importeFactura) {
        return importeFactura * tasaIVA;
    }
}
