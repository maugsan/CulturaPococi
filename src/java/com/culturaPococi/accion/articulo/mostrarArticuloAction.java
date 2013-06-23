/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.articulo;

import com.culturaPococi.dominio.Articulo;
import com.culturaPococi.negocio.NegocioArticulo;
import java.util.LinkedList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author MAU
 */
public class mostrarArticuloAction extends org.apache.struts.action.Action {

    
        NegocioArticulo nArticulo=new NegocioArticulo();

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
          LinkedList<Articulo> listaArticulos;
        
        String fechaBoletin=""+request.getParameter("fecha");
        int idArticulo=Integer.parseInt(request.getParameter("id"));
        
   
        
        listaArticulos=nArticulo.bdListarArticulos(fechaBoletin);
        
        for ( Articulo articulo : listaArticulos) {
            
            if ( articulo.getIdArticulo() == idArticulo) {
            
            request.setAttribute("articulo", articulo );
            
            }
        
        
        }
     
    
        
        request.setAttribute("listaArticulos", listaArticulos);
        return mapping.getInputForward();
    }
}
