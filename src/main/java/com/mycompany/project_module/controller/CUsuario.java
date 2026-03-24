/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_module.controller;

import com.mycompany.project_module.module.Usuario;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class CUsuario {
    
    
    public void registrarUsuario(Usuario user){
             Statement st;
        try {
            st = Conexion.getConect().createStatement();
            st.execute("insert into usuarios values ('"
                    + user.getId() + "','"
                    + user.getNombre() + "','"
                    + user.getApellido() + "','"
                    + user.getTipoDeSangre() + "','"
                    + user.getCargo() + "','"
                    + user.getEmail() + "','"
                    + user.getPassword() + "')");

            JOptionPane.showMessageDialog(null, "Usuario Registrado");

        } catch (SQLException ex) {
            Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Registro falló");
        }
        
    }
        
     
    public void eliminarUsuarios(){
        
    }
      
}
