/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.usuarioNormal;


import com.culturaPococi.negocio.NegocioUsuarioNormal;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Moa
 */
public class EliminarUsuarioNormalAction extends org.apache.struts.action.Action {

    private static final String EXITOSO = "exitoso";
  
    private NegocioUsuarioNormal nUsuario = new NegocioUsuarioNormal();
   
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        String correo = (String)request.getParameter("c");
        nUsuario.eliminarUsuariosDB(correo);
        return mapping.findForward(EXITOSO);
    }
}
