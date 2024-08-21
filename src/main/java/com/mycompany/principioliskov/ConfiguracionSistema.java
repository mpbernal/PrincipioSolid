/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principioliskov;

/**
 *
 * @author sala4
 */
public class ConfiguracionSistema implements RecursoPersistente{
public void load(){
System.out.println("Configuracion sistema cargada");
}
public void save(){
System.out.println("Configuracion sistema almacenada");
}
}