/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.anuncio;

import com.culturaPococi.dominio.Anuncio;
import com.culturaPococi.negocio.NegocioAnuncio;
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
 * @author Moa
 */
public class CrearAnuncioAction extends DispatchAction {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    NegocioAnuncio nAnuncio=new NegocioAnuncio();
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
        String titulo=(String) request.getParameter("titulo");
         int prioridad= Integer.parseInt(request.getParameter("prioridad"));
        
        
        Anuncio anuncio=new Anuncio(titulo,
                                 "../assets/img/evento-icon.png",
                                  prioridad,
                                  0);
        
      
        
        accionRealizada=nAnuncio.crearAnuncioDB(anuncio);
        
        if(accionRealizada==false){
            JOptionPane.showMessageDialog(null, "ocurrio un error al cargar la base de datos crearAnuncioAction");
        }
        
        //request.setAttribute("listaPrioridades", listaPrioridades);
        
        LinkedList<Anuncio> listaAnuncios;
        
        listaAnuncios=nAnuncio.listarAnunciosDB();
        //hay que mostrar un mensaje de error
        if(listaAnuncios==null){
            JOptionPane.showMessageDialog(null, "Error al cargar la lista de anuncios");
        }
        request.setAttribute("listaAnuncios", listaAnuncios);
        return mapping.getInputForward();
    }
}
