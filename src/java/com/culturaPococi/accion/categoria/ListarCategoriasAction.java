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
import javax.swing.JOptionPane;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Personal
 */
public class ListarCategoriasAction extends org.apache.struts.action.Action {

 
    NegocioCategoria nCategoria=new NegocioCategoria();

 
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        LinkedList<Categoria> listaCategorias;
        
        listaCategorias=nCategoria.selectCategorias();

        request.setAttribute("listaCategorias", listaCategorias);
        
        return mapping.getInputForward();
    }
}
