
package com.culturaPococi.negocio;

import com.culturaPococi.data.DataBanner;
import com.culturaPococi.dominio.Banner;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Pedro
 */
public class NegocioBanner {
    
    DataBanner db = new DataBanner();
    public void crearBanner(Banner banner) throws SQLException {
    
        db.crearBanner(banner);
    }
    public LinkedList<Banner> selectBanners() throws SQLException {
    
        return db.selectBanners();
    }
    
    public void eliminarBanner(String id) throws SQLException {
     db.eliminarBanner( id);
    }
}
