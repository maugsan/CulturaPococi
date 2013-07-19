/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.culturaPococi.accion.perfil;

import com.culturaPococi.negocio.NegocioPerfil;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author Moa
 */
public class EliminarPerfilAction extends DispatchAction {

    NegocioPerfil np;

     private static final String EXITOSO = "exitoso";
    private static final String DENEGADO = "denegado";

    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        np = new NegocioPerfil();
        String id = request.getParameter("idPerfil");
        if (id == null) {
            
              request.setAttribute("mensaje", "<h2 id='incorrecto'>Oops!</h2>");
              return mapping.findForward(DENEGADO);
        }

         np.eliminarPerfil(id);
         request.setAttribute("mensaje", "<h2 id='correcto'>Se ha eliminado el perfil!</h2>");
        return mapping.findForward(EXITOSO);
    }
}
