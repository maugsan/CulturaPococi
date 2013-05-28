/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.negocio;

import com.culturaPococi.data.DataProgramaRadio;
import com.culturaPococi.dominio.programaRadio;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author jonathan
 */
public class NegocioProgramaRadio {

    DataProgramaRadio dp;
    
    public NegocioProgramaRadio() {
        dp=new DataProgramaRadio();
    }
  
    public LinkedList<programaRadio> listaProgramacionRadio() throws SQLException{ 
        return dp.listaProgramacionRadio();
    }
    
    public void eliminar(String nombre) throws SQLException{
    dp.eliminarProgramaRadio(nombre);
    }
    
    public void nuevoProgramaRadio(programaRadio programa) throws SQLException{
    dp.nuevoProgramaRadio(programa);
    }
}
