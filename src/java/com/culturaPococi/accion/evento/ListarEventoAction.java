/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.evento;

import com.culturaPococi.dominio.Evento;
import com.culturaPococi.negocio.NegocioEvento;
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
public class ListarEventoAction extends DispatchAction {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    NegocioEvento nEvento=new NegocioEvento();

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
        LinkedList <Evento> listaEventos;
        listaEventos=nEvento.listarEventosDB();
        //si la lista es null se debe de mostrar un mensaje porque ocurre un error
        if(listaEventos==null){
            JOptionPane.showMessageDialog(null, "La lista de eventos no se pudo caragr por error en la base");
        }
        request.setAttribute("listaEventos", listaEventos);
        return mapping.getInputForward();
    }
}


//<a href="./evento/"><section class="modulo">
//<a href="./listar_evento.do?metodo=listarEventos"><section class="modulo">
//input="/evento/index.jsp"