<%-- 
    Document   : publicacion_video
    Created on : 22/05/2013, 08:21:25 PM
    Author     : Personal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>


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

                    <h1><bean:message key="publicacion"/></h1>

                    <div id="elemento-publicacion-musica">
                        
                            
                        <%-- Inicio Elemento  --%>
                        

                            <div id="elemento-imagen"><img src="../assets/img/evento-icon.png" width="30"/></div><br>
                            ${publicacion.getIdPublicacion()}
                            <p id="elemento-nombre">${publicacion.getNombrePerfil()}</p><br>
                            <p id="elemento-nombre">${publicacion.getFechaPublicacion()}</p><br>
                            <p id="elemento-nombre">${publicacion.getNombreCategoria()}</p><br>
                            <p id="elemento-nombre">${publicacion.getDescripcion()}</p><br>
                            <a href="${publicacion.getVideo()}"><p id="elemento-nombre">Link: ${publicacion.getVideo()}</p></a><br>
                            
                             <a href="../aceptar_publicacion.do?idPublicacion=${publicacion.getIdPublicacion()}&tipoPublicacion=musica">
                                <html:submit value="Aceptar" />
                            </a>
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
    

