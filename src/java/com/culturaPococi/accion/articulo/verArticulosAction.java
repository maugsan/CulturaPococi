
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
public class verArticulosAction extends org.apache.struts.action.Action {
    
        NegocioArticulo nArticulo=new NegocioArticulo();

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
       LinkedList<Articulo> listaArticulos;
        String fechaBoletin=request.getParameter("fecha");
        listaArticulos=nArticulo.bdListarArticulos(fechaBoletin);
        
        if(listaArticulos==null){
            JOptionPane.showMessageDialog(null, "Error en la base de datos listarArticulosAction");
        }//fin if
        
        request.setAttribute("listaArticulos", listaArticulos);
        request.setAttribute("fecha", fechaBoletin);
        
        return mapping.getInputForward();
    }
}
