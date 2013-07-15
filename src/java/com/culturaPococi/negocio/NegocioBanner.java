
package com.culturaPococi.negocio;

import com.culturaPococi.data.DataBanner;
import com.culturaPococi.dominio.Banner;
import java.sql.SQLException;

/**
 *
 * @author Pedro
 */
public class NegocioBanner {
    
    DataBanner db = new DataBanner();
    public void crearBanner(Banner banner) throws SQLException {
    
        db.crearBanner(banner);
    }
}
