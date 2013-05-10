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
        Perfil p;

        String nombrePerfil;
        String nombreCategoria;
        String fechaDeCreacion;
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
            p = new Perfil("", "", "", "", "", "", "");

            nombrePerfil = resultado.getString(1);
            fechaDeCreacion = resultado.getString(2);
            biografia = resultado.getString(3);
            imagenDePortada = resultado.getString(4);
            correo = resultado.getString(5);
            nombreDistrito = resultado.getString(6);
            nombreCategoria = resultado.getString(7);

            p.setNombrePerfil(nombrePerfil);
            p.setFechaDeCreacion(fechaDeCreacion);
            p.setBiografia(biografia);
            p.setImagenDePortada(imagenDePortada);
            p.setCorreo(correo);
            p.setNombreDistrito(nombreDistrito);
            p.setNombreCategoria(nombreCategoria);

            listaPerfil.add(p);

        }
        resultado.close();
        System.out.println("exito");

        return listaPerfil;
    }
}