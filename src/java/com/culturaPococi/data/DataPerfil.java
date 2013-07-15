/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import com.culturaPococi.dominio.Perfil;
import java.net.URLEncoder;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

        String sql = "delete from publicacion  where idPerfil='" + nombrePerfil + "';";
        String sql2 = "delete from perfil  where idPerfil='" + nombrePerfil + "';";

        Connection conexion = super.getConexion();

        Statement statement = conexion.createStatement();
        statement.execute(sql);
        statement.execute(sql2);

        statement.close();
        conexion.close();
    }

    public LinkedList<Perfil> getListaPerfil() throws SQLException {

        LinkedList<Perfil> listaPerfil = new LinkedList<Perfil>();

        Perfil p;

        String nombrePerfil;
        String nombreCategoria;
        String fechaDeCreacion;
        String biografia;
        String imagenDePortada;
        String correo;
        String correoPerfil;
        String nombreDistrito;
        String facebook;
        String youtube;
        String twiter;
        String idPerfil;





        String sql = "select p.nombrePerfil,p.idPerfil,c.nombreCategoria, p.fechaDeCreacion,p.biografia,p.imagenDePortada,p.correo ,p.correoPerfil,p.nombreDistrito,p.facebook,p.twiter,p.youtube\n"
                + "       from perfil p inner join categoria c\n"
                + "	where p.idCategoria=c.idCategoria;";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        Statement statement = conexion.createStatement();
        resultado = statement.executeQuery(sql);


        while (resultado.next()) {


            p = new Perfil("", "", "", "", "", "", "", "", "", "", "", "");

             nombrePerfil = resultado.getString(1);
            idPerfil = resultado.getString(2);
            nombreCategoria = resultado.getString(3);
            fechaDeCreacion = resultado.getString(4);
            biografia = resultado.getString(5);
            imagenDePortada = resultado.getString(6);
            correo = resultado.getString(7);
            correoPerfil = resultado.getString(8);
            nombreDistrito = resultado.getString(9);
            facebook = resultado.getString(10);
            youtube = resultado.getString(11);
            twiter = resultado.getString(12);




            p.setNombrePerfil(nombrePerfil);
            p.setIdPerfil(idPerfil);
            p.setFechaDeCreacion(fechaDeCreacion);
            p.setBiografia(biografia);
            p.setImagenDePortada(imagenDePortada);
            p.setCorreo(correo);
            p.setCorreoPerfil(correoPerfil);
            p.setNombreDistrito(nombreDistrito);
            p.setNombreCategoria(nombreCategoria);
            p.setFacebook(facebook);
            p.setTwiter(twiter);
            p.setYoutube(youtube);

            listaPerfil.add(p);

        }
        resultado.close();

        return listaPerfil;
    }

    public LinkedList<Perfil> getMiListaPerfil(String c) throws SQLException {

        LinkedList<Perfil> listaPerfil = new LinkedList<Perfil>();

        Perfil p;

        String nombrePerfil;
        String nombreCategoria;
        String fechaDeCreacion;
        String biografia;
        String imagenDePortada;
        String correo;
        String correoPerfil;
        String nombreDistrito;
        String facebook;
        String youtube;
        String twiter;
        String idPerfil;


        String sql = "select p.nombrePerfil,p.idPerfil,c.nombreCategoria, p.fechaDeCreacion,p.biografia,p.imagenDePortada,p.correo ,p.correoPerfil,p.nombreDistrito,p.facebook,p.twiter,p.youtube\n"
                + "       from perfil p inner join categoria c\n"
                + "	on p.idCategoria=c.idCategoria where p.correo = '" + c + "';";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        Statement statement = conexion.createStatement();
        resultado = statement.executeQuery(sql);


        while (resultado.next()) {
            p = new Perfil("", "", "", "", "", "", "", "", "", "", "", "");

            nombrePerfil = resultado.getString(1);
            idPerfil = resultado.getString(2);
            nombreCategoria = resultado.getString(3);
            fechaDeCreacion = resultado.getString(4);
            biografia = resultado.getString(5);
            imagenDePortada = resultado.getString(6);
            correo = resultado.getString(7);
            correoPerfil = resultado.getString(8);
            nombreDistrito = resultado.getString(9);
            facebook = resultado.getString(10);
            youtube = resultado.getString(11);
            twiter = resultado.getString(12);




            p.setNombrePerfil(nombrePerfil);
            p.setIdPerfil(idPerfil);
            p.setFechaDeCreacion(fechaDeCreacion);
            p.setBiografia(biografia);
            p.setImagenDePortada(imagenDePortada);
            p.setCorreo(correo);
            p.setCorreoPerfil(correoPerfil);
            p.setNombreDistrito(nombreDistrito);
            p.setNombreCategoria(nombreCategoria);
            p.setFacebook(facebook);
            p.setTwiter(twiter);
            p.setYoutube(youtube);

            listaPerfil.add(p);

        }
        resultado.close();

        return listaPerfil;
    }

    public Perfil mostrarPerfil(String idP) throws SQLException {


        Perfil p = new Perfil("", "", "", "", "", "", "", "", "", "", "", "");


        String nombrePerfil;
        String idPerfil;
        String nombreCategoria;
        String fechaDeCreacion;
        String biografia;
        String imagenDePortada;
        String correo;
        String correoPerfil;
        String nombreDistrito;
        String facebook;
        String youtube;
        String twiter;


        String sql = "select * from perfil where idPerfil = '" + idP + "';";

        ResultSet resultado;
        Connection conexion = super.getConexion();

        Statement statement = conexion.createStatement();
        resultado = statement.executeQuery(sql);


        while (resultado.next()) {

            nombrePerfil = resultado.getString(1);
            idPerfil = resultado.getString(2);
            nombreCategoria = resultado.getString(3);
            fechaDeCreacion = resultado.getString(4);
            biografia = resultado.getString(5);
            imagenDePortada = resultado.getString(6);
            correo = resultado.getString(7);
            correoPerfil = resultado.getString(8);
            nombreDistrito = resultado.getString(9);
            facebook = resultado.getString(10);
            youtube = resultado.getString(11);
            twiter = resultado.getString(12);




            p.setNombrePerfil(nombrePerfil);
            p.setIdPerfil(idPerfil);
            p.setFechaDeCreacion(fechaDeCreacion);
            p.setBiografia(biografia);
            p.setImagenDePortada(imagenDePortada);
            p.setCorreo(correo);
            p.setCorreoPerfil(correoPerfil);
            p.setNombreDistrito(nombreDistrito);
            p.setNombreCategoria(nombreCategoria);
            p.setFacebook(facebook);
            p.setTwiter(twiter);
            p.setYoutube(youtube);


        }
        resultado.close();

        return p;
    }

    public void crearPerfil(Perfil perfil) throws SQLException {

      
        String sql = "INSERT INTO `perfil` (`nombrePerfil`, `idPerfil`, `idCategoria`,"
                + " `fechaDeCreacion`, `biografia`, `imagenDePortada`, `correo`, "
                + "`correoPerfil`, `nombreDistrito`, `facebook`, `twiter`, "
                + "`youtube`) VALUES (?, ENCRYPT(?), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        Connection conexion = super.getConexion();

        try {
            PreparedStatement call = conexion.prepareStatement(sql);

            call.setString(1, perfil.getNombrePerfil());
            call.setString(2, perfil.getNombrePerfil());
            call.setString(3, perfil.getNombreCategoria());
            call.setString(4, perfil.getFechaDeCreacion());
            call.setString(5, perfil.getBiografia());
            call.setString(6, perfil.getImagenDePortada());
            call.setString(7, perfil.getCorreo());
            call.setString(8, perfil.getCorreoPerfil());
            call.setString(9, perfil.getNombreDistrito());
            call.setString(10, perfil.getFacebook());
            call.setString(11, perfil.getTwiter());
            call.setString(12, perfil.getYoutube());

            call.executeUpdate();

            call.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } finally {
            conexion.close();
        }//fin try


    }

    public boolean modificarPerfil(Perfil perfil) throws SQLException {

        String sql = "call pModificarPerfil(?,?,?,?,?,?,?);";
        boolean accionRealizada = true;
        Connection conexion = super.getConexion();

        try {
            CallableStatement call = conexion.prepareCall(sql);

            call.setString("pnombrePerfil", perfil.getNombrePerfil());
            call.setString("pidCategoria", perfil.getNombreCategoria());
            call.setString("pfechaDeCreacion", perfil.getFechaDeCreacion());
            call.setString("pbiografia", perfil.getBiografia());
            call.setString("pimagenDePortada", perfil.getImagenDePortada());
            call.setString("pcorreo", perfil.getCorreo());
            call.setString("pnombreDistrito", perfil.getNombreDistrito());
            call.executeUpdate();
            call.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            conexion.close();
        }//fin try

        return accionRealizada;
    }

    public LinkedList<Perfil> getListaMisPerfilesPorCategoria(String categoria) throws SQLException {

        LinkedList<Perfil> listaPerfil = new LinkedList<Perfil>();

        Perfil p;

        String nombrePerfil;
        String nombreCategoria;
        String fechaDeCreacion;
        String biografia;
        String imagenDePortada;
        String correo;
        String nombreDistrito;


        String sql = "select p.nombrePerfil, p.fechaDeCreacion,p.biografia,p.imagenDePortada,p.correo,p.nombreDistrito,c.nombreCategoria\n"
                + "       from perfil p inner join categoria c\n"
                + "	on p.idCategoria=c.idCategoria where c.idCategoria = '" + categoria + "';";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        Statement statement = conexion.createStatement();
        resultado = statement.executeQuery(sql);


        while (resultado.next()) {
            p = new Perfil("", "", "", "", "", "", "", "", "", "", "", "");

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
        return listaPerfil;
    }
}