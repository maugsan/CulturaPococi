/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
}
