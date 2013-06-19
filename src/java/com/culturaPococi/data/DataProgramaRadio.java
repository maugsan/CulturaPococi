/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import com.culturaPococi.dominio.programaRadio;
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
public class DataProgramaRadio extends DataBase {

    public LinkedList<programaRadio> listaProgramacionRadio() throws SQLException {

        LinkedList<programaRadio> lista = new LinkedList<programaRadio>();
        programaRadio programaR;
        String sql = "call pListaProgramaRadio();";

        ResultSet resultado;
        Connection conexion = super.getConexion();

        try {
            Statement statement = conexion.createStatement();
            resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                programaR = new programaRadio("", "", "", "");

                String nombre = resultado.getString("nombre");
                String horario = resultado.getString("horario");
                String descripcion = resultado.getString("descripcion");
                String correo = resultado.getString("correo");

                programaR.setNombre(nombre);
                programaR.setHorario(horario);
                programaR.setDescripcion(descripcion);
                programaR.setCorreo(correo);

                lista.add(programaR);
            }//fin while

            statement.close();
        } catch (Exception e) {
            lista = null;
        } finally {
            conexion.close();
        }
        return lista;
    }

    public boolean  nuevoProgramaRadio(programaRadio programa) throws SQLException {

        String sql = "call pNuevoProgramaRadio(?,?,?,?);";
        boolean accionRealizada = true;
        Connection conexion = super.getConexion();

        try {
            CallableStatement call = conexion.prepareCall(sql);

            call.setString("nombre", programa.getNombre());
            call.setString("horario", programa.getHorario());
            call.setString("descripcion", programa.getDescripcion());
            call.setString("correo", programa.getCorreo());
            JOptionPane.showMessageDialog(null, "11111111");

            call.executeUpdate();
            call.close();
JOptionPane.showMessageDialog(null, "222222222");
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

    
    public boolean eliminarProgramaRadio(String nombre) throws SQLException {
        String sql = "call pEliminarProgramaRadio(?);";
        boolean accionRealizada = true;
        Connection conexion = super.getConexion();

        try {
            conexion.setAutoCommit(false);
            CallableStatement cStateEliminar = conexion.prepareCall(sql);
            cStateEliminar.setString("pnombre", nombre);
            cStateEliminar.executeUpdate();

            conexion.commit();
            cStateEliminar.close();

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
}
