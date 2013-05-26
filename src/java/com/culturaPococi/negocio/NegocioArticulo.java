/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.negocio;

import com.culturaPococi.data.DataArticulo;
import com.culturaPococi.dominio.Articulo;
import com.culturaPococi.dominio.Boletin;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author jonathan
 */
public class NegocioArticulo {

    DataArticulo dArticulo;
    public NegocioArticulo() {
        dArticulo=new DataArticulo();
    }
    
    public LinkedList<Articulo> bdListarBoletines() throws SQLException{
        return dArticulo.selectArticulos();
    }
    
//    public boolean bdCrearBoletin() throws SQLException{
//        return dArticulo.selectArticulos();
//    }
    
    
    
    
}
