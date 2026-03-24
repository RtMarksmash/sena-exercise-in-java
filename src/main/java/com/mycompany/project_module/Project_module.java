/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project_module;

import com.mycompany.project_module.controller.Conexion;
import com.mycompany.project_module.controller.CPantalla;

/**
 *
 * @author USUARIO
 */
public class Project_module {

     public static void main(String[] args) {
        Conexion.conectar();
        CPantalla.abrirPantalla();
    }
}
