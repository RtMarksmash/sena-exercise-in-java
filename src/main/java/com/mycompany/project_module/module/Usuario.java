/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_module.module;

/**
 *
 * @author USUARIO
 */
public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String tipoDeSangre;
    private Integer cargo;
    private String email;
    private String password;

    public Usuario(int id, String nombre, String apellido, String tipoDeSangre, int cargo, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDeSangre = tipoDeSangre;
        this.cargo = cargo;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public Integer getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
          
    
}
