/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.perfil;

import com.culturaPococi.dominio.Perfil;
import com.culturaPococi.negocio.NegocioPerfil;
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
public class CrearPerfilAction extends DispatchAction {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    NegocioPerfil nPerfil=new NegocioPerfil();

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
        
        String distrito=request.getParameter("distrito");
        String nombre=request.getParameter("nombre");
        int idCategoria=Integer.parseInt(request.getParameter("idCategoria"));
        String biografia=request.getParameter("biografia");
        
        
        nPerfil.crearPerfil(new Perfil(nombre, "", "fechadecreacion", biografia, "imagen de portada", /*correo*/"correo1", distrito, idCategoria));
        
        return mapping.getInputForward();
    }
}
