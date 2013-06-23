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
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author Personal
 */
public class ActualizarArticuloAction extends DispatchAction {

    NegocioArticulo nArticulo=new NegocioArticulo();

    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        LinkedList<Articulo> listaArticulos;
        Articulo articulo;
        ArticuloForm formu=(ArticuloForm) form;
        articulo=new Articulo(formu.getIdArticulo(), 
                                formu.getImagen(), 
                                formu.getCategoria(),
                                formu.getTitulo(), 
                                formu.getAutor(), 
                                formu.getContenido(),
                                formu.getFecha());
        //JOptionPane.showMessageDialog(null, "id "+);
        
        nArticulo.bdActualizarArticulo(articulo);
        listaArticulos=nArticulo.bdListarArticulos(formu.getFecha());
        
       
        if(listaArticulos==null){
            JOptionPane.showMessageDialog(null, "Error en la base de datos listarArticulosAction");
        }//fin if
        
        request.setAttribute("listaArticulos", listaArticulos);
        
        
        return mapping.getInputForward();
    }
}
