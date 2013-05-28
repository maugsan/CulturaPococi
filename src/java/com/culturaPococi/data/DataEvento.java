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
public class DataEvento extends DataBase{
    
    
    public LinkedList<Evento> selectEventos() throws SQLException{
        LinkedList<Evento> listaEventos=new LinkedList<Evento>();
        Evento evento;
        String sql = "call pListaEventos();" ;
        ResultSet resultado;
        Connection conexion = super.getConexion();

        
        try{
            
            Statement statement = conexion.createStatement(); 
            resultado=statement.executeQuery(sql);
            
            while (resultado.next()) { 
            evento=new Evento(resultado.getInt("idEvento"),resultado.getInt("idCategoria"),
                    resultado.getString("nombreCategoria"),
                    resultado.getString("lugar"),resultado.getString("nombre"),  
                    resultado.getString("fecha"),resultado.getString("hora"), 
                    resultado.getString("informacion"), 
                    resultado.getString("correo"),"");
            listaEventos.add(evento);
        }//fin while
        
            statement.close();
        }catch(Exception e){
            listaEventos=null;
        }finally{
             conexion.close();
        }
        
        return listaEventos;
    }//fin selectEventos
    
    

     public boolean  actualizarEvento(Evento evento) throws SQLException{
    
         boolean accionRealizada=true;
        String sql = "call pActualizarEventon(?,?,?,?,?,?);";
        Connection conexion = super.getConexion();
        
        try{
            CallableStatement call=conexion.prepareCall(sql);
        
        call.setInt("pidEvento", evento.getIdEvento());
        call.setString("pnombre",evento.getNombre());
        call.setString("plugar",evento.getLugar());
        //call.setTime("phora", evento.getFecha());
        //call.setDate("pfecha", null);
        call.setString("pinformacion",evento.getInformacion());
        call.setString("pcorreo",evento.getCorreo());
        call.setInt("pidCategoria", evento.getIdCategoria());   
        call.executeUpdate();
        call.close();
            
        }catch(Exception e){
            accionRealizada=false;
        }finally{
             conexion.close();
        }
        return accionRealizada;
    }
     
     public boolean crearEvento(Evento evento) throws SQLException {

        String sql = "call pCrearEventos(?,?,?,?,?,?,?,?);";
        boolean accionRealizada = true;
        Connection conexion = super.getConexion();

        try {
            CallableStatement call = conexion.prepareCall(sql);

            call.setString("pnombre", evento.getNombre());
            JOptionPane.showMessageDialog(null, "1:"+evento.getNombre());
            call.setString("plugar", evento.getLugar());
            JOptionPane.showMessageDialog(null, "2:"+evento.getLugar());
            call.setString("phora", evento.getHora());
            JOptionPane.showMessageDialog(null, "3:"+evento.getHora());
            call.setString("pfecha", evento.getFecha());
            JOptionPane.showMessageDialog(null, "4:"+evento.getFecha());
            call.setString("pinformacion", evento.getInformacion());
            JOptionPane.showMessageDialog(null, "5:"+evento.getInformacion());
            call.setString("pcorreo",evento.getCorreo());
            JOptionPane.showMessageDialog(null, "6:"+evento.getCorreo());
            call.setInt("pidCategoria", evento.getIdCategoria());
            JOptionPane.showMessageDialog(null, "7:"+evento.getIdCategoria());
            call.setString("pimagen",evento.getImagen());
            JOptionPane.showMessageDialog(null, "8:"+evento.getImagen());
            call.executeUpdate();
             JOptionPane.showMessageDialog(null, "9");
            call.close();
        } catch (Exception e) {
            accionRealizada = false;
        } finally {
            conexion.close();
        }//fin try

        return accionRealizada;
    }
     
     public Evento selectEvento(int idEvento) throws SQLException{
        LinkedList<Evento> listaEventos=new LinkedList<Evento>();
        Evento evento=new Evento();
        String sql = "call pListaEventos();" ;
        ResultSet resultado;
        Connection conexion = super.getConexion();

        try{
            
            Statement statement = conexion.createStatement(); 
            resultado=statement.executeQuery(sql);
            
            while (resultado.next()) { 
            evento=new Evento(resultado.getInt("idEvento"),resultado.getInt("idCategoria"),
                    resultado.getString("nombreCategoria"),
                    resultado.getString("lugar"),resultado.getString("nombre"),  
                    resultado.getString("fecha"),resultado.getString("hora"), 
                    resultado.getString("informacion"), 
                    resultado.getString("correo"),"");
            listaEventos.add(evento);
        }//fin while

        statement.close();    
        }catch(Exception e){
            evento=null;
        }finally{
             conexion.close();
        }//fin try
        
        for(int i=0; i<listaEventos.size();i++){
            if(listaEventos.get(i).getIdEvento()==idEvento){
                evento=listaEventos.get(i);
                 i=listaEventos.size();
            }//fin if
        }//fin for
       
        
        return evento;
    }//fin selectEventos
     

    public boolean eliminarEvento(int idEvento) throws SQLException{
        String sqlEliminarEvento="call pEliminarEvento(?);" ;
        String sqlEliminarEventienenCat="call pEliminarEventienecat(?);";
        boolean accionRealizada=true;
        
        Connection conexion=super.getConexion();
        try{
            conexion.setAutoCommit(false);
            
            CallableStatement cStateEventienecat=conexion.prepareCall(sqlEliminarEventienenCat);
            cStateEventienecat.setInt("pidEvento", idEvento);
            cStateEventienecat.executeUpdate();
            
            CallableStatement cStateEvento=conexion.prepareCall(sqlEliminarEvento);
            cStateEvento.setInt("pidEvento", idEvento);
            cStateEvento.executeUpdate();
            
            conexion.commit();
            cStateEventienecat.close();
            cStateEvento.close();
        }catch(Exception e){
            accionRealizada=false;
            if(conexion!=null){
                conexion.rollback();
            }
        }finally{
             conexion.close();
        }
        return accionRealizada;
    }
    
    
     
}


//<a href="./listar_evento.do">
//                    <button id="boton-volver">
//                        <bean:message key="boton.volver"/>
//                    </button>
//                </a>