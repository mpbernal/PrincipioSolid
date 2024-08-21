/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segragacioninterfaces;

/**
 *
 * @author dgarc
 */
public class GmailAccount implements ContactInfo {
    private String name;
    private String emailAddress;

    public GmailAccount(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    // Métodos de ContactInfo
    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String getTelephone() {
        // GmailAccount no tiene un número de teléfono, retornamos null o un valor predeterminado
        return null;
    }

    // Métodos adicionales
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}