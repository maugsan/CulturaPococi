/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jonathan
 */
public class DataLogin extends DataBase{

    public void selectUsuarios() throws SQLException{
        String sql = "Select * from usuarioNormal;";
        ResultSet resultado;
        Connection conexion = super.getConexion();
    
        Statement statement = conexion.createStatement(); 
        resultado=statement.executeQuery(sql);
        
        String temp="";
        while (resultado.next()) { 
            System.out.println("1: "+resultado.getString(1));
            System.out.println("2: "+resultado.getString(2));
          
        }//fin while
        statement.close();
        conexion.close();
    }//fin selectPeliculas

}
