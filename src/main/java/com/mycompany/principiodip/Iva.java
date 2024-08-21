/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principiodip;

/**
 *
 * @author johan
 */
public class Iva implements IIva {
    @Override
    public float calculaIva(float importe) {
        // Implementación del cálculo del IVA
        return importe * 0.21f; // Ejemplo con un IVA del 21%
    }
    
}
