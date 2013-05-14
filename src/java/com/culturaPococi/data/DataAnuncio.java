/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.data;

import com.culturaPococi.dominio.Anuncio;
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
public class DataAnuncio extends DataBase{
    
    public LinkedList<Anuncio> selectAnuncios() throws SQLException{
        LinkedList<Anuncio> listaAnuncios=new LinkedList<Anuncio>();
        Anuncio anuncio=new Anuncio();
        String sql = "call pListarAnuncios();";
        ResultSet resultado;
        Connection conexion = super.getConexion();
    
        Statement statement = conexion.createStatement(); 
        resultado=statement.executeQuery(sql);
        
        
        while (resultado.next()) { 
            anuncio=new Anuncio(resultado.getString("titulo"), resultado.getBlob("imagen"), 
                    resultado.getInt("prioridad"), resultado.getInt("idAnuncio"));
            listaAnuncios.add(anuncio);
        }//fin while
        statement.close();
        conexion.close();
        return listaAnuncios;
    }//fin selectAnuncios  
    
    
    public void eliminarAnuncio(int idAnuncio) throws SQLException{
        String sql = "call pEliminarAnuncio("+idAnuncio+");" ;
       
        Connection conexion = super.getConexion();

        Statement statement = conexion.createStatement(); 
        statement.executeQuery(sql);
        statement.close();
        conexion.close();
    }//fin eliminarEventos 
    
    public LinkedList selectPrioridades() throws SQLException{
        LinkedList listaPrioridades=new LinkedList();
        String sql = "call pListarPrioridades();";
        ResultSet resultado;
        Connection conexion = super.getConexion();
    
        Statement statement = conexion.createStatement(); 
        resultado=statement.executeQuery(sql);
        
        
        while (resultado.next()) { 
            listaPrioridades.add(resultado.getString("numPrioridad"));
        }//fin while
        statement.close();
        conexion.close();
        return listaPrioridades;
    }//fin selectAnuncios  
    
    public Anuncio selectAnuncio(int idAnuncio) throws SQLException{
        Anuncio anuncio=new Anuncio();
        String sql = "call pAnuncio("+idAnuncio+");";
        ResultSet resultado;
        Connection conexion = super.getConexion();
    
        Statement statement = conexion.createStatement(); 
        resultado=statement.executeQuery(sql);
        
        
        while (resultado.next()) { 
            anuncio=new Anuncio(resultado.getString("titulo"), 
                null, resultado.getInt("prioridad"), resultado.getInt("idAnuncio"));
        }//fin while
     
        statement.close();
        conexion.close();
        return anuncio;
    }//fin selectAnuncios  
    
    public void  crearAnuncio(Anuncio anuncio) throws SQLException{
    
        String sql = "call pCrearAnuncio(?,?);";
        Connection conexion = super.getConexion();
        CallableStatement call=conexion.prepareCall(sql);
        
        
        call.setString("ptitulo",anuncio.getTitulo());
        call.setInt("pprioridad",anuncio.getPrioridad());

        call.executeUpdate();
        call.close();
        conexion.close();
    }
    
}

//<h1><a href="./Prueba">Insertar Parque</a></h1>





//<html:select property="prioridad">
//                    <logic:iterate name="listaPrioridades" id="numero" >
//                        <html:option value="${numero.listaPrioridades}"> <!-- esto es para que cuando elija el nombre me envie el numero !-->
//                            <bean:write name="numero" property="idAnuncio"/>
//                        </html:option>
//                    </logic:iterate>
//                </html:select>