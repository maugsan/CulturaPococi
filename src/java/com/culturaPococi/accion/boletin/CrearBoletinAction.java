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
public class CrearBoletinAction extends DispatchAction {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    NegocioBoletin nBoletin=new NegocioBoletin();

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
        
        boolean accionRealicada;
        LinkedList<Boletin> listaBoletines;
                
        String fecha=request.getParameter("fecha");
        
        accionRealicada=nBoletin.bdCrearBolentin(fecha, "ybarboza27@gmail.com");
                
        listaBoletines=nBoletin.bdListarBoletines();
        
        if(!accionRealicada||listaBoletines==null){
            JOptionPane.showMessageDialog(null, "Problemas con la base de datos");
        }//fin if
        
        request.setAttribute("listaBoletines", listaBoletines);
        
        return mapping.getInputForward();
    }
}
