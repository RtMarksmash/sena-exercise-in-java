/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_module.controller;

import com.mycompany.project_module.module.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class CUsuario {
     public ResultSet consultarEstudiante() {

    ResultSet rs = null;
    Statement st;

    try {
        st = Conexion.getConect().createStatement();
        rs = st.executeQuery("select * from usuarios");
        
    } catch (SQLException ex) {
        Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
    }

    return rs;
}
    
    public ResultSet consultarEstudiantePorId(int id) {

    ResultSet rs = null;
    Statement st;

    try {
        st = Conexion.getConect().createStatement();
        rs = st.executeQuery("select * from usuarios where id_usuario='" + id + "'");

    } catch (SQLException ex) {
        Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
    }

    return rs;
}
    
    
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
    
    public void modificarUsuarios(Usuario u){
          Statement st;
    try {
        st = Conexion.getConect().createStatement();
        st.execute("UPDATE usuarios SET "
        + "nombre='" + u.getNombre() + "', "
        + "apellido='" + u.getApellido() + "', "
        + "tipo_de_sangre='" + u.getTipoDeSangre() + "', "
        + "cargo=" + u.getCargo() + ", "
        + "email='" + u.getEmail() + "', "
        + "password='" + u.getPassword() + "' "
        + "WHERE id_usuario=" + u.getId());
        JOptionPane.showMessageDialog(null, "Usuario Actualizado");

    } catch (SQLException ex) {
        Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Fallo actualizacion");
    }
    }
        
     
    public void eliminarUsuarios(int id){
              Statement st;
    try {
        st = Conexion.getConect().createStatement();
        st.execute("delete from usuarios where id_usuario='" + id + "'");

        JOptionPane.showMessageDialog(null, "Usuario Eliminado");

    } catch (SQLException ex) {
        Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Fallo Eliminación");
    }
        
    }
    
    public boolean existeCargo(int idCargo){
        boolean existe=false;
        Statement st;
        
        try{
        st=Conexion.getConect().createStatement();
        String sql = "SELECT id_cargo FROM cargo WHERE id_cargo = " + idCargo;
        ResultSet rs = st.executeQuery(sql);
        if (rs.next()) {
            existe = true;
        }
        }catch(SQLException ex){
            Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error en la consulta");
        }    
        return existe;
    }   
    
    public void pintarTabla(JTable tabla, ResultSet rs) {

    DefaultTableModel modelo = new DefaultTableModel();

    modelo.addColumn("Id");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido");
    modelo.addColumn("TipoDeSangre");
    modelo.addColumn("Cargo");
    modelo.addColumn("Email");
    modelo.addColumn("Password");

    try {
        while (rs.next()) {

            String[] fila = {
                rs.getString("id_usuario"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getString("tipo_de_sangre"),
                rs.getString("cargo"),
                rs.getString("email"),
                rs.getString("password")
                        
            };

            modelo.addRow(fila);
        }

        tabla.setModel(modelo);

    } catch (SQLException ex) {
        Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "error al pintar la tabla");
    }
    
}
}
