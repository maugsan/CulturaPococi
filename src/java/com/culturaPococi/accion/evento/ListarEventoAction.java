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
import javax.servlet.http.HttpSession;
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

    NegocioEvento nEvento=new NegocioEvento();
    

    
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        LinkedList <Evento> listaEventos;
       
        
         HttpSession sesion = request.getSession();
         String correo =(String)sesion.getAttribute("c");
         String correoTipo =(String)sesion.getAttribute("tipo");
         if(correoTipo.equals("0")) {
         listaEventos=nEvento.listarEventosDB(correo);
         } else {
         listaEventos=nEvento.listarEventosDB();
         }
         
          
        //si la lista es null se debe de mostrar un mensaje porque ocurre un error
        if(listaEventos==null){
            JOptionPane.showMessageDialog(null, "La base de datos se cayó");
        }
             
             
             
        request.setAttribute("listaEventos", listaEventos);
        return mapping.getInputForward();
    }
}
