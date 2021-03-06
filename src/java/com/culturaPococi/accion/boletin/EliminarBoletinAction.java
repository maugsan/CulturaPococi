/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.boletin;

import com.culturaPococi.dominio.Articulo;
import com.culturaPococi.dominio.Boletin;
import com.culturaPococi.negocio.NegocioArticulo;
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
public class EliminarBoletinAction extends DispatchAction {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    NegocioBoletin nBoletin = new NegocioBoletin();

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
        LinkedList<Boletin> listaBoletines;
        boolean accionRealizada;
        String fecha=request.getParameter("fecha");
        
        accionRealizada=nBoletin.bdEliminarBolentin(fecha);
        
        listaBoletines=nBoletin.bdListarBoletines();
        
        if(listaBoletines==null||accionRealizada==false){
            JOptionPane.showMessageDialog(null, "problemas al cargar la página en eliminarBoletinAccion o duplicacion de la fecha");
        }
        
        request.setAttribute("listaBoletines", listaBoletines);
        return mapping.getInputForward();
    }
}









