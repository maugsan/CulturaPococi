/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.publicacion;

import com.culturaPococi.negocio.NegocioPublicacion;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author jonathan
 */
public class MostrarPublicacionAction extends DispatchAction {
   
    NegocioPublicacion np=new NegocioPublicacion();

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

   
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        request.setAttribute("listaPublicacion", np.getListaPublicacion());
        
        return mapping.getInputForward();
    }
}
