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
Vector<Cuadrado> cuadrados=new Vector<Cuadrado>();
Vector<Circulo> circulos= new Vector<Circulo>();
public void addCirculo(Circulo c){
circulos.add(c);
}
public void addCuadrado(Cuadrado c){
cuadrados.add(c);
}
public void dibujarFiguras(){
Enumeration<Cuadrado> cuads=cuadrados.elements();
Cuadrado c;
while (cuads.hasMoreElements()){
c=cuads.nextElement();
c.dibujar();
}
Enumeration<Circulo> circs=circulos.elements();
Circulo ci;
while (cuads.hasMoreElements()){
ci=circs.nextElement();
ci.dibujar();
}
}
}
