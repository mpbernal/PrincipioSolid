/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principiodip;

import java.util.Date;

/**
 *
 * @author johan
 */
public class Factura {
public String codigo;
    public Date fechaEmision;
    public float importeFactura;
    public float importeIVA;
    public float importeDeduccion;
    public float importeTotal;
    public int porcentajeDeduccion;
    
    private final IDeduccion deduccion;
    private final IIva iva;

    // Constructor donde se inyectan las dependencias
    public Factura(IDeduccion deduccion, IIva iva) {
        this.deduccion = deduccion;
        this.iva = iva;
    }

    // Método que calcula el total de la factura
    public void calcularTotal() {
        // Calculamos la deducción
        importeDeduccion = deduccion.calculaDeduccion(importeFactura, porcentajeDeduccion);
        // Calculamos el IVA
        importeIVA = iva.calculaIva(importeFactura);
        // Calculamos el total
        importeTotal = (importeFactura - importeDeduccion) + importeIVA;
    }
}
