/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.negocio;

import com.culturaPococi.data.DataBoletin;
import com.culturaPococi.dominio.Boletin;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author jonathan
 */
public class NegocioBoletin {

    
    DataBoletin dBoletin;
    
    public NegocioBoletin() {
         dBoletin=new DataBoletin();
    }
    
    public LinkedList<Boletin> bdListarBoletines() throws SQLException{
        return dBoletin.selectCategorias();
    }
    
    public boolean bdCrearBolentin(String fecha, String correo) throws SQLException{
        return dBoletin.crearBoletin(fecha, correo);
    }
    
    public boolean bdEliminarBolentin(String fecha) throws SQLException{
        return dBoletin.eliminarBoletin(fecha);
    }
    
    
    
    
}
