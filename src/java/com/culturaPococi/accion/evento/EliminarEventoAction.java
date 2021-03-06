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
 * @author Moa
 */
public class EliminarEventoAction extends DispatchAction {

  
    private static final String SUCCESS = "success";
    private NegocioEvento nEvento=new NegocioEvento();

    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        int idEvento;
        boolean eliminado;
        LinkedList <Evento> listaEventos;
        idEvento=Integer.parseInt(request.getParameter("idEvento"));
        
        eliminado=nEvento.eliminarEventosDB(idEvento);
        //if eliminado es false es que no se pudo eliminar y se debe mostrar un mensaje
        if(!eliminado){
            JOptionPane.showMessageDialog(null, "La base de datos se cayó");
        }
        listaEventos=nEvento.listarEventosDB();
        
        request.setAttribute("listaEventos", listaEventos);

        return mapping.getInputForward();
    }
}
