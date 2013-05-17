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
        boolean accionRealizada;
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
        accionRealizada=nEvento.crearEventosDB(evento);
        if(!accionRealizada){
            // si la accion es false es que no se pudo crear el nuevo evento por loq ue hay que mostrar un mensaje
            JOptionPane.showMessageDialog(null, "El evento no se pudo crear por fallo en la base");
        }//fin if
//        LinkedList<Categoria> listaCategorias;
//        listaCategorias=nCategoria.selectCategoriasDB();
//        //mostrar un mensaje si las categorias no se puden cargar
//        if(listaCategorias==null){
//            JOptionPane.showMessageDialog(null, "La lista de categorias no se pudo cargar");
//        }
        
        formu.setInformacion("");
        formu.setLugar("");
        formu.setNombre("");
        //request.setAttribute("listaCategorias", listaCategorias);
        
        LinkedList <Evento> listaEventos;
        listaEventos=nEvento.listarEventosDB();
        //si la lista es null se debe de mostrar un mensaje porque ocurre un error
        if(listaEventos==null){
            JOptionPane.showMessageDialog(null, "La lista de eventos no se pudo caragr por error en la base");
        }
        request.setAttribute("listaEventos", listaEventos);
        return mapping.getInputForward();
        
    }
}
