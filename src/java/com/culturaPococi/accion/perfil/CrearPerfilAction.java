/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.perfil;

import com.culturaPococi.dominio.Categoria;
import com.culturaPococi.dominio.Distrito;
import com.culturaPococi.dominio.Perfil;
import com.culturaPococi.negocio.NegocioCategoria;
import com.culturaPococi.negocio.NegocioDistrito;
import com.culturaPococi.negocio.NegocioPerfil;
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
public class CrearPerfilAction extends DispatchAction {
    
    
    private NegocioCategoria nCategoria=new NegocioCategoria();
     private NegocioDistrito nDistrito = new NegocioDistrito();
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        LinkedList<Categoria> listaCategorias;
        LinkedList<Distrito> listaDistritos;
        
        listaCategorias = nCategoria.selectCategorias();
        listaDistritos = nDistrito.selectDistrito();
           
        
        if(listaCategorias==null){
            JOptionPane.showMessageDialog(null, "error al cargar los datos");
        }
        
        request.setAttribute("listaCategorias", listaCategorias);
        request.setAttribute("listaDistritos", listaDistritos);

        return mapping.getInputForward();
    }
}
