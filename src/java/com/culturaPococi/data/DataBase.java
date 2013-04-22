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

/**
 *
 * @author jonathan
 */
public class DataBase {
    
    private String usuario;
    private String contra;
    private String host;
    private String baseDatos;
    private Connection con;
    
    
    public Connection getConexion()throws SQLException{
        this.usuario="videoclub2";
        this.contra="VideoClub2!";
        this.baseDatos="videoclub2";
        this.host= "jdbc:mysql://184.168.194.14:3306/videoclub2";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = (Connection)DriverManager.getConnection(host, usuario,contra);
            System.out.println("Conecto");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE,null,ex);
        }

    return con;
    }
    
}
