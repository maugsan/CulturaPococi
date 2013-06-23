<%-- 
    Document   : crear_usuarionormal
    Created on : 10-may-2013, 0:46:36
    Author     : Mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        
        
       <%@include file="/includes/head.jsp"%> 

        <title>Registrarse</title>
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

    <section  id="seccion-principal">

        <div id="contendor-interno"> 

            <form method="get" action="../crear_usuario.do"  id="validar-form">   
                
            <h1>Crear Nuevo Usuario</h1>

                
                <h2><bean:message key="usuario.normal.correo"/></h2>
                <input type="text" id="correo" name="correo" ><br>
                
                
                
                <h2><bean:message key="usuario.normal.contrasenia"/></h2>
                <input type="password" id="contrasenia" name="contrasenia" ><br>
                 
                
                <h2><bean:message key="usuario.normal.contrasenia.comprobacion"/></h2>
                <input type="password" id="contraseniaComprobacion" name="contraseniaComprobacion" ><br>
                
                <h2><bean:message key="usuario.normal.colaborador"/></h2>
                <input type="checkbox" name="colaborador" value="s">
                
                <input type="submit" value="Crear"/> 

            </form>
                 

        </div> 

    </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>