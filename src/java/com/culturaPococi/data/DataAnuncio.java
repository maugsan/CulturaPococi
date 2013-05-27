/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import com.culturaPococi.dominio.Anuncio;
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
public class DataAnuncio extends DataBase{
    
    public LinkedList<Anuncio> selectAnuncios() throws SQLException {
        LinkedList<Anuncio> listaAnuncios = new LinkedList<Anuncio>();
        Anuncio anuncio;
        String sql = "call pListarAnuncios();";
        ResultSet resultado;
        
        Connection conexion = super.getConexion();

        try {
            Statement statement = conexion.createStatement();
            resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                anuncio = new Anuncio(resultado.getString("titulo"), resultado.getString("imagen"),
                        resultado.getInt("prioridad"), resultado.getInt("idAnuncio"));
                listaAnuncios.add(anuncio);
            }//fin while
            statement.close();
        } catch (Exception e) {
            listaAnuncios = null;
        } finally {
            conexion.close();
        }


        return listaAnuncios;
    }//fin selectAnuncios  
    
    
    public boolean eliminarAnuncio(int idAnuncio) throws SQLException{
        String sql = "call pEliminarAnuncio("+idAnuncio+");" ;
       boolean accionRealizada=true;
        
        Connection conexion = super.getConexion();

        try {
            Statement statement = conexion.createStatement(); 
            statement.executeQuery(sql);
            statement.close();
        } catch (Exception e) {
            accionRealizada = false;
        } finally {
            conexion.close();
        }
        return accionRealizada;
    }//fin eliminarEventos 
    
    public LinkedList selectPrioridades() throws SQLException {
        LinkedList listaPrioridades = new LinkedList();
        String sql = "call pListarPrioridades();";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        try {
            Statement statement = conexion.createStatement();
            resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                listaPrioridades.add(resultado.getString("numPrioridad"));
            }//fin while
            statement.close();
        } catch (Exception e) {
            listaPrioridades = null;
        } finally {
            conexion.close();
        }

        return listaPrioridades;
    }//fin selectAnuncios  
    
    public Anuncio selectAnuncio(int idAnuncio) throws SQLException{
        Anuncio anuncio=new Anuncio();
        String sql = "call pAnuncio("+idAnuncio+");";
        ResultSet resultado;
        Connection conexion = super.getConexion();
    
        Statement statement = conexion.createStatement(); 
        resultado=statement.executeQuery(sql);
        
        
        while (resultado.next()) { 
            anuncio=new Anuncio(resultado.getString("titulo"), 
                null, resultado.getInt("prioridad"), resultado.getInt("idAnuncio"));
        }//fin while
     
        statement.close();
        conexion.close();
        return anuncio;
    }//fin selectAnuncios  
    
    public boolean crearAnuncio(Anuncio anuncio) throws SQLException {

        boolean accionRealizada = true;
        String sql = "call pCrearAnuncio(?,?,?);";
        Connection conexion = super.getConexion();

        try {
            CallableStatement call = conexion.prepareCall(sql);

            call.setString("pimagen", anuncio.getImagen());
            call.setInt("pprioridad", anuncio.getPrioridad());
            call.setString("ptitulo", anuncio.getTitulo());
            

            call.executeUpdate();
            call.close();
        } catch (Exception e) {
            accionRealizada = false;
        } finally {
            conexion.close();
        }
        return accionRealizada;
    }//crearAnuncio
}
