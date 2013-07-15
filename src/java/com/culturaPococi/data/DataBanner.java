/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import com.culturaPococi.dominio.Banner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class DataBanner extends DataBase{
    
     public boolean crearBanner(Banner banner) throws SQLException {

        String sql = "insert into banner(`nombreBanner`,`urlBanner`,`descripcionBanner`) values (ENCRYPT(?),?,?);";
        boolean accionRealizada = true;
        Connection conexion = super.getConexion();

        try {
            PreparedStatement st = conexion.prepareStatement(sql);
            
            st.setString(1, banner.getNombreBanner());
            st.setString(2, banner.getUrlBanner());
            st.setString(3, banner.getDescripcionBanner());
  
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
           
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            conexion.close();
        }//fin try

        return accionRealizada;
    }
    
}
