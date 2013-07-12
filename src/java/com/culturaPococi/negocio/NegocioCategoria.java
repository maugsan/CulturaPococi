package com.culturaPococi.negocio;

import com.culturaPococi.data.DataCategoria;
import com.culturaPococi.dominio.Categoria;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author jonathan
 */
public class NegocioCategoria {
    
    DataCategoria dCategoria = new DataCategoria();

    public LinkedList<Categoria> selectCategorias() throws SQLException {
        
        return dCategoria.selectCategorias();
        
    }//fin selectCategoriasDB
    
    public LinkedList<Categoria> selectSuperCategoriasDB() throws SQLException {
        
        return dCategoria.selectSuperCategorias();
        
    }//fin selectCategoriasDB
    
    public LinkedList<Categoria> selectCategoriasXsuper(int s) throws SQLException {
        
        return dCategoria.selectCategoriasXSuper(s);
        
    }//fin selectCategoriasDB
    
    public LinkedList<Categoria> selectCategoriasOrdenadasDB(int idCategoria) throws SQLException {
        LinkedList<Categoria> listaCategoria;
        listaCategoria = dCategoria.ordenarPrimeraCategoria(idCategoria);
        return listaCategoria;
    }//fin selectCategoriasDB
    
    public boolean crearCategoriaDB(String categoria, String s) throws SQLException {
        
        return dCategoria.crearCategoria(categoria, s);
    }//fin selectCategoriasDB
    
    public void eliminarCategoria(String id) throws SQLException {
        
        dCategoria.eliminarCategoria(id);
    }
}
