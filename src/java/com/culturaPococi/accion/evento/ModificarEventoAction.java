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

    NegocioEvento nEvento=new NegocioEvento();
    NegocioCategoria nCategoria=new NegocioCategoria();
    

    
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        Evento evento;
        int idEvento;
        LinkedList<Categoria> listaCategorias=new LinkedList<Categoria>();
        
        idEvento=Integer.parseInt(request.getParameter("idEvento"));
        
        evento=nEvento.selectEventoDB(idEvento);
        if (evento!=null){
            listaCategorias=nCategoria.selectCategoriasOrdenadasDB(evento.getIdCategoria());   
        }else{
        //mostrar un mensaje si las categorias no se puden cargar
            JOptionPane.showMessageDialog(null, "El evento no se pudo cargar");
        }
        if (listaCategorias==null){
            JOptionPane.showMessageDialog(null, "Las categorias no se pudieron cargar");  
        }
        //Si evento en null es porque la consulta no se hizo bien por lo que hay que mostrar un mensaje
         request.setAttribute("listaCategorias", listaCategorias);
         request.setAttribute("evento", evento);
        return mapping.getInputForward();
    }
    
    
}
