/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.negocio;

import com.culturaPococi.data.DataUsuarioAdministrador;
import java.sql.SQLException;

/**
 *
 * @author jonathan
 */
public class NegocioUsuarioAdministrador {
      
    DataUsuarioAdministrador dua;

    public NegocioUsuarioAdministrador() {
        dua=new DataUsuarioAdministrador();
    }
    
    
     public boolean verificarUsuarioAdministrador(String correo, String contrasenia) throws SQLException {

        return dua.verificarUsuarioAdministrador(correo, contrasenia);

    }
    
}
