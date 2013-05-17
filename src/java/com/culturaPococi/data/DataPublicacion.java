/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import com.culturaPococi.dominio.Publicacion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author jonathan
 */
public class DataPublicacion extends DataBase{
    
     public LinkedList<Publicacion> getListaPublicacion () throws SQLException {

        LinkedList<Publicacion> listaPublicacion = new LinkedList<Publicacion>();
        
        Publicacion p;
    
         String nombrePerfil;
         int idPublicacion;
         String fechaPublicacion;
         String correo;
         String descripcion;
         int verificacion;
         String musica;
         String video;
         String texto;
         String imagen;
         String nombreCategoria;

        String sql = "call pListaPublicaciones();";
        ResultSet resultado;
        Connection conexion = super.getConexion();

         Statement statement = conexion.createStatement();
         resultado = statement.executeQuery(sql);


         while (resultado.next()) {
             p = new Publicacion("", 0, "", "", "", 0, "", "", "", "", "");

             nombrePerfil = resultado.getString(1);
             idPublicacion = resultado.getInt(2);
             fechaPublicacion = resultado.getString(3);
             correo = resultado.getString(4);
             descripcion = resultado.getString(5);
             verificacion = resultado.getInt(6);
             musica = resultado.getString(7);
             video = resultado.getString(8);
             texto = resultado.getString(9);
             imagen = resultado.getString(10);
             nombreCategoria = resultado.getString(11);

             p.setNombrePerfil(nombrePerfil);
             p.setIdPublicacion(idPublicacion);
             p.setFechaPublicacion(fechaPublicacion);
             p.setCorreo(correo);
             p.setDescripcion(descripcion);
             p.setVerificacion(verificacion);
             p.setMusica(musica);
             p.setVideo(video);
             p.setTexto(texto);
             p.setImagen(imagen);
             p.setNombreCategoria(nombreCategoria);

             listaPublicacion.add(p);

        }
        resultado.close();
        System.out.println("exito");

        return listaPublicacion;
    }
    
}
