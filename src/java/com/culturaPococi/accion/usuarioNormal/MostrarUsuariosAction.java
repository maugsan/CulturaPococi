/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.usuarioNormal;

import com.culturaPococi.dominio.UsuarioNormal;
import java.util.LinkedList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.actions.DispatchAction;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

/**
 *
 * @author Mac
 */
public class MostrarUsuariosAction extends DispatchAction {

    /* forward name="success" path="" */
    private final static String SUCCESS = "success";

  
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
          LinkedList<UsuarioNormal> listaPerfil = new LinkedList<UsuarioNormal>();
        
        
        return mapping.getInputForward();
    }


}