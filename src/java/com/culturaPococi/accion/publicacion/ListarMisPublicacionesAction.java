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
public class ListarMisPublicacionesAction extends DispatchAction {

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
        
        String jsp;
        LinkedList<Publicacion> listaPublicacion;
        String tipo=""+request.getParameter("tipo");
        String nomPerfil=""+request.getParameter("nomPerfil");
      
        
        if(tipo.equalsIgnoreCase("musica")){
            jsp="miMusica";
        }else if (tipo.equalsIgnoreCase("texto")){
            jsp="miTexto";
        }else if (tipo.equalsIgnoreCase("video")){
            jsp="miVideo";
        }else{
            jsp="miImagen";
        }
        
        listaPublicacion=nPublicacion.getListaPublicacionesPorPerfil(nomPerfil, tipo);
        if(listaPublicacion==null){
            JOptionPane.showMessageDialog(null, "error base de datos");
        }
        
        request.setAttribute("listaPublicaciones", listaPublicacion);
        return mapping.findForward(jsp);
    }
}
