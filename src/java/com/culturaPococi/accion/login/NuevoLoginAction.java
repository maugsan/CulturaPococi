/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.login;

import com.culturaPococi.negocio.NegocioUsuarioNOrmal;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
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
    NegocioUsuarioNOrmal nun = new NegocioUsuarioNOrmal();

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        System.out.println("ENTRO A ACTION-------------------------------------------------------------------");

        NuevoLoginForm login = (NuevoLoginForm) form;


        if (nun.verificarUsuarioNormal(login.getCorreo(), login.getContrasenia())) {
            System.out.println("ENTRO----------------------------------------------------------------");
            return mapping.findForward(EXITOSO);
        } else {

            System.out.println("NO ENTRO----------------------------------------------------------------");
            return mapping.findForward(DENEGADO);
        }

    }
}
