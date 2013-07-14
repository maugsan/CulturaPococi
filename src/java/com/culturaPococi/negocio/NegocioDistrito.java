/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.negocio;

import com.culturaPococi.data.DataDistrito;
import com.culturaPococi.dominio.Distrito;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Pedro
 */
public class NegocioDistrito {
    
    DataDistrito dis = new DataDistrito();
    public LinkedList<Distrito> selectDistrito() throws SQLException {
    
    return dis.selectDistritos();
    }
    
}
