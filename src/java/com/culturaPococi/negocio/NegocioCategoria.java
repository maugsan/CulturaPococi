/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    DataCategoria dCategoria=new DataCategoria();
     public LinkedList<Categoria> selectCategoriasDB() throws SQLException{
        LinkedList <Categoria> listaCategoria;
        listaCategoria=dCategoria.selectCategorias();
        return listaCategoria;
    }//fin selectCategoriasDB
}
