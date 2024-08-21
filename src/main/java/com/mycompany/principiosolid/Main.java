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
        Factura factura = new Factura("F001", new Date(), 1000.0f, 10);
        CalculadoraDeduccion calculadoraDeduccion = new CalculadoraDeduccion();
        CalculadoraIVA calculadoraIVA = new CalculadoraIVA(0.16f);

        factura.calcularTotal(calculadoraDeduccion, calculadoraIVA);

        System.out.println("Importe Factura: " + factura.importeFactura);
        System.out.println("Importe Deducción: " + factura.importeDeduccion);
        System.out.println("Importe IVA: " + factura.importeIVA);
        System.out.println("Importe Total: " + factura.importeTotal);
    }
}
