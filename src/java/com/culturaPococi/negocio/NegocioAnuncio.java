/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.negocio;

import com.culturaPococi.data.DataAnuncio;
import com.culturaPococi.data.DataEvento;
import com.culturaPococi.dominio.Anuncio;
import com.culturaPococi.dominio.Evento;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author jonathan
 */
public class NegocioAnuncio {
    
    DataAnuncio dAnuncio=new DataAnuncio();
    
    public LinkedList<Anuncio> listarAnunciosDB() throws SQLException{
        LinkedList <Anuncio> listaAnuncios;
        listaAnuncios=dAnuncio.selectAnuncios();
        return listaAnuncios;
    }//fin listarAnunciosDB
    
     public void eliminarAnuncioDB(int idEvento) throws SQLException{
        dAnuncio.eliminarAnuncio(idEvento);
    }//fin eliminarAnuncioDB
     
     public LinkedList listarPrioridadesDB() throws SQLException{
        LinkedList listaPrioridades;
        listaPrioridades=dAnuncio.selectPrioridades();
        return listaPrioridades;
    }//fin listarPrioridadesDB
     
     public Anuncio anuncioDB(int idAnuncio) throws SQLException{
        Anuncio anuncio=new Anuncio();
        anuncio=dAnuncio.selectAnuncio(idAnuncio);
        return anuncio;
    }//fin anuncioDB
     
     public void crearAnuncioDB(Anuncio anuncio) throws SQLException{
        dAnuncio.crearAnuncio(anuncio);
    }//fin crearAnuncioDB
}