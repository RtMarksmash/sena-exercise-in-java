/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_module.controller;

import com.mycompany.project_module.view.VUsuario;

/**
 *
 * @author USUARIO
 */
public class CPantalla {
     private static VUsuario pantalla;

    public static void abrirPantalla() {

        pantalla = new VUsuario();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);

    }
    
}
