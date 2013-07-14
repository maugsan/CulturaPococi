/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.perfil;

import com.culturaPococi.dominio.Perfil;
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
public class MostrarPerfilSeleccionadoAction extends DispatchAction{
  Perfil p ;
  NegocioPerfil np;
   
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        np = new NegocioPerfil();

        String idPerfil = ""+request.getParameter("idPerfil");

        p = np.mostrarPerfil(idPerfil);

        request.setAttribute("perfil", p);

        return mapping.getInputForward();
    }

 
}
