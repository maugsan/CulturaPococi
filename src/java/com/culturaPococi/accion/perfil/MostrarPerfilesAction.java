/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.perfil;

import com.culturaPococi.dominio.Perfil;
import java.util.LinkedList;
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
public class MostrarPerfilesAction extends DispatchAction{

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
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        
        LinkedList<Perfil> listaPerfil = new LinkedList<Perfil>();

        listaPerfil.add(new Perfil("PERFIL 1", "musica", "HOY", "GUAPILES", "BIOGRAFIA", "IMAGEN", "CORREO PERFIL"));
        listaPerfil.add(new Perfil("PERFIL 2","musica", "HOY", "GUAPILES", "BIOGRAFIA", "IMAGEN", "CORREO PERFIL"));
        listaPerfil.add(new Perfil("PERFIL 3","musica", "HOY", "GUAPILES", "BIOGRAFIA", "IMAGEN", "CORREO PERFIL"));
        listaPerfil.add(new Perfil("PERFIL 4","musica", "HOY", "GUAPILES", "BIOGRAFIA", "IMAGEN", "CORREO PERFIL"));
        listaPerfil.add(new Perfil("PERFIL 5", "musica", "HOY", "GUAPILES", "BIOGRAFIA", "IMAGEN", "CORREO PERFIL"));
        listaPerfil.add(new Perfil("PERFIL 6","musica", "HOY", "GUAPILES", "BIOGRAFIA", "IMAGEN", "CORREO PERFIL"));

        request.setAttribute("listaPerfil", listaPerfil);
        return mapping.getInputForward();
 
    }
}
