/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.perfil;

import com.culturaPococi.dominio.Perfil;
import com.culturaPococi.negocio.NegocioPerfil;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author Personal
 */
public class ConfirmarNombrePerfilAction extends DispatchAction {

    private NegocioPerfil nPerfil=new NegocioPerfil();
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String nombrePerfil=request.getParameter("nombrePerfil");
  
        ;
        
        for (Perfil p : nPerfil.getListaPerfil() ) {
        
           if (nombrePerfil.equalsIgnoreCase(p.getNombrePerfil())) {
               
                JOptionPane.showMessageDialog(null, "Ya Existe");
           
           }
        }
        JOptionPane.showMessageDialog(null, "NO Existe");
        return mapping.getInputForward();
    }
}
