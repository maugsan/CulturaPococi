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
        <%@include file="/includes/head.jsp" %>
        <title><bean:message key="welcome.title"/></title>
        
        <html:base/>
    </head>
    <body>

        <%@include file="/includes/header_administrativo.jsp" %>
        <div id="contendor">

            
            <section  id="seccion-principal">

                
                <div id="contendor-interno"> 

                    <h1><bean:message key="publicacion"/></h1>

                    <div id="lista-elementos">
                        
                            
                        <%-- Inicio Elemento  --%>
                        

                            
                            <h1>${publicacion.getNombrePerfil()}</h1>
                            <h2>${publicacion.getNombreCategoria()}</h2>
                            <h3>${publicacion.getFechaPublicacion()}</h3>
                            <h3>${publicacion.getDescripcion()}</h3><br>
                            
                           <iframe width="420" height="315" src="http://www.youtube.com/embed/tb9yKa-P2-M" frameborder="0" allowfullscreen></iframe>
                          ${publicacion.getVideo()}
                            <br>
                             <a href="../aceptar_publicacion.do?idPublicacion=${publicacion.getIdPublicacion()}&tipoPublicacion=musica">
                                <html:submit value="Aceptar" />
                            </a>
                        <%-- FIN Elemento  --%>
                    </div>



                </div> 

            </section>

           
            <section id="seccion-inferior">

                <div id="contendor-interno"> </div>

            </section>
            <%@include file="/includes/footer.jsp" %>

        </div>

    </body>
</html:html>
    

