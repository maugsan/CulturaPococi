<%-- 
    Document   : index
    Created on : 23/04/2013, 01:15:07 PM
    Author     : Mac
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <link rel="stylesheet" href="./assets/css/estilos.css" type="text/css" />
        <link rel="stylesheet" href="./assets/css/normalize.css" type="text/css" />
        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed' rel='stylesheet' type='text/css'>
        <html:base/>
    </head>
    <body>
        <%@include file="/includes/header_administrativo.jsp" %>
        <div id="contendor">

            
            <section  id="seccion-principal">

                
                <div id="contendor-interno"> 
                   
                    <h1><bean:message key="anuncio.titulo"/></h1>
                    <section id="lista-elementos">
                         <a href="../listar_prioridades.do"><button id="boton-unir">Crear Anuncio</button></a>
                        <logic:iterate  name="listaAnuncios" id="anuncioTemporal" >
                        <%-- Inicio Elemento  --%>
                        <div id="elemento">

                            <div id="elemento-imagen"><img src="../assets/img/evento-icon.png" width="30"/></div>
                            <h1>${anuncioTemporal.titulo}</h1>
                            <a href="../eliminar_anuncio.do?idAnuncio=${anuncioTemporal.idAnuncio}">
                                <div id="elemento-icon"><img src="../assets/img/delete-icon.png" width="30"/></div>
                            </a> 
                              <img src=${anuncioTemporal.getImagen()}>
                             
                        </div>
                        <%-- FIN Elemento  --%>
                        </logic:iterate>
                       
            </section>
                        
                </div> 
            </section>
            
            
            
            <section id="seccion-inferior">

                <div id="contendor-interno"> </div>

            </section>
            <%@include file="/includes/footer.jsp" %>


        </div>

    </body>
</html:html>
