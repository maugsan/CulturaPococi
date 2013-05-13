/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.evento;

import com.culturaPococi.dominio.Categoria;
import com.culturaPococi.dominio.Evento;
import com.culturaPococi.negocio.NegocioCategoria;
import com.culturaPococi.negocio.NegocioEvento;
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
public class CrearEventoAction extends DispatchAction {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    NegocioEvento nEvento=new NegocioEvento();
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
    
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        EventoForm formu=(EventoForm) form;
        Evento evento=new Evento(0, 
                                formu.getIdCategoria(), 
                                "", 
                                formu.getLugar(), 
                                formu.getNombre(), "","",
                                //formu.getFecha(),
                                //formu.getHora(),
                                formu.getInformacion(), 
                                "","");
                                
                                //formu.getImagen()
        nEvento.crearEventosDB(evento);
        LinkedList<Categoria> listaCategorias=new LinkedList<Categoria>();
        listaCategorias=nCategoria.selectCategoriasDB();
        
        request.setAttribute("listaCategorias", listaCategorias);
        return mapping.getInputForward();
        
        
//         Evento evento=new Evento(formu.getIdEvento(), 
////                                formu.getIdCategoria(), 
////                                formu.getNombreCategoria(), 
////                                formu.getLugar(), 
////                                formu.getNombre(), "","",
////                                //formu.getFecha(),
////                                //formu.getHora(),
////                                formu.getInformacion(), 
////                                formu.getCorreo(),"");
//                                
//                                //formu.getImagen()
//        //nEvento.crearEventosDB(evento);
    }
}
