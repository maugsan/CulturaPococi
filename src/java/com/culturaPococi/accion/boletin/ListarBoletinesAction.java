/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.boletin;

import com.culturaPococi.dominio.Boletin;
import com.culturaPococi.negocio.NegocioBoletin;
import java.util.LinkedList;
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
public class ListarBoletinesAction extends DispatchAction {

    NegocioBoletin nBoletin = new NegocioBoletin();

 
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        LinkedList<Boletin> listaBoletines;
        
        listaBoletines=nBoletin.bdListarBoletines();
        
        if(listaBoletines==null){
            JOptionPane.showMessageDialog(null, "problemas al cargar la página");
        }
        
        request.setAttribute("listaBoletines", listaBoletines);
        
        return mapping.getInputForward();
    }
}
