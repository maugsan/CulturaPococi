/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.categoria;

import com.culturaPococi.negocio.NegocioCategoria;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Pedro
 */
public class EliminarCategoriaAction extends org.apache.struts.action.Action {

   
    private static final String EXITOSO = "exitoso";
    private static final String DENEGADO = "denegado";

    NegocioCategoria nCategoria = new NegocioCategoria();
  
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        String id = (String)request.getParameter("id");
        nCategoria.eliminarCategoria(id);
        return mapping.findForward(EXITOSO);
    }
}
