/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.categoria;

import com.culturaPococi.dominio.Categoria;
import com.culturaPococi.negocio.NegocioCategoria;
import java.util.LinkedList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author Pedro
 */
public class VerArteAction extends DispatchAction {

    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        NegocioCategoria nCategoria = new NegocioCategoria();
        LinkedList<Categoria> listaCategorias;
        
        listaCategorias=nCategoria.selectCategoriasXsuper(0);

        request.setAttribute("listaCategorias", listaCategorias);
        
        return mapping.getInputForward();
    }
}
