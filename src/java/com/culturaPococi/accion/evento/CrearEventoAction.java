/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.culturaPococi.accion.evento;

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
        String nombrejsp="";
        EventoForm formu=(EventoForm) form;
        Evento evento=new Evento(0, 
                                formu.getIdCategoria(), 
                                "", 
                                formu.getLugar(), 
                                formu.getNombre(),
                                formu.getFecha(),"",
                                //formu.getHora(),
                                formu.getInformacion(), 
                                "ybarboza27@gmail.com","");
                  JOptionPane.showMessageDialog(null, "fecha "+formu.getIdCategoria());   
        accionRealizada=nEvento.crearEventosDB(evento);
        if(!accionRealizada){
            // si la accion es false es que no se pudo crear el nuevo evento por loq ue hay que mostrar un mensaje
            JOptionPane.showMessageDialog(null, "El evento no se pudo crear por fallo en la base CREAR_EVENTO_ACTION");
        }//fin if
        formu.setInformacion("");
        formu.setLugar("");
        formu.setNombre("");
        
        LinkedList <Evento> listaEventos;
        listaEventos=nEvento.listarEventosDB();
        //si la lista es null se debe de mostrar un mensaje porque ocurre un error
        if(listaEventos==null){
            JOptionPane.showMessageDialog(null, "La lista de eventos no se pudo caragr por error en la base");
        }
        request.setAttribute("listaEventos", listaEventos);
        request.setAttribute("listaCategorias", nCategoria.selectCategoriasDB());
        
        return mapping.getInputForward();
    }
}











//
//<%-- 
//    Document   : crear_evento
//    Created on : 18/04/2013, 10:08:58 PM
//    Author     : Mac
//--%>
//
//<%@page contentType="text/html" pageEncoding="UTF-8"%>
//<!DOCTYPE html>
//<html>
//    <head>
//        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
//        <title><bean:message key="welcome.title"/></title>
//        <link rel="stylesheet" href="./assets/css/estilos.css" type="text/css" />
//        <link rel="stylesheet" href="./assets/css/normalize.css" type="text/css" />
//        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed' rel='stylesheet' type='text/css'>
//        <html:base/>
//    </head>
//    <body>
//        <%@include file="/includes/header.jsp" %>
//
//    <section  id="seccion-principal">
//
//        <div id="contendor-interno"> 
//
//            <html:form action="/crear_evento"  >
//                
//                <h1><bean:message key="form.evento.crear"/></h1>
//                
//                <h2><bean:message key="form.nombre"/></h2>
//                <html:text  name="EventoForm" property="nombre" size="16" value=""/><br>
//                <html:errors property="enombre"/> 
//                
//                <h2><bean:message key="form.fecha"/></h2>
//                <%--<input type="text" name="fecha" id="datepicker" readonly="readonly" size="12" />
//                <html:text  name="EventoForm" property="fecha" id="datepicker"/>--%>
//
//                
//                <h2><bean:message key="form.categoria"/></h2>
//                <html:select property="idCategoria" >
//                    <logic:iterate name="listaCategorias" id="numero" >
//                        <html:option value="${numero.idCategoria}"> <!-- esto es para que cuando elija el nombre me envie el numero !-->
//                            <bean:write name="numero" property="nombreCategoria"/>
//                        </html:option>
//                    </logic:iterate>
//                </html:select>
//                
//                <h2><bean:message key="form.lugar"/></h2>
//                <html:text  name="EventoForm" property="lugar" size="16" value=""/><br>
//                <html:errors property="elugar"/> 
//                
//                <h2><bean:message key="form.informacion"/></h2>
//                <html:textarea name="EventoForm" property="informacion" cols="44" rows="5" /><br>
//                <html:errors property="einformacion"/> 
//                
//                <html:submit value="Crear" /><br>
//               
//                
//                   
//            </html:form>
//                 
//                <a href="./listar_evento.do">
//                    <button id="boton-volver">
//                        <bean:message key="boton.volver"/>
//                    </button>
//                </a>
//        </div> 
//
//    </section>
//
//
//    <%@include file="/includes/footer.jsp" %>
//    </body>
//</html>
