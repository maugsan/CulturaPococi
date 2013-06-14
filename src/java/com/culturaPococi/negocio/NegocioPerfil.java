/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.negocio;

import com.culturaPococi.data.DataPerfil;
import com.culturaPococi.dominio.Perfil;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author jonathan
 */
public class NegocioPerfil {

    DataPerfil dp;

    public NegocioPerfil() {
        dp = new DataPerfil();
    }

    public void eliminarPerfil(String nombrePerfil) throws SQLException {
        dp.eliminarPerfil(nombrePerfil);
    }
    
    public LinkedList<Perfil> getListaPerfil() throws SQLException{
    return dp.getListaPerfil();
    }
    
    public LinkedList<Perfil> getListaMisPerfiles(String correo) throws SQLException{
    return dp.getListaMisPerfiles(correo);
    }
    
    public Perfil  mostrarPerfil(String nombreP) throws SQLException{
    return dp.mostrarPerfil(nombreP);
    }
    
    public boolean  crearPerfil(Perfil perfil) throws SQLException{
        return dp.crearPerfil(perfil);
    }
    
    public boolean  modificarPerfil(Perfil perfil) throws SQLException{
        return dp.modificarPerfil(perfil);
    }
}