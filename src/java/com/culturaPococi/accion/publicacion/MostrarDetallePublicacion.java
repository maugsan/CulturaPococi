/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.publicacion;

import com.culturaPococi.dominio.Publicacion;
import com.culturaPococi.negocio.NegocioPublicacion;
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
public class MostrarDetallePublicacion extends DispatchAction {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    NegocioPublicacion nPublicidad=new NegocioPublicacion();

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
        
        String mostrarJSP="";
        
        String tipoPublicacion=request.getParameter("tipoPublicacion");
        
        Publicacion publicacion;
        JOptionPane.showMessageDialog(null, "inicio mostrar detalle");
        int idPublicacion=Integer.parseInt(request.getParameter("idPublicacion"));
        JOptionPane.showMessageDialog(null, "idpublicacion: "+idPublicacion);
        
        publicacion=nPublicidad.getPublicacion(idPublicacion);
        
        request.setAttribute("publicacion", publicacion);
        JOptionPane.showMessageDialog(null, "publicacion1: "+tipoPublicacion);
        
        if (tipoPublicacion.equals("musica")){
            mostrarJSP="musica";
        }else if (tipoPublicacion.equals("texto")){
             mostrarJSP="texto";
        }else if (tipoPublicacion.equals("imagen")){
            mostrarJSP="imagen";
        }else{
            mostrarJSP="video";
        }
        JOptionPane.showMessageDialog(null, "FIIIIIIINNNNNNNNN "+mostrarJSP);
        return mapping.findForward(mostrarJSP);
    }
}
