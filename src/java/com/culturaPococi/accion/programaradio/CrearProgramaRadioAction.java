/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.programaradio;

import com.culturaPococi.dominio.programaRadio;
import com.culturaPococi.negocio.NegocioProgramaRadio;
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
public class CrearProgramaRadioAction extends DispatchAction {

    /* forward name="success" path="" */
    private static final String SUCCESS = "";

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
        
    
        NegocioProgramaRadio npr = new NegocioProgramaRadio();
        programaRadio pr = new programaRadio("", "", "", "");

        String nombre = request.getParameter("nombre");
        String horario =  request.getParameter("horario");
        String descripcion = request.getParameter("descripcion");
        
        pr.setNombre(nombre);
        pr.setHorario(horario);
        pr.setDescripcion(descripcion);
        pr.setCorreo("caro@gmail.com");
        
   
        
        npr.nuevoProgramaRadio(pr);
        
         request.setAttribute("listaProgramas", npr.listaProgramacionRadio());

        return mapping.getInputForward();
    }
}
