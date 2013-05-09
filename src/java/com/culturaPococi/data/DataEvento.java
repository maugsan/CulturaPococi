/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import com.culturaPococi.dominio.Evento;
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
public class DataEvento extends DataBase{
    
    
    public LinkedList<Evento> selectEventos() throws SQLException{
        LinkedList<Evento> listaEventos=new LinkedList<Evento>();
        Evento evento=new Evento();
        String sql = "call pListaEventos();" ;
        ResultSet resultado;
        Connection conexion = super.getConexion();

        Statement statement = conexion.createStatement(); 
        resultado=statement.executeQuery(sql);

        while (resultado.next()) { 
            evento=new Evento(resultado.getInt("idEvento"),resultado.getInt("idCategoria"),
                    resultado.getString("lugar"),resultado.getString("nombre"),  
                    resultado.getString("fecha"),resultado.getString("hora"), 
                    resultado.getString("informacion"), 
                    resultado.getString("correo"),"",resultado.getString("nombreCategoria"));
            listaEventos.add(evento);
        }//fin while
        statement.close();
        conexion.close();
        return listaEventos;
    }//fin selectEventos
    
    public void EliminarEvento(int idEvento) throws SQLException{
        String sql = "call pEliminarEvento("+idEvento+");" ;
       
        Connection conexion = super.getConexion();

        Statement statement = conexion.createStatement(); 
        statement.executeQuery(sql);
        statement.close();
        conexion.close();
    }//fin eliminarEventos 

     public void  actualizarEvento(Evento evento) throws SQLException{
    
        String sql = "call pActualizarEvento(?,?,?,?,?,?,?,?);";
        Connection conexion = super.getConexion();
        CallableStatement call=conexion.prepareCall(sql);
        
        call.setInt("pidEvento", evento.getIdEvento());
        call.setString("pnombre",evento.getNombre());
        call.setString("plugar",evento.getLugar());
        //call.setTime("phora", evento.getFecha());
        //call.setDate("pfecha", null);
        call.setString("pinformacion",evento.getInformacion());
        call.setString("pcorreo",evento.getCorreo());
        call.setInt("pidCategoria", evento.getIdCategoria());
                
        call.executeUpdate();
        call.close();
        conexion.close();
    }
     
     public void  crearEvento(Evento evento) throws SQLException{
    
        String sql = "call pCrearEventos(?,?,?,?,?,?,?);";
        Connection conexion = super.getConexion();
        CallableStatement call=conexion.prepareCall(sql);
        
        
        call.setString("pnombre",evento.getNombre());
        call.setString("plugar",evento.getLugar());
        //call.setTime("phora", evento.getFecha());
        //call.setDate("pfecha", null);
        call.setString("pinformacion",evento.getInformacion());
        call.setString("pcorreo",evento.getCorreo());
        call.setInt("pidCategoria", evento.getIdCategoria());
                
        call.executeUpdate();
        call.close();
        conexion.close();
    }
}
