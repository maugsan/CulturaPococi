/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.login;

import com.culturaPococi.negocio.NegocioUsuarioAdministrador;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author Mac
 */
public class NuevoLoginAction extends DispatchAction {

    /* forward name="success" path="" */
    private static final String EXITOSO = "exitoso";
    private static final String DENEGADO = "denegado";
    NegocioUsuarioAdministrador nua = new NegocioUsuarioAdministrador();

   
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        System.out.println("ENTRO A ACTION-------------------------------------------------------------------");

        NuevoLoginForm login = (NuevoLoginForm) form;
        String correo=login.getCorreo();

        if (nua.verificarUsuarioAdministrador(login.getCorreo(), login.getContrasenia())) {
            System.out.println("ENTRO----------------------------------------------------------------");
            return mapping.findForward(EXITOSO);
        } else {

            System.out.println("NO ENTRO----------------------------------------------------------------");
            return mapping.findForward(DENEGADO);
        }

    }
}
