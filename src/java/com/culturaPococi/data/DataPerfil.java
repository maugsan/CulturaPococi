/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.culturaPococi.data;

import com.culturaPococi.dominio.Perfil;
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
public class DataPerfil extends DataBase {

    public void eliminarPerfil(String nombrePerfil) throws SQLException {

        JOptionPane.showMessageDialog(null, " DataPerfil " + nombrePerfil);

        String sql = "call eliminar_perfiles(" + nombrePerfil + ");";

        JOptionPane.showMessageDialog(null, " sql :" + sql);

        ResultSet resultado;
        Connection conexion = super.getConexion();

        Statement statement = conexion.createStatement();
        statement.executeQuery(sql);
        //resultado = statement.executeQuery(sql);

        // resultado.close();
    }

    public LinkedList<Perfil> getListaPerfil() throws SQLException {

        LinkedList<Perfil> listaPerfil = new LinkedList<Perfil>();
        String titulo;

        String nombrePerfil;
        int idCategoria;
        String fechaDeCreacion;
        String distrito;
        String biografia;
        String imagenDePortada;
        String correo;
        String nombreDistrito;


        String sql = "call listaPerfil();";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        Statement statement = conexion.createStatement();
        resultado = statement.executeQuery(sql);


        while (resultado.next()) {
            titulo = resultado.getString(1);

            /* String nombrePerfil;
             int idCategoria;
             String fechaDeCreacion;
             String distrito;
             String biografia;
             String imagenDePortada;
             String correo;
             String nombreDistrito;*/

            JOptionPane.showMessageDialog(null, "titulo=" + titulo);
        }
        resultado.close();
        System.out.println("exito");

        return listaPerfil;
    }
}