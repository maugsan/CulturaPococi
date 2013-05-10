/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.evento;

import com.culturaPococi.dominio.Evento;
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
public class SeleccionarEventoAction extends DispatchAction {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

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
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        int idEvento;
        idEvento=Integer.parseInt(request.getParameter("idEvento"));
        Evento evento;
        JOptionPane.showMessageDialog(null, "idEvento: "+idEvento);
        //evento=nEvento.selectEventoDB(idEvento);
        evento=new Evento(6,1,
                    "Musica",
                    "Pangola","Baile",  
                    "fecha","hora", 
                    "Concierto", 
                    "ybarboza27","");
        request.setAttribute("evento", evento);
        return mapping.getInputForward();
    }
}
