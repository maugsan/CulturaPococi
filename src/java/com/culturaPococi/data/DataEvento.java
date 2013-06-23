/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import com.culturaPococi.dominio.Evento;
import java.sql.CallableStatement;
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
public class DataEvento extends DataBase {

    public LinkedList<Evento> selectEventos() throws SQLException {
        LinkedList<Evento> listaEventos = new LinkedList<Evento>();
        Evento evento;
        String sql = "call pListaEventos();";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        try {

            Statement statement = conexion.createStatement();
            resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                evento = new Evento(resultado.getInt("idEvento"), resultado.getInt("idCategoria"),
                        resultado.getString("nombreCategoria"),
                        resultado.getString("lugar"), resultado.getString("nombre"),
                        resultado.getString("fecha"), resultado.getString("hora"),
                        resultado.getString("minutos"), resultado.getString("tiempo"),
                        resultado.getString("informacion"),
                        resultado.getString("correo"), 
                        resultado.getString("imagen"));

                listaEventos.add(evento);
            }//fin while

            statement.close();
        } catch (Exception e) {
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
            call.setString("phora", evento.getHora());
            call.setString("pminutos", evento.getMinutos());
            call.setString("ptiempo", evento.getTiempo());
            call.setString("pfecha", evento.getFecha());
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

        String sql = "call pCrearEventos(?,?,?,?,?,?,?,?,?,?);";

        boolean accionRealizada = true;
        Connection conexion = super.getConexion();

        try {
            CallableStatement call = conexion.prepareCall(sql);

            call.setString("pnombre", evento.getNombre());
            call.setString("plugar", evento.getLugar());
            call.setString("phora", evento.getHora());
            call.setString("pminutos", evento.getMinutos());
            call.setString("ptiempo", evento.getTiempo());
            call.setString("pfecha", evento.getFecha());
            call.setString("pinformacion", evento.getInformacion());
            call.setString("pcorreo", evento.getCorreo());
            call.setInt("pidCategoria", evento.getIdCategoria());
            call.setString("pimagen", evento.getImagen());


            call.executeUpdate();
            call.close();
        } catch (Exception e) {
            accionRealizada = false;
        } finally {
            conexion.close();
        }//fin try

        return accionRealizada;
    }

    public Evento selectEvento(int idEvento) throws SQLException {
        LinkedList<Evento> listaEventos = new LinkedList<Evento>();
        Evento evento = new Evento();
        String sql = "call pListaEventos();";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        try {

            Statement statement = conexion.createStatement();
            resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                evento = new Evento(resultado.getInt("idEvento"), resultado.getInt("idCategoria"),
                        resultado.getString("nombreCategoria"),
                        resultado.getString("lugar"), resultado.getString("nombre"),
                        resultado.getString("fecha"), resultado.getString("hora"),
                        resultado.getString("minutos"), resultado.getString("tiempo"),
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
        String sqlEliminarEvento = "call pEliminarEvento(?);";
        String sqlEliminarEventienenCat = "call pEliminarEventienecat(?);";
        boolean accionRealizada = true;

        Connection conexion = super.getConexion();
        try {
            conexion.setAutoCommit(false);

            CallableStatement cStateEventienecat = conexion.prepareCall(sqlEliminarEventienenCat);
            cStateEventienecat.setInt("pidEvento", idEvento);
            cStateEventienecat.executeUpdate();

            CallableStatement cStateEvento = conexion.prepareCall(sqlEliminarEvento);
            cStateEvento.setInt("pidEvento", idEvento);
            cStateEvento.executeUpdate();

            conexion.commit();
            cStateEventienecat.close();
            cStateEvento.close();
        } catch (Exception e) {
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
        JOptionPane.showMessageDialog(null, "idEvento " + idEvento);



        return idEvento;
    }//fin 
}


//<a href="./listar_evento.do">
//                    <button id="boton-volver">
//                        <bean:message key="boton.volver"/>
//                    </button>
//                </a>