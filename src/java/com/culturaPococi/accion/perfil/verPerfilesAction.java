/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.perfil;

import com.culturaPococi.dominio.Categoria;
import com.culturaPococi.dominio.Perfil;
import com.culturaPococi.negocio.NegocioCategoria;
import com.culturaPococi.dominio.URL;
import com.culturaPococi.negocio.NegocioPerfil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class verPerfilesAction extends org.apache.struts.action.Action {


   
    NegocioPerfil np=new NegocioPerfil();
    NegocioCategoria nCategoria=new NegocioCategoria();

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
         
        String categoria = ""+request.getParameter("c");
     
       
        
        LinkedList<Perfil> listaPerfiles;
        if(np.getListaPerfilPorCategoria(categoria)!=null)
        {
         listaPerfiles=np.getListaPerfilPorCategoria(categoria);
       
        if(listaPerfiles==null){
          
            
            LinkedList<Categoria> listaCategorias ;

            listaCategorias = nCategoria.selectCategorias();
            if (listaCategorias == null) {
                JOptionPane.showMessageDialog(null, "error al cargar los datos");
            }
            request.setAttribute("listaCategorias", listaCategorias);
        }
        
        request.setAttribute( "listaPerfil",listaPerfiles );
         return mapping.getInputForward();
        } else {
              
            response.sendRedirect(request.getContextPath());
            return mapping.findForward(categoria);
        }
        
        
      
       
    }
}
