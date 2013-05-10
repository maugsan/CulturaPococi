
package com.culturaPococi.negocio;

import com.culturaPococi.data.DataUsuarioNormal;
import com.culturaPococi.dominio.UsuarioNormal;
import java.sql.SQLException;
import java.util.LinkedList;


public class NegocioUsuarioNormal {

    DataUsuarioNormal dun;

    public NegocioUsuarioNormal() {
        dun = new DataUsuarioNormal();
    }

    public boolean verificarUsuarioNormal(String correo,
            String contrasenia) throws SQLException {

        return dun.verificarUsuarioNormal(correo, contrasenia);

    }
    
     DataUsuarioNormal dusuario=new DataUsuarioNormal();
    
    public LinkedList<UsuarioNormal> listarUsuariosDB() throws SQLException{
        LinkedList <UsuarioNormal> listaUsuarios;
        listaUsuarios=dusuario.selectUsuarios();
        return listaUsuarios;
    }//fin listarEventos
    
    public void eliminarUsuariosDB(String correo) throws SQLException{
        dusuario.eliminarUsuarioNormal();
    }//fin listarEventos
    
    public void crearUsuariosDB(UsuarioNormal usuario) throws SQLException{
        dusuario.crearUsuarioNormal();
    }//fin listarEventos
}