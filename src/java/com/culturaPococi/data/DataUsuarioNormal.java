/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import com.culturaPococi.dominio.UsuarioNormal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author jonathan
 */
public class DataUsuarioNormal extends DataBase{
    
    
     public boolean verificarUsuarioNormal(String correo, String contrasenia) throws SQLException {
        String correoTemporal;
        String contraseniaTemporal;
        boolean encontrado = false;

        String sql = "select correo, contrasenia from usuarioNormal;";
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
     
     public void crearUsuarioNormal() throws SQLException {
         
        String sql = "call pInsertarUsuarioNormal(?,?,?,?);";
        Connection conexion = super.getConexion();
        
        CallableStatement call=conexion.prepareCall(sql);
        
        call.executeUpdate();
        call.close();
        conexion.close();
    }
     
     /*Elimina a un usuario de la base de datos por medio del correo*/
    public void eliminarUsuarioNormal(String correo) throws SQLException {
         
        String sql = "call pEliminarUsuarioNormal('"+correo+"');";
        Connection conexion = super.getConexion();
        
        CallableStatement call=conexion.prepareCall(sql);
        
        call.executeUpdate();
        call.close();
        conexion.close();
    }
    
    
     // obtener una lista de los usuarios normales
     public LinkedList<UsuarioNormal> selectUsuarios() throws SQLException{
        LinkedList<UsuarioNormal> listaUsuarios=new LinkedList<UsuarioNormal>();
        UsuarioNormal usuario;
        String sql = "call pListaUsuarios();" ;
        ResultSet resultado;
        Connection conexion = super.getConexion();

        Statement statement = conexion.createStatement(); 
        resultado=statement.executeQuery(sql);

        while (resultado.next()) { 
            
           usuario = new UsuarioNormal(resultado.getString("correo"), resultado.getString("nombre"),
                   resultado.getString("contrasenia"),  resultado.getString("colaborador"));
           
            listaUsuarios.add(usuario);
        }//fin while
        statement.close();
        conexion.close();
        return listaUsuarios;
    }//fin selectEvent
}
