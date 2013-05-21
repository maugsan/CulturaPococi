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
import javax.swing.JOptionPane;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author Personal
 */
public class EliminarPublicacionPendienteAction extends DispatchAction {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    NegocioPublicacion nPublicacion=new NegocioPublicacion();

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
        
        
        int idPublicacion=Integer.parseInt(request.getParameter("idPublicacion"));
        String tipoPublicacion=request.getParameter("tipoPublicacion");
        nPublicacion.eliminarPublicacion(idPublicacion);
        
        
        
        LinkedList<Publicacion> listaPublicacionesPendientes;
         
        listaPublicacionesPendientes=nPublicacion.getListaPublicacionPendiente(tipoPublicacion);
        if(listaPublicacionesPendientes==null){
            JOptionPane.showMessageDialog(null, "problemas al cargar la lista");
        }
        
        JOptionPane.showMessageDialog(null, "salida de eliminar NUEVA");
        JOptionPane.showMessageDialog(null, listaPublicacionesPendientes.size()+"NUEVO");
        request.setAttribute("listaPublicacionesPendientes", listaPublicacionesPendientes);
        request.setAttribute("tipoPublicacion", tipoPublicacion);
        
        return mapping.getInputForward();
    }
}
