/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.LoginView;

/**
 *
 * @author EmilioMP
 */

public class Principal {
    private static LoginView vista;
    public static void main(String[] args) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            vista = new LoginView();
            vista.setTitle("Login");
            vista.setVisible(true);
        });
    }
}
