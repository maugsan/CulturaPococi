/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.usuarioNormal;

import com.culturaPococi.data.DataUsuarioNormal;
import com.culturaPococi.dominio.UsuarioNormal;
import java.util.LinkedList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author Mac
 */
public class MostrarUsuarioNormalAction extends DispatchAction{

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    private DataUsuarioNormal dUsuario = new DataUsuarioNormal();
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        LinkedList<UsuarioNormal> listaUsuarios = dUsuario.selectUsuarios();
        
        request.setAttribute("listaUsuarios", listaUsuarios);
        
        return mapping.getInputForward();
    }
}
