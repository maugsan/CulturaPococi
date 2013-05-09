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
    
    public void eliminarEventosDB(int idEvento) throws SQLException{
        dEvento.EliminarEvento(idEvento);
    }//fin listarEventos
    
    public void actualizarEventosDB(Evento evento) throws SQLException{
        dEvento.actualizarEvento(evento);
    }//fin listarEventos
    
    public void crearEventosDB(Evento evento) throws SQLException{
        dEvento.crearEvento(evento);
    }//fin listarEventos
}
