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
 * @author Personal
 */
public class ActualizarEventoAction extends DispatchAction {

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
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        boolean accionRealizadaEvento;
        LinkedList<Categoria> listaCategorias;
        EventoForm formu = (EventoForm) form;
//        Evento evento = new Evento(formu.getIdEvento(),
//                formu.getIdCategoria(),
//                "",
//                formu.getLugar(),
//                formu.getNombre(), "", "",
//                //formu.getFecha(),
//                //formu.getHora(),
//                formu.getInformacion(),
//                "ybarboza27@gmail.com", "");
        
        Evento evento=new Evento(formu.getIdEvento(),
                                formu.getIdCategoria(), 
                                "", 
                                formu.getLugar(), 
                                formu.getNombre(),
                                formu.getFecha(),"",
                                //formu.getHora(),
                                formu.getInformacion(), 
                                "ybarboza27@gmail.com","");
        
        
        accionRealizadaEvento=nEvento.actualizarEventosDB(evento);
        JOptionPane.showMessageDialog(null, "por "+formu.getIdCategoria());
        
        if(!accionRealizadaEvento){
            //hay que mostrar un mensaje de que no se pudo actualizar el evento
            JOptionPane.showMessageDialog(null, "El evento no se pudo cargar");
        }
//        
//        listaCategorias = nCategoria.selectCategoriasDB();
//        if(listaCategorias==null){
//            //hay que mostrar un mensaje de que no se pudo actualizar el evento
//            JOptionPane.showMessageDialog(null, "La lista de categorias no se pudo cargar");
//        }
        
        //request.setAttribute("listaCategorias", listaCategorias);
        //request.setAttribute("evento", evento);
        
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













//<section id="lista-elementos">
//
//                        <logic:iterate  name="listaPublicacion" id="publicacionTemporal" >
//
//                            <%-- Inicio Elemento  --%>
//                            <div id="elemento">
//
//                                <%-- href="action.do?metodo(mostrar)= ${perfilTemporal.idPerfil}" --%>
//                                <a href=""> <div id="link-detalle-elemento"><div id="elemento-imagen"><img src="../assets/img/perfil-icon.png" width="30"/></div>
//
//                                        <p id="elemento-nombre"> ${publicacionTemporal.nombrePerfil}</p> 
//                                        <br>
//                                        <p id="elemento-categoria">${publicacionTemporal.nombreCategoria}</p>
//                                        <br>
//                                        <p id="elemento-categoria">${publicacionTemporal.musica}</p>
//                                        <br>
//                                        <p id="elemento-categoria">${publicacionTemporal.video}</p>
//                                        <br>
//                                        <p id="elemento-categoria">${publicacionTemporal.imagen}</p>
//
//                                    </div></a>
//                                    <%-- <a href="../eliminar_perfil.do?nombrePerfil=${publicacionTemporal.idPublicacion}"><div id="elemento-icon"><img src="../assets/img/delete-icon.png" width="30"/></div></a> --%>  
//
//                            </div>
//                            <%-- FIN Elemento   ${perfilTemporal.nombrePerfil} --%> 
//
//                        </logic:iterate>
//
//                    </section>