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
public class CrearCategoriasAction extends org.apache.struts.action.Action {

    private static final String EXITOSO = "exitoso";
    private static final String DENEGADO = "denegado";
    NegocioCategoria nCategoria = new NegocioCategoria();
    LinkedList<Categoria> listaCategorias;

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {


        listaCategorias = nCategoria.selectCategorias();


        for (Categoria c : listaCategorias) {

            if (c.getNombreCategoria().equalsIgnoreCase(request.getParameter("nombreCategoria"))) {

                return mapping.findForward(DENEGADO);

            }
        }

        nCategoria.crearCategoriaDB(request.getParameter("nombreCategoria"),
                request.getParameter("super"));


                
        return mapping.findForward(EXITOSO);
    }
}
