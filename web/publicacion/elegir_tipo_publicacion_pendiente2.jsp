<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>


<html:html lang="true">
      <head>
       <%@include file="/includes/head.jsp" %>
        <title><bean:message key="welcome.title"/></title>
      
    </head>
    <body>

        <%@include file="/includes/header_administrativo.jsp" %>
        <div id="contendor">

            
            <section  id="seccion-principal">

                
                <div id="contendor-interno"> 

                    <h1><bean:message key="publicacion.publicaciones.pendientes"/></h1>



                    
                        <form method="get" action="../listar_publicaciones_pendientes.do">

                            <select name="tipoPublicacion">
                                <option value="musica">Música</option>
                                <option value="video">Video</option>
                                <option value="texto">Texto</option>
                                <option value="imagen">Imagen</option>
                            </select>

                            <html:submit value="Buscar" /><br>



                        </form>
                   



                </div> 

            </section>

        
            <section id="seccion-inferior">

                <div id="contendor-interno"> </div>

            </section>
            <%@include file="/includes/footer.jsp" %>

        </div>

    </body>
</html:html>
    
