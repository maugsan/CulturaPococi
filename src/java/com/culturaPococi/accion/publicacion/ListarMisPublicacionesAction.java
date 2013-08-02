/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.publicacion;

import com.culturaPococi.dominio.Publicacion;
import com.culturaPococi.negocio.NegocioPublicacion;
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
public class ListarMisPublicacionesAction extends DispatchAction {

  
    NegocioPublicacion nPublicacion = new NegocioPublicacion() ;

  
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
       
        LinkedList<Publicacion> listaPublicacion;
        String tipo=""+request.getParameter("tipo");
        String nomPerfil=""+request.getParameter("nomPerfil");
      
        
         HttpSession sesion = request.getSession();
         String correo =(String)sesion.getAttribute("c");
        listaPublicacion = nPublicacion.getListaPublicacionesPorUsuario(correo);
        
        if(listaPublicacion==null){
            JOptionPane.showMessageDialog(null, "error base de datos");
        }
        
        request.setAttribute("listaPublicaciones", listaPublicacion);
        return mapping.getInputForward();
    }
}
