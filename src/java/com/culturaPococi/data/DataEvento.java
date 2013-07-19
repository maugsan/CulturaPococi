/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import com.culturaPococi.dominio.Evento;
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
public class DataEvento extends DataBase {

    public LinkedList<Evento> selectEventos() throws SQLException {
        LinkedList<Evento> listaEventos = new LinkedList<Evento>();
        Evento evento;
        String sql = "select * from evento e inner join evenTieneCat c "
                + "on e.idEvento = c.idEvento inner join categoria o "
                + "on o.idCategoria = c.idCategoria order by fecha;";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        try {

            Statement statement = conexion.createStatement();
            resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                
   
                evento = new Evento(resultado.getInt("idEvento"), 
                        resultado.getInt("idCategoria"),
                        resultado.getString("nombreCategoria"),
                        resultado.getString("lugar"), 
                        resultado.getString("nombre"), 
                        resultado.getTime("hora"),
                        resultado.getString("fecha"), 
                        resultado.getString("informacion"),
                        resultado.getString("correo"), 
                        resultado.getString("imagen"));

                listaEventos.add(evento);
            }//fin while

            statement.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            listaEventos = null;
        } finally {
            conexion.close();
        }

        return listaEventos;
    }//fin selectEventos
    
    public LinkedList<Evento> selectEventos(String correo) throws SQLException {
        LinkedList<Evento> listaEventos = new LinkedList<Evento>();
        Evento evento;
        String sql = "select * from evento e inner join evenTieneCat c "
                + "on e.idEvento = c.idEvento inner join categoria o "
                + "on o.idCategoria = c.idCategoria where correo = '"+correo+"' order by fecha;";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        try {

            Statement statement = conexion.createStatement();
            resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                
   
                evento = new Evento(resultado.getInt("idEvento"), 
                        resultado.getInt("idCategoria"),
                        resultado.getString("nombreCategoria"),
                        resultado.getString("lugar"), 
                        resultado.getString("nombre"), 
                        resultado.getTime("hora"),
                        resultado.getString("fecha"), 
                        resultado.getString("informacion"),
                        resultado.getString("correo"), 
                        resultado.getString("imagen"));

                listaEventos.add(evento);
            }//fin while

            statement.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            listaEventos = null;
        } finally {
            conexion.close();
        }

        return listaEventos;
    }//fin selectEventos

    public boolean actualizarEvento(Evento evento) throws SQLException {

        boolean accionRealizada = true;
        String sql = "call pActualizarEvento(?,?,?,?,?,?,?,?,?,?,?);";
        Connection conexion = super.getConexion();

        try {
            CallableStatement call = conexion.prepareCall(sql);

            call.setInt("pidEvento", evento.getIdEvento());
            call.setString("pnombre", evento.getNombre());
            call.setString("plugar", evento.getLugar());
//            call.setString("phora", evento.getHora());
//            call.setString("pminutos", evento.getMinutos());
//            call.setString("ptiempo", evento.getTiempo());
//            call.setString("pfecha", evento.getFecha());
            call.setString("pinformacion", evento.getInformacion());
            call.setString("pcorreo", evento.getCorreo());
            call.setString("pimagen", evento.getImagen());
            call.setInt("pidCategoria", evento.getIdCategoria());

            call.executeUpdate();
            call.close();



        } catch (Exception e) {
            accionRealizada = false;
        } finally {
            conexion.close();
        }
        return accionRealizada;
    }

    public boolean crearEvento(Evento evento) throws SQLException {

      
        String sql1 = " insert into evento (correo,fecha,hora,informacion,lugar,nombre, imagen)"
                + " values (?, ?, ?, ?, ?, ?, ?);";
        
         String sql2 = "insert into evenTieneCat (idCategoria,idEvento)"
                 + "values (?,LAST_INSERT_ID ());";
       
		
        boolean accionRealizada = true;
        Connection conexion = super.getConexion();

        try {
            PreparedStatement st1 = conexion.prepareStatement(sql1);
            PreparedStatement st2 = conexion.prepareStatement(sql2);

            st1.setString(6, evento.getNombre());
            st1.setString(5, evento.getLugar());
            st1.setTime(3, evento.getTiempo());
            st1.setString(2, evento.getFecha());
            st1.setString(4, evento.getInformacion());
            st1.setString(1, evento.getCorreo());
            st2.setInt(1, evento.getIdCategoria());
            st1.setString(7, evento.getImagen());


            st1.execute();
            st1.close();
            
            st2.execute();
            st2.close();
        } catch (Exception e) {
               JOptionPane.showMessageDialog(null, e.getMessage());
            accionRealizada = false;
        } finally {
            conexion.close();
        }//fin try

        return accionRealizada;
    }

    public Evento selectEvento(int idEvento) throws SQLException {
        LinkedList<Evento> listaEventos = new LinkedList<Evento>();
        Evento evento = null;
        String sql = "call pListaEventos();";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        try {

            Statement statement = conexion.createStatement();
            resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                 evento = new Evento(resultado.getInt("idEvento"),
                        resultado.getInt("idCategoria"),
                        resultado.getString("nombreCategoria"),
                        resultado.getString("lugar"), resultado.getString("nombre"), resultado.getTime("tiempo"),
                        resultado.getString("fecha"), 
                        resultado.getString("informacion"),
                        resultado.getString("correo"), 
                        resultado.getString("imagen"));
                listaEventos.add(evento);
            }//fin while

            statement.close();
        } catch (Exception e) {
            evento = null;
        } finally {
            conexion.close();
        }//fin try

        for (int i = 0; i < listaEventos.size(); i++) {
            if (listaEventos.get(i).getIdEvento() == idEvento) {
                evento = listaEventos.get(i);
                i = listaEventos.size();
            }//fin if
        }//fin for


        return evento;
    }//fin selectEventos

    public boolean eliminarEvento(int idEvento) throws SQLException {
        
        
		
        String sqlEliminarEvento = "delete from evento where idEvento=?;";
        String sqlEliminarEventienenCat = "delete from evenTieneCat where idEvento=?;";
        boolean accionRealizada = true;

        Connection conexion = super.getConexion();
        try {
            conexion.setAutoCommit(false);

            PreparedStatement cStateEventienecat = conexion.prepareStatement(sqlEliminarEventienenCat);
            cStateEventienecat.setInt(1, idEvento);
            cStateEventienecat.executeUpdate();

            PreparedStatement cStateEvento = conexion.prepareStatement(sqlEliminarEvento);
            cStateEvento.setInt(1, idEvento);
            cStateEvento.executeUpdate();

            conexion.commit();
            cStateEventienecat.close();
            cStateEvento.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            accionRealizada = false;
            if (conexion != null) {
                conexion.rollback();
            }
        } finally {
            conexion.close();
        }
        return accionRealizada;
    }

    
    public int selectIdEvento() throws SQLException {
        int idEvento = 0;
        String sql = "select idEvento from evento order by 1 desc limit 1;";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        try {

            Statement statement = conexion.createStatement();
            resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                idEvento = resultado.getInt(1);
            }//fin while
            idEvento = idEvento + 1;
            statement.close();
        } catch (Exception e) {
            idEvento = 0;
        } finally {
            conexion.close();
        }//fin try



        return idEvento;
    }//fin 
}


//<a href="./listar_evento.do">
//                    <button id="boton-volver">
//                        <bean:message key="boton.volver"/>
//                    </button>
//                </a>