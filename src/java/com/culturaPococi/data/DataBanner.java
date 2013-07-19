/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import com.culturaPococi.dominio.Banner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class DataBanner extends DataBase{
    
     public boolean crearBanner(Banner banner) throws SQLException {

        String sql = "insert into banner(`nombreBanner`,`urlBanner`,`descripcionBanner`) values (?,?,?);";
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
     
     
     public LinkedList<Banner> selectBanners() throws SQLException {
        
        LinkedList<Banner> listaBanners = new LinkedList<Banner>();
        Banner b;
        String sql = "select * from banner;";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        try {
            Statement statement = conexion.createStatement();
            resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                b = new Banner(resultado.getInt(1), 
                        resultado.getString(2), resultado.getString(3), resultado.getString(4));
                listaBanners.add(b);
            }//fin while

            statement.close();
        } catch (Exception e) {
            listaBanners = null;
        } finally {
            conexion.close();
        }

        return listaBanners;
    }//fin selectBanners
     
     
     
     public void eliminarBanner(String id) throws SQLException{
         
         

      
        String sql = "DELETE FROM `banner` WHERE `idBanner` = '"+id+"';";
        

        Connection conexion = super.getConexion();
        
       try {
            Statement statement = conexion.createStatement();
           
            statement.execute(sql);
            


            statement.close();
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            conexion.close();
        }
       
    }
     
   
    
}
