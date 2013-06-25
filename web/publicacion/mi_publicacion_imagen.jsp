<%-- 
    Document   : mi_publicacion_imagen
    Created on : 13-jun-2013, 21:08:49
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

                    <h1><bean:message key="publicacion"/></h1>

                    <div id="elemento-publicacion-musica">
                        <logic:iterate  name="listaPublicaciones" id="publicacionTemporal" >
                        <%-- Inicio Elemento  --%>
                        <div id="elemento">

                            <div id="elemento-imagen"><img src="../assets/img/evento-icon.png" width="30"/></div><br>
                            
                            <p id="elemento-nombre">${publicacionTemporal.fechaPublicacion}</p><br>
                            <p id="elemento-nombre">${publicacionTemporal.descripcion}</p><br>
                            <img src=${publicacionTemporal.imagen}>
                              
                            
                        </div>
                        <%-- FIN Elemento  --%>
                        </logic:iterate>
                            
                        <a href="../listar_categorias_evento.do"><button id="boton-unir">
                                Agregar publicación
                        </button></a>
                   
                        <%-- FIN Elemento  --%>
                    </div>



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
    
