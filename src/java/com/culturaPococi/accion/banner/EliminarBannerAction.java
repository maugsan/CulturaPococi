/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.banner;

import com.culturaPococi.negocio.NegocioBanner;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Pedro
 */
public class EliminarBannerAction extends org.apache.struts.action.Action {

    NegocioBanner nb = new NegocioBanner();
    private static final String EXITOSO = "exitoso";
    private static final String DENEGADO = "denegado";
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
         String id = (String)request.getParameter("id");
        nb.eliminarBanner(id);
        return mapping.findForward(EXITOSO);
    }
}
