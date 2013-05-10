/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import com.culturaPococi.dominio.Categoria;
import com.culturaPococi.dominio.Evento;
import java.sql.CallableStatement;
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
                    resultado.getString("nombreCategoria"),
                    resultado.getString("lugar"),resultado.getString("nombre"),  
                    resultado.getString("fecha"),resultado.getString("hora"), 
                    resultado.getString("informacion"), 
                    resultado.getString("correo"),"");
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
     
     public Evento selectEvento(int idEvento) throws SQLException{
        Evento evento=new Evento();
        String sql = "call pListaEvento("+idEvento+");";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        Statement statement = conexion.createStatement(); 
        resultado=statement.executeQuery(sql);
        System.out.println("id: "+resultado.getInt("idEvento"));
        evento=new Evento(resultado.getInt("idEvento"),resultado.getInt("idCategoria"),
                    resultado.getString("nombreCategoria"),
                    resultado.getString("lugar"),resultado.getString("nombre"),  
                    resultado.getString("fecha"),resultado.getString("hora"), 
                    resultado.getString("informacion"), 
                    resultado.getString("correo"),"");
        statement.close();
        conexion.close();
        
        return evento;
    }//fin selectEventos
     
     
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
//+"idcate: "+resultado.getInt("idCategoria")+
//                    "nombreCate"+resultado.getString("nombreCategoria")+"lugar: "+
//                    resultado.getString("lugar")+"nombre: "+resultado.getString("nombre")+"fecha: "+  
//                    resultado.getString("fecha")+"hora: "+resultado.getString("hora")+"info: "+ 
//                    resultado.getString("informacion")+"correo"+ 
//                    resultado.getString("correo")