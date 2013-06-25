/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import com.culturaPococi.dominio.Busqueda;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author MAU
 */
public class DataBusqueda extends DataBase {

    public LinkedList<Busqueda> getListaBusqueda(String p, int t) throws SQLException {

        LinkedList<Busqueda> listaBusqueda = new LinkedList<Busqueda>();

        Busqueda b;

        String palabra;
        String descripcion;
        int tipo;

        String sql = "call  pbuscar('"+p+"'," +t+");";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        Statement statement = conexion.createStatement();
        resultado = statement.executeQuery(sql);


        while (resultado.next()) {
            b = new Busqueda("", "", 0);

            palabra = resultado.getString("palabra");
            descripcion = resultado.getString("descripcion");
            tipo = resultado.getInt("tipo");
            
            b.setPalabra(palabra);
            b.setDescripcion(descripcion);
            b.setTipo(tipo);

            listaBusqueda.add(b);

        }
        resultado.close();

        return listaBusqueda;
    }
}
