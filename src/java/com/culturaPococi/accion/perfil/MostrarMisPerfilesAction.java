/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.perfil;

import com.culturaPococi.dominio.Perfil;
import com.culturaPococi.negocio.NegocioPerfil;
import java.util.LinkedList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Pedro
 */
public class MostrarMisPerfilesAction extends org.apache.struts.action.Action {

     NegocioPerfil np=new NegocioPerfil();
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
         HttpSession sesion = request.getSession();
         LinkedList<Perfil> lista = np.getMiListaPerfil( ""+sesion.getAttribute("c"));
         
         lista.getFirst().getImagenDePortada();
         
         request.setAttribute("listaPerfil", lista );
        return mapping.getInputForward();
    }
}
