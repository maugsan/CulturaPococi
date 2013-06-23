/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.perfil;

import com.culturaPococi.dominio.Categoria;
import com.culturaPococi.negocio.NegocioCategoria;
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
public class CargarCategoriasPerfilAction extends DispatchAction {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private NegocioCategoria nCategoria=new NegocioCategoria();

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
        
        
        LinkedList<Categoria>listaCategorias=new LinkedList<Categoria>();
        
        listaCategorias=nCategoria.selectCategoriasDB();
        if(listaCategorias==null){
            JOptionPane.showMessageDialog(null, "error al cargar los datos");
        }
        request.setAttribute("listaCategorias", listaCategorias);
        
        return mapping.getInputForward();
    }
}
