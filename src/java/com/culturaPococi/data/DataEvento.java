/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import com.culturaPococi.dominio.Evento;
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
            evento=new Evento(resultado.getInt("idEvento"),resultado.getString("nombreCategoria"),
                    resultado.getString("lugar"),resultado.getString("nombre"),  
                    resultado.getString("fecha"),resultado.getString("hora"), 
                    resultado.getString("informacion"), 
                    resultado.getString("correo"),"");
            System.out.println("idEvento "+resultado.getInt("idEvento")+"nomc"+resultado.getString("nombreCategoria")+
                    "LUGAR "+resultado.getString("lugar")+"nombree"+resultado.getString("nombre")+"fecha"+  
                    resultado.getString("fecha")+"hora"+resultado.getString("hora")+"info "+ 
                    resultado.getString("informacion")+"correo"+
                    resultado.getString("correo"));
            listaEventos.add(evento);
        }//fin while
        statement.close();
        conexion.close();
        return listaEventos;
    }//fin selectPeliculas
}
