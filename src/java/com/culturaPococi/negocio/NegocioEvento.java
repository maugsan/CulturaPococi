/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.negocio;

import com.culturaPococi.data.DataEvento;
import com.culturaPococi.dominio.Evento;
import java.util.LinkedList;

/**
 *
 * @author jonathan
 */
public class NegocioEvento {
 
    DataEvento dEvento=new DataEvento();
    
    public LinkedList<Evento> listarEventosDB(){
        LinkedList <Evento> listaEventos=new LinkedList<Evento>();
            
        return listaEventos;
    }//fin listarEventos
}
