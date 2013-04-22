/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import com.culturaPococi.data.DataAnuncio;
import java.sql.SQLException;

/**
 *
 * @author Moa
 */
public class Prueba {

    public Prueba() {}
    
    public void probar() throws SQLException{
        DataAnuncio anuncio=new DataAnuncio();
        anuncio.selectPeliculas();
    }
    
    
}
