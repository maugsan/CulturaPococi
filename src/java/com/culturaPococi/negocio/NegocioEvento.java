/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.negocio;

import com.culturaPococi.data.DataEvento;
import com.culturaPococi.dominio.Evento;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author jonathan
 */
public class NegocioEvento {
 
    DataEvento dEvento=new DataEvento();
    
    public LinkedList<Evento> listarEventosDB() throws SQLException{
        LinkedList <Evento> listaEventos;
        listaEventos=dEvento.selectEventos();
        return listaEventos;
    }//fin listarEventos
    
    public boolean eliminarEventosDB(int idEvento) throws SQLException{
         return dEvento.eliminarEvento(idEvento);
    }//fin listarEventos
    
    public boolean actualizarEventosDB(Evento evento) throws SQLException{
        return dEvento.actualizarEvento(evento);
    }//fin listarEventos
    
    public boolean crearEventosDB(Evento evento) throws SQLException{
        return dEvento.crearEvento(evento);
    }//fin listarEventos
    
    public Evento selectEventoDB(int idEvento) throws SQLException{
        return dEvento.selectEvento(idEvento);
    }//fin selectEventoDB
    
    public int selectIdEventoDB() throws SQLException{
       return dEvento.selectIdEvento();
   }//fin selectEventoDB
   
}
