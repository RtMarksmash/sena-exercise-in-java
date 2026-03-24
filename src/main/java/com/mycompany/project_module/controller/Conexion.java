/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_module.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Conexion {
     private static Connection conect;

    public static void conectar() {
        String url = "jdbc:mysql://@localhost:3306/msa_software?serverTimeZone=UTC";
        String usr = "root";
        String ctr = "mark123456";

        try {
            conect = DriverManager.getConnection(url, usr, ctr);
            JOptionPane.showMessageDialog(null, "conexion exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "conexion fallo");

        }
      
}
    
     public static Connection getConect(){
        return conect;
    }
}
