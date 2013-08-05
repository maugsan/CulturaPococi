/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import com.culturaPococi.dominio.UsuarioNormal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import javax.swing.JOptionPane;

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
     
     
     
      public boolean confirmarUsuarioNormal(String url) throws SQLException {
       
 
        String sql = "UPDATE `usuarioNormal` SET `verificado` = '1' WHERE url = '"+ url +"';";
 
        Connection conexion = super.getConexion();

        Statement statement = conexion.createStatement();
        statement.executeUpdate(sql);
        
        return true;

    }
     
     public void crearUsuarioNormal(UsuarioNormal usuario) throws SQLException {
         
        String sql = "insert into usuarioNormal values ('"+usuario.getCorreo() +"', ENCRYPT('"+usuario.getCorreo()
                +"'),'"
                +"','"
                +usuario.getContrasenia()
                +"','"
                +usuario.getColaborador()+"', '"+ 0 +"', NOW() );";

        Connection conexion = super.getConexion();
        
        Statement st=conexion.createStatement();
        
        st.executeUpdate(sql);
        st.close();
        conexion.close();
    }
     
     /*Elimina a un usuario de la base de datos por medio del correo*/
    public void eliminarUsuarioNormal(String correo) throws SQLException {
        Connection conexion = super.getConexion();
        String sql = "delete from usuarioNormal where correo='"+correo+"';";
        String sql2 = "delete from perfil where correo='"+correo+"';";
        

        
        
        Statement st=conexion.createStatement();
        st.execute(sql2);
        st.execute(sql);
       
        st.close();
        conexion.close();
    }
    
    
     // obtener una lista de los usuarios normales
     public LinkedList<UsuarioNormal> selectUsuarios() throws SQLException{
        LinkedList<UsuarioNormal> listaUsuarios=new LinkedList<UsuarioNormal>();
        UsuarioNormal usuario;
        String sql = "select * from usuarioNormal;" ;
        ResultSet resultado;
        Connection conexion = super.getConexion();

        Statement statement = conexion.createStatement(); 
        resultado=statement.executeQuery(sql);

        while (resultado.next()) { 
            
            usuario = new UsuarioNormal(resultado.getString("correo"),resultado.getString("url"), resultado.getString("nombre"),
                   resultado.getString("contrasenia"),  resultado.getString("colaborador"), resultado.getString("fecha"), resultado.getInt("verificado"));
           
            listaUsuarios.add(usuario);
        }//fin while
        statement.close();
        conexion.close();
        return listaUsuarios;
    }//fin selectEvent
}
