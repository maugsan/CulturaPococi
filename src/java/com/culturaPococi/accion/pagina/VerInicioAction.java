/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.pagina;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.culturaPococi.dominio.Banner;
import com.culturaPococi.negocio.NegocioBanner;
/**
 *
 * @author Pedro
 */
public class VerInicioAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
  
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        NegocioBanner np = new NegocioBanner();
        request.setAttribute("listaBanners",np.selectBanners());
        
        return mapping.getInputForward();
    }
}
