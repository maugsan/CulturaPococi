<%-- 
    Document   : cambiar_contrasenia_usuario_normal
    Created on : 12-jun-2013, 20:41:11
    Author     : Personal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
 <%@include file="/includes/head.jsp" %>
        <title>Registrarse</title>
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

    <section  id="seccion-principal">

        <div id="contendor-interno"> 

            <form method="get" action="../cambiar_contrasenia_usuario_normal.do">   
            <h1><bean:message key="usuario.normal.contrasenia.cambio"/></h1>

                
                <h2><bean:message key="usuario.normal.contrasenia.nueva"/></h2>
                <input type="text" name="contraseniaNueva"><br>
                
                
                
                <h2><bean:message key="usuario.normal.contrasenia.comprobacion"/></h2>
               <input type="text" name="contrasenia"><br>
                 
                
                <h2><bean:message key="usuario.normal.contrasenia.actual"/></h2>
                <input type="text" name="contraseniaActual"><br>
                
                <input type="submit" value="Cambiar">  

            </form>
                 

        </div> 

    </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>