/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segragacioninterfaces;

/**
 *
 * @author dgarc
 */
public class SMSSender {
 public static void sendSMS(ContactInfo c, String message) {
        String telephone = c.getTelephone();
        // Envía un mensaje SMS al número de teléfono
        System.out.println("Enviando SMS al número: " + telephone);
        // Implementar lógica para enviar el SMS
    }
}
