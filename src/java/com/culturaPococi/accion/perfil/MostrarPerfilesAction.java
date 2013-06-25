/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.perfil;

import com.culturaPococi.data.DataPerfil;
import com.culturaPococi.negocio.NegocioPerfil;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author jonathan
 */
public class MostrarPerfilesAction extends DispatchAction {

    NegocioPerfil np=new NegocioPerfil();

    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        request.setAttribute("listaPerfil", np.getListaPerfil());
        return mapping.getInputForward();

    }
}
