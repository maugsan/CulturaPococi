/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**hjhjhjhjhiuhiuhiuhiuhiuhiu
 *   
 * @author jonathan
 */
public class DataBase {
    
    private String usuario;
    private String contra;
    private String host;
    private String baseDatos;
    private Connection con;
    
    public Connection getConexion() throws SQLException {

        this.usuario = "elfrente_user";
        this.contra = "root1234";
        this.baseDatos = "elfrente_pagina";
       
        this.host = "jdbc:mysql://mysql1001.mochahost.com:3306/"  + baseDatos;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            this.con = (Connection) DriverManager.getConnection(host, usuario, contra);
           
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "INCORRECTO!!");
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
