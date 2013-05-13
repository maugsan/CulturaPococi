/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import com.culturaPococi.dominio.Categoria;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author jonathan
 */
public class DataCategoria extends DataBase{
    
    
     public LinkedList<Categoria> selectCategorias() throws SQLException{
        LinkedList<Categoria> listaCategorias=new LinkedList<Categoria>();
        Categoria categoria=new Categoria();
        String sql = "call pListaCategorias();" ;
        ResultSet resultado;
        Connection conexion = super.getConexion();

        Statement statement = conexion.createStatement(); 
        resultado=statement.executeQuery(sql);

        while (resultado.next()) { 
            categoria=new Categoria(resultado.getString("nombreCategoria"),resultado.getInt("idCategoria"));
            listaCategorias.add(categoria);
        }//fin while

        conexion.close();
        return listaCategorias;
    }//fin selectCategoria
}
