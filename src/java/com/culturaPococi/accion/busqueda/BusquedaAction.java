/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.busqueda;

import com.culturaPococi.negocio.NegocioBusqueda;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author MAU
 */
public class BusquedaAction extends DispatchAction {


    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
 
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        String palabra = (String) request.getParameter("q");
        int tipo = Integer.parseInt((String)request.getParameter("tipo"));
       
        NegocioBusqueda  nB = new NegocioBusqueda();
        
        if (palabra != null)
        request.setAttribute("lista",nB.buscar(palabra, tipo));
        
        return mapping.getInputForward();
    }
}
