/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.culturaPococi.data;

import com.culturaPococi.dominio.Evento;
import com.culturaPococi.dominio.Perfil;
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
public class DataPerfil extends DataBase {

    public void eliminarPerfil(String nombrePerfil) throws SQLException {

        String sql = "call pEliminar_perfiles('" + nombrePerfil + "');";
                             
        Connection conexion = super.getConexion();
        
        Statement statement = conexion.createStatement(); 
        statement.executeQuery(sql);
        
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
        String nombreDistrito;


        String sql = "call  pListaPerfil();";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        Statement statement = conexion.createStatement();
        resultado = statement.executeQuery(sql);


        while (resultado.next()) {
            p = new Perfil("", "", "", "", "", "", "",0);

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
    
    
    public Perfil mostrarPerfil(String nombreP) throws SQLException {
        
       
        Perfil p= new Perfil("", "", "", "", "", "", "",0);
        
        String nombrePerfil;
        String nombreCategoria;
        String fechaDeCreacion;
        String biografia;
        String imagenDePortada;
        String correo;
        String nombreDistrito;


        //String sql = "call pMostrarPerfil('" + nombreP + "');";
        String sql = "call pListarUnPerfil('" + nombreP + "');";
        
        ResultSet resultado;
        Connection conexion = super.getConexion();

        Statement statement = conexion.createStatement();
        resultado = statement.executeQuery(sql);


        while (resultado.next()) {
            p = new Perfil("", "", "", "", "", "", "",0);

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


        }
        resultado.close();

        return p;
    }
    
    
    public boolean crearPerfil(Perfil perfil) throws SQLException {

        String sql = "call pCrearPerfil(?,?,?,?,?,?,?);";
        boolean accionRealizada = true;
        Connection conexion = super.getConexion();

        try {
            CallableStatement call = conexion.prepareCall(sql);

            call.setString("pnombrePerfil", perfil.getNombrePerfil());
            call.setInt("pidCategoria", perfil.getIdCategoria());
            call.setString("pfechaDeCreacion", perfil.getFechaDeCreacion());
            call.setString("pbiografia", perfil.getBiografia());
            call.setString("pimagenDePortada", perfil.getImagenDePortada());
            call.setString("pcorreo", perfil.getCorreo());
            call.setString("pnombreDistrito", perfil.getNombreDistrito());
           
            call.executeUpdate();
           
            call.close();
        } catch (Exception e) {
            accionRealizada = false;
           
        } finally {
            conexion.close();
        }//fin try

        return accionRealizada;
    }
    
    public boolean modificarPerfil(Perfil perfil) throws SQLException {

        String sql = "call pModificarPerfil(?,?,?,?,?,?,?);";
        boolean accionRealizada = true;
        Connection conexion = super.getConexion();

        try {
            CallableStatement call = conexion.prepareCall(sql);

            call.setString("pnombrePerfil", perfil.getNombrePerfil());
            call.setInt("pidCategoria", perfil.getIdCategoria());
            call.setString("pfechaDeCreacion", perfil.getFechaDeCreacion());
            call.setString("pbiografia", perfil.getBiografia());
            call.setString("pimagenDePortada", perfil.getImagenDePortada());
            call.setString("pcorreo", perfil.getCorreo());
            call.setString("pnombreDistrito", perfil.getNombreDistrito());
            call.executeUpdate();
            call.close();
        } catch (Exception e) {
            accionRealizada = false;
        } finally {
            conexion.close();
        }//fin try

        return accionRealizada;
    }
    
    
    public LinkedList<Perfil> getListaMisPerfiles(String inCorreo) throws SQLException {

        LinkedList<Perfil> listaPerfil = new LinkedList<Perfil>();
        
        Perfil p;
        
        String nombrePerfil;
        String nombreCategoria;
        String fechaDeCreacion;
        String biografia;
        String imagenDePortada;
        String correo;
        String nombreDistrito;


        String sql = "call pListaMisPerfil('"+inCorreo+"');";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        try{
            
           Statement statement = conexion.createStatement();
        resultado = statement.executeQuery(sql);


        while (resultado.next()) {
            p = new Perfil("", "", "", "", "", "", "",0);

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

        
        }//fin while
        
            resultado.close();

        
        }catch(Exception e){
            listaPerfil=null;
        }finally{
             conexion.close();
        }
        
        if(listaPerfil.size()==0){
            listaPerfil=null;
        }
        
        return listaPerfil;
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


        String sql = "call pListaPerfilxCatgoria('"+categoria+"');";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        try{
            
           Statement statement = conexion.createStatement();
        resultado = statement.executeQuery(sql);


        while (resultado.next()) {
            p = new Perfil("", "", "", "", "", "", "",0);

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

        
        }//fin while
        
            resultado.close();

        
        }catch(Exception e){
            listaPerfil=null;
        }finally{
             conexion.close();
        }
        
        if(listaPerfil.size()==0){
            listaPerfil=null;
        }
        
        return listaPerfil;
    }
    
}