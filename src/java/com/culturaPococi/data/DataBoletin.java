
package com.culturaPococi.data;

import com.culturaPococi.dominio.Boletin;
import com.culturaPococi.dominio.Categoria;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author jonathan
 */
public class DataBoletin extends DataBase{

    public DataBoletin() {}
    
    public LinkedList<Boletin> selectCategorias() throws SQLException {
        LinkedList<Boletin> listaBoletines=new LinkedList<Boletin>();
        Boletin boletin;
        String sql = "select * from boletin;";
        ResultSet resultado;
        Connection conexion = super.getConexion();

        try {
            Statement statement = conexion.createStatement();
            resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                boletin = new Boletin(resultado.getString("fecha"), 
                        resultado.getString("correo"));
                listaBoletines.add(boletin);
            }//fin while

            statement.close();
        } catch (Exception e) {
            listaBoletines = null;
        } finally {
            conexion.close();
        }

        return listaBoletines;
    }//fin selectCategoria
    
    
    public boolean crearBoletin(String fecha, String correo) throws SQLException {

        String sql = "call pCrearBoletin(?,?);";
        boolean accionRealizada = true;
        Connection conexion = super.getConexion();

        try {
            CallableStatement call = conexion.prepareCall(sql);

            call.setString("pfecha", fecha);
            call.setString("pCorreo", correo);
            
            call.executeUpdate();
            call.close();
        } catch (Exception e) {
            accionRealizada = false;
        } finally {
            conexion.close();
        }//fin try

        return accionRealizada;
    }
    
    public boolean eliminarBoletin(String fecha) throws SQLException{
        String sqleliminarBoletin="call pEliminaBoletin(?);" ;
        boolean accionRealizada=true;
        
        Connection conexion=super.getConexion();
        try{
            
            CallableStatement call=conexion.prepareCall(sqleliminarBoletin);
            call.setString("pfecha", fecha);
            call.executeUpdate();
            
            call.close();
        }catch(Exception e){
            accionRealizada=false;
        }finally{
             conexion.close();
        }
        return accionRealizada;
    }
    
    
}
