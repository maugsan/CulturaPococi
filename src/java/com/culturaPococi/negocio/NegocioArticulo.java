/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.negocio;

import com.culturaPococi.data.DataArticulo;
import com.culturaPococi.dominio.Articulo;
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
    
    public LinkedList<Articulo> bdListarArticulos() throws SQLException{
        return dArticulo.selectArticulos();
    }
    
    public Articulo bdArticulo(int idArticulo) throws SQLException{
        return dArticulo.selectArticulo(idArticulo);
    }
    
    public boolean bdCrearArticulo(Articulo articulo) throws SQLException{
        return dArticulo.crearArticulo(articulo);
    }
    
    public boolean bdEliminarArticulo(int idArticulo) throws SQLException{
        return dArticulo.eliminarArticulos(idArticulo);
    }
    
    public boolean bdActualizarArticulo(Articulo articulo) throws SQLException{
        return dArticulo.actualizarArticulo(articulo);
    }
    
    
    
    
    
    
}
