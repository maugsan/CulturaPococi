/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.articulo;

import com.culturaPococi.dominio.Anuncio;
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
public class CrearArticuloAction extends DispatchAction {

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
        
       
        Articulo articulo;
        boolean accionRealizada;
        LinkedList<Articulo> listaArticulos;
        LinkedList<Categoria>listaCategoria;
        
        
        String datos = request.getParameter("datos");
        String datosSeparados[] = datos.split("-");
        articulo=new Articulo(0, datosSeparados[1], Integer.parseInt(datosSeparados[4]), datosSeparados[2], datosSeparados[3], datosSeparados[5], datosSeparados[6]);
        
        accionRealizada=nArticulo.bdCrearArticulo(articulo);
        
        
        listaArticulos=nArticulo.bdListarArticulos(datosSeparados[6]);
        listaCategoria=nCategoria.selectCategoriasOrdenadasDB(articulo.getIdArticulo());
        
        if(listaArticulos==null||!accionRealizada||listaCategoria==null){
            JOptionPane.showMessageDialog(null, "error en la base de datos CrearArticuloAction");
        }//fin if
        
        request.setAttribute("listaArticulos", listaArticulos);
        return mapping.getInputForward();
    }
}
