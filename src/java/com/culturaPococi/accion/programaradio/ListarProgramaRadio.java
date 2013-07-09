/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.programaradio;

import com.culturaPococi.negocio.NegocioProgramaRadio;
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
public class ListarProgramaRadio extends DispatchAction {

    
   NegocioProgramaRadio npr = new NegocioProgramaRadio();

    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        JOptionPane.showMessageDialog(null, npr.listaProgramasRadio().getFirst());
       

        
        request.setAttribute("listaProgramas", npr.listaProgramasRadio());

        return mapping.getInputForward();

    }
}
