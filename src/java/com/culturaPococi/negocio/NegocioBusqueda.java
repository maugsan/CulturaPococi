/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.negocio;

import com.culturaPococi.data.DataBusqueda;
import com.culturaPococi.dominio.Busqueda;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author MAU
 */
public class NegocioBusqueda {

    DataBusqueda dataBusqueda = new DataBusqueda();

    public LinkedList<Busqueda> buscar(String palabra, int tipo) throws SQLException {

        return dataBusqueda.getListaBusqueda(palabra, tipo);

    }
}
