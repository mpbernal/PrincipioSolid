/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principiosolid;

/**
 *
 * @author wsant
 */


import java.util.Date;


public class Main {
    public static void main(String[] args) {
        // Ejemplo 1: Factura con código "0"
        Factura factura1 = new Factura("0", new Date(), 12000.0f, 10);
        CalculadoraDeduccion calculadoraDeduccion = new CalculadoraDeduccion();
        CalculadoraIVA calculadoraIVA = new CalculadoraIVA(0.18f);

        factura1.calcularTotal(calculadoraDeduccion, calculadoraIVA);

        System.out.println("Factura con código 0");
        System.out.println("Importe Factura: " + factura1.importeFactura);
        System.out.println("Importe Deducción: " + factura1.importeDeduccion);
        System.out.println("Importe IVA: " + factura1.importeIVA);
        System.out.println("Importe Total: " + factura1.importeTotal);

        // Ejemplo 2: Factura con código distinto de "0"
        Factura factura2 = new Factura("A123", new Date(), 12000.0f, 10);

        factura2.calcularTotal(calculadoraDeduccion, calculadoraIVA);

        System.out.println("\nFactura con código A123");
        System.out.println("Importe Factura: " + factura2.importeFactura);
        System.out.println("Importe Deducción: " + factura2.importeDeduccion);
        System.out.println("Importe IVA: " + factura2.importeIVA);
        System.out.println("Importe Total: " + factura2.importeTotal);
    }
}
