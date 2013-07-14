/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.negocio;

import com.culturaPococi.data.DataPerfil;
import com.culturaPococi.dominio.Perfil;
import java.sql.SQLException;
import java.util.LinkedList;
import com.culturaPococi.dominio.URL;


/**
 *
 * @author jonathan
 */
public class NegocioPerfil {

    URL url ;
    DataPerfil dp;

    public NegocioPerfil() {
        dp = new DataPerfil();
    }

    public void eliminarPerfil(String nombrePerfil) throws SQLException {
        dp.eliminarPerfil(nombrePerfil);
    }

    public LinkedList<Perfil> getListaPerfil() throws SQLException {
        return dp.getListaPerfil();
    }
    public LinkedList<Perfil> getMiListaPerfil(String c) throws SQLException {
        return dp.getMiListaPerfil( c);
    }

    public LinkedList<Perfil> getListaPerfilPorCategoria(String categoria) throws SQLException {
        
        return dp.getListaMisPerfilesPorCategoria( categoria );
    }

    public Perfil mostrarPerfil(String idP) throws SQLException {
        return dp.mostrarPerfil(idP);
    }

    public void crearPerfil(Perfil perfil) throws SQLException {
        dp.crearPerfil(perfil);
    }

    public boolean modificarPerfil(Perfil perfil) throws SQLException {
        return dp.modificarPerfil(perfil);
    }
}