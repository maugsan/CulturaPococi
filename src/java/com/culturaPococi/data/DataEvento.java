/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import com.culturaPococi.dominio.Evento;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author jonathan
 */
public class DataEvento extends DataBase{
    
    
    public LinkedList<Evento> selectEventos() throws SQLException{
        LinkedList<Evento> listaPeliculas=new LinkedList<Evento>();
//        Evento evento=new Evento(idEvento, idCategoria, null, null, null, null, null, null);
////        String sql = "Select codPelicula, titulo, totalPeliculas,subtitulada, estreno, g.codGenero, nombreGenero \n" +
////                    "from pelicula_yuliana p inner join genero g on p.codGenero=g.codGenero;";
//        String sql = "Select codPelicula,titulo, totalPeliculas,subtitulada, estreno, g.codGenero, nombreGenero \n" +
//                    "from pelicula_yuliana p inner join genero_yuliana g on p.codGenero=g.codGenero;";
//        ResultSet resultado;
//        Connection conexion = super.getConexion();
//    
//        Statement statement = conexion.createStatement(); 
//        resultado=statement.executeQuery(sql);
//        
//        String temp="";
//        while (resultado.next()) { 
//            System.out.println("cod: "+resultado.getInt (1)+"titu: "+resultado.getString(2)
//                    +"total: "+resultado.getInt (3)
//                    +"estreno: "+resultado.getBoolean(4)
//                    +"sub: "+resultado.getBoolean(5));
//            //temp+=resultado.getInt (1) + " " + resultado.getString (2)+ " " + resultado.getInt (3)+"  "+resultado.getBoolean(4)
//              //          +" "+resultado.getBoolean(5)+" "+resultado.getInt (6) + " " + resultado.getString (7);
//            genero=new Genero(resultado.getInt (6), resultado.getString (7));
//            pelicula =new Pelicula(resultado.getInt(1),resultado.getString (2),resultado.getInt (3),resultado.getBoolean(4),resultado.getBoolean(5), genero);
//           
//            listaPeliculas.add(pelicula);
//        }//fin while
//        statement.close();
//        conexion.close();
        return listaPeliculas;
    }//fin selectPeliculas
}
