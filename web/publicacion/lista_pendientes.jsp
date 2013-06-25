<%-- 
    Document   : lista_pendientes
    Created on : 18/05/2013, 12:07:28 PM
    Author     : Personal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>


<html:html lang="true">
      <head>
        <%@include file="/includes/head.jsp" %>
        <title><bean:message key="welcome.title"/></title>
      
        <html:base/>
    </head>
    <body>

        <%@include file="/includes/header.jsp" %>
        <div id="contendor">
        
            <section  id="seccion-principal">

                
                <div id="contendor-interno"> 

                    <h1><bean:message key="publicacion.publicaciones.pendientes"/>:${tipoPublicacion}</h1>



                   
                            <logic:iterate  name="listaPublicacionesPendientes" id="publicacionTemporal" >
                        <%-- Inicio Elemento  --%>
                         <div id="elemento-listaPublicacion">
                            <div id="elemento-imagen"><img src="../assets/img/evento-icon.png" width="30"/></div>
                            <p id="elemento-nombre">${publicacionTemporal.getNombrePerfil()}</p><br>
                            <p id="elemento-nombre">${publicacionTemporal.getFechaPublicacion()}</p>
                            
                            <a href="../eliminar_publicacion_pendiente.do?idPublicacion=${publicacionTemporal.idPublicacion}&tipoPublicacion=${tipoPublicacion}">
                                <div id="elemento-icon"><img src="../assets/img/delete-icon.png" width="30"/></div>
                            </a>
                            <a href="../mostrar_detalle_publicacion.do?idPublicacion=${publicacionTemporal.idPublicacion}&tipoPublicacion=${tipoPublicacion}">
                                <div id="elemento-icon"><img src="../assets/img/boletin-icon.png" width="30"/></div>
                            </a>
                              </div>
                            
                        
                        <%-- FIN Elemento  --%>
                        </logic:iterate>
                    



                </div> 

            </section>

            <%@include file="/includes/espacios.jsp" %>
            <section id="seccion-inferior">

                <div id="contendor-interno"> </div>

            </section>
            <%@include file="/includes/footer.jsp" %>

        </div>

    </body>
</html:html>
    
