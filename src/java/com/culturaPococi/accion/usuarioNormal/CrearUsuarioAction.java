/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.usuarioNormal;


import com.culturaPococi.dominio.hibernate.UsuarioNormal;
import com.culturaPococi.hibernate.helper.HelperUsuario;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author Personal
 */
public class CrearUsuarioAction extends DispatchAction {

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
        HelperUsuario hu = new HelperUsuario();
        String correo = request.getParameter("correo");
        String contrasenia = request.getParameter("contrasenia");
        String colaborador = request.getParameter("colaborador");
        String contraseniaComprobacion=request.getParameter("contraseniaComprobacion");
        if (colaborador == null) {
            colaborador = "n";
        }

    UsuarioNormal nu = new UsuarioNormal(correo, "", contrasenia, contraseniaComprobacion , colaborador, "");    
    hu.getInsertUsuario(nu);

    return mapping.getInputForward();

    }
}
