/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import com.culturaPococi.dominio.Articulo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author jonathan
 */
public class DataArticulo extends DataBase {

    public DataArticulo() {}
    
    public LinkedList<Articulo> selectArticulos() throws SQLException {
        LinkedList<Articulo> listaArticulos=new LinkedList<Articulo>();
        Articulo articulo;
        String sql = "call pListarArticulos();";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        try {
            Statement statement = conexion.createStatement();
            resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                articulo = new Articulo(resultado.getInt("idArticulo"),
                                        resultado.getString("imagen"),
                                        resultado.getInt("categoria"),
                                        resultado.getString("titulo"),
                                        resultado.getString("autor"),
                                        resultado.getString("contenido"),
                                        resultado.getString("fecha"));
                listaArticulos.add(articulo);
            }//fin while

            statement.close();
        } catch (Exception e) {
            listaArticulos = null;
        } finally {
            conexion.close();
        }

        return listaArticulos;
    }//fin selectCategoria
    
    
    public boolean crearBoletin(Articulo articulo) throws SQLException {

        String sql = "call pCrearArticulo(?,?,?,?,?,?);";
        boolean accionRealizada = true;
        Connection conexion = super.getConexion();

        try {
            CallableStatement call = conexion.prepareCall(sql);
            call.setString("pimagen", articulo.getImagen());
            call.setInt("pcategoria", articulo.getCategoria());
            call.setString("ptitulo", articulo.getTitulo());
            call.setString("pautor", articulo.getAutor());
            call.setString("pcontenido", articulo.getContenido());
            call.setString("pfecha", articulo.getFecha());
            
            call.executeUpdate();
            call.close();
        } catch (Exception e) {
            accionRealizada = false;
        } finally {
            conexion.close();
        }//fin try

        return accionRealizada;
    }
    
    public boolean eliminarBoletin(String fecha) throws SQLException{
        String sqleliminarBoletin="call pEliminaBoletin(?);" ;
        boolean accionRealizada=true;
        
        Connection conexion=super.getConexion();
        try{
            
            CallableStatement call=conexion.prepareCall(sqleliminarBoletin);
            //call.setDate("pfecha", fecha);
            call.executeUpdate();
            
            call.close();
        }catch(Exception e){
            accionRealizada=false;
        }finally{
             conexion.close();
        }
        return accionRealizada;
    }
    
    
    
}
