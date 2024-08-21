/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principioocp;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author johan
 */
public class Figuras {
private List<Figura> figuras;

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public void dibujarFiguras() {
        for (Figura figura : figuras) {
            figura.dibujar();
        }
    }
}
