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

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

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
        np = new NegocioPerfil();
        String nombre = request.getParameter("nombrePerfil");

        np.eliminarPerfil(nombre);

        return mapping.findForward(SUCCESS);
    }
}
