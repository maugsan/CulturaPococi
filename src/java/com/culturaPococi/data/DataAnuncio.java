/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author jonathan
 */
public class DataAnuncio extends DataBase{
    
    public void selectPeliculas() throws SQLException{
        String sql = "Select codPelicula, titulo, totalPeliculas,subtitulada, estreno, g.codGenero, nombreGenero \n" +
                    "from pelicula_yuliana p inner join genero_yuliana g on p.codGenero=g.codGenero;";
        ResultSet resultado;
        Connection conexion = super.getConexion();
    
        Statement statement = conexion.createStatement(); 
        resultado=statement.executeQuery(sql);
        
        String temp="";
        while (resultado.next()) { 
            System.out.println("1: "+resultado.getString(1));
            System.out.println("2: "+resultado.getString(2));
            System.out.println("3: "+resultado.getString(3));
            System.out.println("4: "+resultado.getString(4));
        }//fin while
        statement.close();
        conexion.close();
    }//fin selectPeliculas
}
