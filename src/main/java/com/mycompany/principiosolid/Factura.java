/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principiosolid;

import java.util.Date;

/**
 *
 * @author wsant
 */
public class Factura {
public String codigo;
public Date fechaEmision;
public float importeFactura;
public float importeIVA;
public float importeDeduccion;
public float importeTotal;
public int porcentajeDeduccion;
    // Método que calcula el total de la factura
    public void calcularTotal() {
    // Calculamos la deducción
        importeDeduccion = (importeFactura * porcentajeDeduccion) / 100;
    // Calculamos el IVA
        importeIVA = (float) (importeFactura * 0.16);
    // Calculamos el total
        importeTotal = (importeFactura - importeDeduccion) + importeIVA;
    }
}