
package com.culturaPococi.negocio;

import com.culturaPococi.data.DataPublicacion;
import com.culturaPococi.dominio.Publicacion;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author jonathan
 */
public class NegocioPublicacion {

    DataPublicacion dp;

    public NegocioPublicacion() {
        dp = new DataPublicacion();
    }

    public LinkedList<Publicacion> getListaPublicacion() throws SQLException {

        return dp.getListaPublicacion();
    }
    
    public Publicacion getPublicacion(int idPublicacion) throws SQLException {

        return dp.selectPublicacion(idPublicacion);
    }
    
    public boolean aceptarPublicacion(int idPublicacion) throws SQLException {

        return dp.aceptarPublicacion(idPublicacion);
    }
    
    public boolean eliminarPublicacion(int idPublicacion) throws SQLException {

        return dp.eliminarPublicacion(idPublicacion);
    }
    
    
    public LinkedList<Publicacion> getListaPublicacionPendiente(String tipo) throws SQLException {
        LinkedList<Publicacion> listaPublicacionesPendientes=new LinkedList<Publicacion>();
        if(tipo.equals("musica")){
            listaPublicacionesPendientes=dp.getListaPublicacionMusica();
        }else if(tipo.equals("texto")){
        
        }else if(tipo.equals("imagen")){
        
        }else{
        
        }
        
        return listaPublicacionesPendientes;
    }
    
}
