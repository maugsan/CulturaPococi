/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jonathan
 */
public class DataUsuarioAdministrador extends DataBase{
    
     public boolean verificarUsuarioAdministrador(String correo, String contrasenia) throws SQLException {
        String correoTemporal;
        String contraseniaTemporal;
        boolean encontrado = false;

        String sql = "select correo, contrasenia from usuarioAdministrador;";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        Statement statement = conexion.createStatement();
        resultado = statement.executeQuery(sql);


        while (resultado.next()) {
            correoTemporal = resultado.getString(1);
            contraseniaTemporal = resultado.getString(2);
            if (correoTemporal.equals(correo) && contraseniaTemporal.equals(contrasenia)) {
                encontrado = true;
            }
        }
        resultado.close();
        System.out.println("exito");
        return encontrado;
    }
    
}
