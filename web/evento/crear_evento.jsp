<%-- 
    Document   : crear_evento
    Created on : 18/04/2013, 10:08:58 PM
    Author     : Mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Evento</title>
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

    <section  id="seccion-principal">

        <div id="contendor-interno">

            <html:form action="/nuevologin">
                <h1>cassssssssssaaaaaaaaaa</h1>
                <h2> Correo</h2>

                <html:text  name="NuevoLoginForm" property="correo" size="16"/><br>
                <h2> clave</h2>
                <html:password  name="NuevoLoginForm" property="contrasenia" size="16"/><br>
                <html:submit value="Entrar" />

            </html:form>
            <html:errors/>

        </div> 

    </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>
