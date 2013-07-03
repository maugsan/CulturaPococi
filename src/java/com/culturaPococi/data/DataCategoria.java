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
    
    
    public LinkedList<Categoria> selectCategorias() throws SQLException {
        LinkedList<Categoria> listaCategorias = new LinkedList<Categoria>();
        Categoria categoria = new Categoria();
        String sql = "select * from categoria;";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        try {
            Statement statement = conexion.createStatement();
            resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                categoria = new Categoria(resultado.getString("nombreCategoria"), 
                        resultado.getInt("idCategoria"));
                listaCategorias.add(categoria);
            }//fin while

            statement.close();
        } catch (Exception e) {
            listaCategorias = null;
        } finally {
            conexion.close();
        }

        return listaCategorias;
    }//fin selectCategoria
     
     
    public LinkedList<Categoria> ordenarPrimeraCategoria(int idArticulo) throws SQLException {
        LinkedList<Categoria> listaCategorias;
        LinkedList<Categoria> listaOrdenadaCategorias = new LinkedList<Categoria>();
        listaCategorias = selectCategorias();
        if (listaCategorias != null) {
            for (int i = 0; i < listaCategorias.size(); i++) {
               
                if (listaCategorias.get(i).getIdCategoria() == idArticulo) {
                    listaOrdenadaCategorias.addFirst(listaCategorias.get(i));
                } else {
                    listaOrdenadaCategorias.add(listaCategorias.get(i));
                }//fin if
            }//fin for
        }else{
            listaOrdenadaCategorias=null;
        }
        return listaOrdenadaCategorias;
    }//fin ordenarPrimeraCategoria
    
    
    public boolean crearCategoria(String categoria) throws SQLException {

        String sql = "insert into categoria(`nombreCategoria`) values ('"+categoria+"');";
        boolean accionRealizada = true;
        Connection conexion = super.getConexion();

        try {
            Statement st = conexion.createStatement();
  
            st.executeUpdate(sql);
            st.close();
        } catch (Exception e) {
            accionRealizada = false;
        } finally {
            conexion.close();
        }//fin try

        return accionRealizada;
    }
    
     public void eliminarCategoria(String categoria) throws SQLException {
         
        String sql = "delete from categoria where nombreCategoria='"+categoria+"';";
      
        Connection conexion = super.getConexion();
        
        Statement st = conexion.createStatement();
        
        st.executeUpdate(sql);
       
        st.close();
        conexion.close();
    }
}
