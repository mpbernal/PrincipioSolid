/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.segragacioninterfaces;

/**
 *
 * @author dgarc
 */
public class SegragacionInterfaces {

   public static void main(String[] args) {
        GmailAccount gmailAccount = new GmailAccount("John Doe", "john.doe@gmail.com");
        String message = "Hello, this is a test email.";
        EmailSender.sendEmail(gmailAccount, message);
    }
    }

