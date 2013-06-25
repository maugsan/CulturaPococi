<%-- 
    Document   : publicacion
    Created on : 18/05/2013, 01:23:02 PM
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
                        
                            
                        <%-- Inicio Elemento  --%>
                        

                            <div id="elemento-imagen"><img src="../assets/img/evento-icon.png" width="30"/></div><br>
                           
                            <p id="elemento-nombre">${publicacion.getNombrePerfil()}</p><br>
                            <p id="elemento-nombre">${publicacion.getFechaPublicacion()}</p><br>
                            <p id="elemento-nombre">${publicacion.getNombreCategoria()}</p><br>
                            <p id="elemento-nombre">${publicacion.getDescripcion()}</p><br>
                            
                             <iframe width="100%" height="166" scrolling="no" frameborder="no" src="http://www.youtube.com/embed/${publicacion.getMusica()}"></iframe>
                            
                            
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
    
