/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segragacioninterfaces;

/**
 *
 * @author dgarc
 */
public class EmailSender {
   public static void sendEmail(ContactInfo c, String message) {
        String emailAddress = c.getEmailAddress();
        if (emailAddress != null) {
            System.out.println("Enviando correo electrónico a: " + emailAddress);
            // Implementar lógica para enviar el correo electrónico
        } else {
            System.out.println("La dirección de correo electrónico es nula.");
        }
    }

}
