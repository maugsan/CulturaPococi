/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.perfil;

import com.culturaPococi.dominio.Categoria;
import com.culturaPococi.dominio.Perfil;
import com.culturaPococi.negocio.NegocioCategoria;
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
public class ListarMisPerfilesAction extends DispatchAction{

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    NegocioPerfil np=new NegocioPerfil();
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
        
        String correo=""+request.getParameter("correo");
        
        String jsp="mostrarPerfiles";
     
        
        LinkedList<Perfil> listaPerfiles=new LinkedList<Perfil>();
        
        listaPerfiles=np.getListaMisPerfiles(correo);
        
        if(listaPerfiles==null){
            JOptionPane.showMessageDialog(null, "mostrar mensaje de que no tiene perfiles y redireccionar a crear perfil");
            jsp="crearPerfil";
            
            LinkedList<Categoria> listaCategorias = new LinkedList<Categoria>();

            listaCategorias = nCategoria.selectCategoriasDB();
            if (listaCategorias == null) {
                JOptionPane.showMessageDialog(null, "error al cargar los datos");
            }
            request.setAttribute("listaCategorias", listaCategorias);
        }
        
        
        request.setAttribute("listaPerfil",listaPerfiles );
        
        
        return mapping.findForward(jsp);
    }
}
