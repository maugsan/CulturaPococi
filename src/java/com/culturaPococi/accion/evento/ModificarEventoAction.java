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
public class ModificarEventoAction extends DispatchAction {

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
        Evento evento=new Evento();
        int idEvento;
        LinkedList<Categoria> listaCategorias=new LinkedList<Categoria>();
        
        JOptionPane.showMessageDialog(null, "evento modificar ");
        idEvento=Integer.parseInt(request.getParameter("idEvento"));
        evento=nEvento.selectEventoDB(idEvento);
        
        listaCategorias=nCategoria.selectCategoriasDB();
        
        request.setAttribute("listaCategorias", listaCategorias);
        request.setAttribute("evento", evento);
        return mapping.getInputForward();
    }
    
    
    
    
//        public ActionForward execute(ActionMapping mapping, ActionForm form,
//            HttpServletRequest request, HttpServletResponse response)
//            throws Exception {
//        EventoForm formu=(EventoForm) form;
//        //JOptionPane.showMessageDialog(null, "evento modificar "+formu.getIdEvento());
////        Evento evento=new Evento(formu.getIdEvento(), 
////                                formu.getIdCategoria(), 
////                                formu.getNombreCategoria(), 
////                                formu.getLugar(), 
////                                formu.getNombre(), "fecha","hora",
////                                //formu.getFecha(),
////                                //formu.getHora(),
////                                formu.getInformacion(), 
////                                formu.getCorreo(),"imagen");
//        Evento evento=new Evento(0, 
//                                0, 
//                                "nombreCategoria", 
//                                formu.getLugar(), 
//                                formu.getNombre(), "fecha","hora",
//                                //formu.getFecha(),
//                                //formu.getHora(),
//                                formu.getInformacion(), 
//                                "correo","imagen");
//                                
//                                //formu.getImagen()
//        //nEvento.actualizarEventosDB(evento);
//        return mapping.getInputForward();
//    }
    
    
}
