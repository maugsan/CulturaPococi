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
import javax.swing.JOptionPane;


/**
 *
 * @author jonathan
 */
public class DataCategoria extends DataBase{
    
    
      public void eliminarCategoria(String id) throws SQLException {

        String sql2 = "DELETE FROM `perfil` WHERE  `idCategoria` = '"+id+"';";   
        String sql = "DELETE FROM `categoria` WHERE `idCategoria` = '"+id+"';";
        

        Connection conexion = super.getConexion();
        
       try {
            Statement statement = conexion.createStatement();
            statement.execute(sql2);
            statement.execute(sql);
            


            statement.close();
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            conexion.close();
        }
       
    }

    
    
    public LinkedList<Categoria> selectCategorias() throws SQLException {
        
        LinkedList<Categoria> listaCategorias = new LinkedList<Categoria>();
        Categoria categoria;
        String sql = "select * from categoria;";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        try {
            Statement statement = conexion.createStatement();
            resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                categoria = new Categoria(resultado.getString("nombreCategoria"), 
                        resultado.getInt("idCategoria"), resultado.getInt("superID"));
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
     public LinkedList<Categoria> selectSuperCategorias() throws SQLException {
        LinkedList<Categoria> listaCategorias = new LinkedList<Categoria>();
        Categoria categoria;
        String sql = "select * from superCategoria;";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        try {
            Statement statement = conexion.createStatement();
            resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                categoria = new Categoria(resultado.getString("nombre"), 
                        resultado.getInt("id"), 3);
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
     
    public LinkedList<Categoria> selectCategoriasXSuper(int s) throws SQLException {
        LinkedList<Categoria> listaCategorias = new LinkedList<Categoria>();
        Categoria categoria;
        String sql = "select * from categoria where superID ='"+s+"' order by nombreCategoria;";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        try {
            Statement statement = conexion.createStatement();
            resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                categoria = new Categoria(resultado.getString("nombreCategoria"), 
                        resultado.getInt("idCategoria"), resultado.getInt("superID"));
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
    
    
    public boolean crearCategoria(String categoria, String s) throws SQLException {

        String sql = "insert into categoria(`nombreCategoria`,`superID`) values ('"+categoria+"','"+s+"');";
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
    
  
}
