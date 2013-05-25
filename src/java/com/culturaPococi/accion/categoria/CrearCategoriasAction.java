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

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    NegocioCategoria nCategoria=new NegocioCategoria();

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
        boolean accionRealizada;
        LinkedList<Categoria> listaCategorias;
        
        FormularioCategoria formu=(FormularioCategoria) form;
        
        accionRealizada=nCategoria.crearCategoriaDB(formu.getNombreCategoria());
        
        if(!accionRealizada){
            JOptionPane.showMessageDialog(null, "poblemas con la base de datos");
        }
        
        
        
        listaCategorias=nCategoria.selectCategoriasDB();
        
        if(listaCategorias==null){
            JOptionPane.showMessageDialog(null, "poblemas con la base de datos");
        }
        JOptionPane.showMessageDialog(null, "proble");
        request.setAttribute("listaCategorias", listaCategorias);
        
        return mapping.getInputForward();
    }
}
