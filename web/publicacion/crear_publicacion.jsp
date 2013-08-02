<%-- 
    Document   : crear_publicacion
    Created on : 29-jul-2013, 16:30:33
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <%@include file="/includes/head.jsp" %>

    <title>Publicar</title>
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

    <section  id="seccion-principal">

        <div id="contendor-interno"> 

            <html:form action="/guardar_publicacion.do" >

                <h2><bean:message key="form.nombre"/></h2>
                <html:text  name="EventoForm" property="nombre" size="16" value=""/><br>
                
                <html:errors property="enombre"/> 
          
                <h2><bean:message key="form.lugar"/></h2>
                <html:text  name="EventoForm" property="lugar" size="16" value=""/><br>
                <html:errors property="elugar"/> 
                
                <h2><bean:message key="form.informacion"/></h2>
                <html:textarea name="EventoForm" property="informacion" cols="44" rows="5" value="" /><br>
                <html:errors property="einformacion"/> 
                
                <html:hidden  name="EventoForm" property="correo" value=""/>
                
                <html:submit value="Crear" />

            </html:form>
                

        </div> 

    </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>
