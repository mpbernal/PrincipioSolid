/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principiosolid;


/**
 *
 * @author wsant
 */
import java.util.Date;

public class Factura {
    public String codigo;
    public Date fechaEmision;
    public float importeFactura;
    public float importeIVA;
    public float importeDeduccion;
    public float importeTotal;
    public int porcentajeDeduccion;

    public Factura(String codigo, Date fechaEmision, float importeFactura, int porcentajeDeduccion) {
        this.codigo = codigo;
        this.fechaEmision = fechaEmision;
        this.importeFactura = importeFactura;
        this.porcentajeDeduccion = porcentajeDeduccion;
    }

    // Método que delega el cálculo del total de la factura
    public void calcularTotal(CalculadoraDeduccion calculadoraDeduccion, CalculadoraIVA calculadoraIVA) {
        this.importeDeduccion = calculadoraDeduccion.calcularDeduccion(importeFactura, porcentajeDeduccion);
        this.importeIVA = calculadoraIVA.calcularIVA(importeFactura);
        this.importeTotal = (importeFactura - importeDeduccion) + importeIVA;
    }
}
