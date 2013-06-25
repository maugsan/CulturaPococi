/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import com.culturaPococi.dominio.Articulo;
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
public class DataArticulo extends DataBase {

    public DataArticulo() {}
    
    public LinkedList<Articulo> selectArticulos(String fecha) throws SQLException {
        LinkedList<Articulo> listaArticulos=new LinkedList<Articulo>();
        Articulo articulo;
        String sql = "call pListarArticulosPorBoletin('"+fecha+"');";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        try {
            Statement statement = conexion.createStatement();
            resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                articulo = new Articulo(resultado.getInt("idArticulo"),
                                        resultado.getString("imagen"),
                                        resultado.getInt("categoria"),
                                        resultado.getString("titulo"),
                                        resultado.getString("autor"),
                                        resultado.getString("contenido"),
                                        resultado.getString("fecha"));
                listaArticulos.add(articulo);
            }//fin while

            statement.close();
        } catch (Exception e) {
            listaArticulos = null;
        } finally {
            conexion.close();
        }

        return listaArticulos;
    }//fin selectCategoria
    
    
    
    public Articulo selectArticulo(int idArticulo,String fechaBoletin) throws SQLException {
        LinkedList<Articulo> listaArticulos;
        Articulo articulo=new Articulo();
        
        listaArticulos=selectArticulos(fechaBoletin);
        if(listaArticulos!=null){
            for(int i=0;i<listaArticulos.size(); i++){
                if(idArticulo==listaArticulos.get(i).getIdArticulo()){
                    articulo=listaArticulos.get(i);
                }
            }// fin for
        }else{
            articulo=null;
        }//fin else
        return articulo;
    }
    
    public boolean crearArticulo(Articulo articulo) throws SQLException {

        String sql = "call pCrearArticulo(?,?,?,?,?,?);";
        boolean accionRealizada = true;
        Connection conexion = super.getConexion();

        try {
            CallableStatement call = conexion.prepareCall(sql);
            call.setString("pimagen", articulo.getImagen());
            call.setInt("pcategoria", articulo.getCategoria());
            call.setString("ptitulo", articulo.getTitulo());
            call.setString("pautor", articulo.getAutor());
            call.setString("pcontenido", articulo.getContenido());
            call.setString("pfecha", articulo.getFecha());
            
            call.executeUpdate();
            call.close();
        } catch (Exception e) {
            accionRealizada = false;
        } finally {
            conexion.close();
        }//fin try

        return accionRealizada;
    }
    
    
    public boolean actualizarArticulo(Articulo articulo) throws SQLException {

        String sql = "call pActualizarArticulo(?,?,?,?,?,?,?);";
        boolean accionRealizada = true;
        Connection conexion = super.getConexion();

        try {
            CallableStatement call = conexion.prepareCall(sql);
            call.setString("pimagen", articulo.getImagen());
            call.setInt("pcategoria", articulo.getCategoria());
            call.setString("ptitulo", articulo.getTitulo());
            call.setString("pautor", articulo.getAutor());
            call.setString("pcontenido", articulo.getContenido());
            call.setString("pfecha", articulo.getFecha());
            call.setInt("pidArticulo", articulo.getIdArticulo());
            
            call.executeUpdate();
            call.close();
        } catch (Exception e) {
            accionRealizada = false;
        } finally {
            conexion.close();
        }//fin try
        return accionRealizada;
    }//fin actualizarArticulo
    
    
    public boolean eliminarArticulos(int idArticulo) throws SQLException{
        String sqleliminarArticulo="call pEliminarArticulo(?);" ;
        boolean accionRealizada=true;
        Connection conexion=super.getConexion();
        try{
            
            CallableStatement call=conexion.prepareCall(sqleliminarArticulo);
            call.setInt("pidArticulo", idArticulo);
            call.executeUpdate();
            
            call.close();
        }catch(Exception e){
            accionRealizada=false;
        }finally{
             conexion.close();
        }
        return accionRealizada;
    }
    
    
    public int selectIdArticulo() throws SQLException {
        int idArticulo = 0;
        String sql = "select idArticulo from articulo order by 1 desc limit 1;";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        try {

            Statement statement = conexion.createStatement();
            resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                idArticulo = resultado.getInt(1);
            }//fin while
            idArticulo = idArticulo + 1;
            statement.close();
        } catch (Exception e) {
            idArticulo = 0;
        } finally {
            conexion.close();
        }//fin try

        return idArticulo;
    }//fin 
    
}
