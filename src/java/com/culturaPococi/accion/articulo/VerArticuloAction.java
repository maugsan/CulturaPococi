/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.articulo;

import com.culturaPococi.dominio.Articulo;
import com.culturaPococi.dominio.Categoria;
import com.culturaPococi.negocio.NegocioArticulo;
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
public class VerArticuloAction extends DispatchAction {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    NegocioArticulo nArticulo=new NegocioArticulo();
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
        Articulo articulo;
        LinkedList<Categoria>listaCategoria;
        int idArticulo=Integer.parseInt(request.getParameter("idArticulo"));
        
        articulo=nArticulo.bdArticulo(idArticulo,"");
        listaCategoria=nCategoria.selectCategoriasOrdenadasDB(articulo.getCategoria());
        
        if(articulo==null||listaCategoria==null){
            JOptionPane.showMessageDialog(null, "Error en la base de datos verArticuloAction");
        }//fin if
        
        request.setAttribute("articulo", articulo);
        request.setAttribute("listaCategorias", listaCategoria);
        
        return mapping.getInputForward();
    }
}