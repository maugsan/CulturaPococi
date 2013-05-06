/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.negocio;

import com.culturaPococi.data.DataUsuarioNormal;
import java.sql.SQLException;

/**
 *
 * @author jonathan
 */
public class NegocioUsuarioNOrmal {

    DataUsuarioNormal dun;

    public NegocioUsuarioNOrmal() {
        dun = new DataUsuarioNormal();
    }

    public boolean verificarUsuarioNormal(String correo, String contrasenia) throws SQLException {

        return dun.verificarUsuarioNormal(correo, contrasenia);

    }
}