/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import com.culturaPococi.dominio.Distrito;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author Pedro
 */
public class DataDistrito extends DataBase{
    
     public LinkedList<Distrito> selectDistritos() throws SQLException {
        
        LinkedList<Distrito> listaCategorias = new LinkedList<Distrito>();
        Distrito distrito;
        String sql = "SELECT * FROM `distritos`;";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        try {
            Statement statement = conexion.createStatement();
            resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                distrito = new Distrito(""+1, resultado.getString(1));
                listaCategorias.add(distrito);
            }//fin while

            statement.close();
        } catch (Exception e) {
          
        } finally {
            conexion.close();
        }

        return listaCategorias;
    }//fin selectCategoria 
}
