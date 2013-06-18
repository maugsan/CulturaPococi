<%-- 
    Document   : inicio_usuario_normal
    Created on : 12-jun-2013, 20:00:40
    Author     : Personal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

      
        <%@include file="/includes/head.jsp" %>
        <title>Inicio</title>
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

    <section  id="seccion-principal">

        <div id="contendor-interno"> 

           
                
            <h1><bean:message key="usuario.normal.inicio"/></h1>

                
                <a href="./crear_perfil.jsp">
                    <button id="boton-volver">
                        <bean:message key="usuario.normal.crear.perfil"/>
                    </button>
                </a>
                    
                <%-- Ay que el de sesión

                    <a href="./listar_mis_perfiles.do?correo=${correo}">--%>
                <a href="../listar_mis_perfiles.do?correo=correo1">
                    <button id="boton-volver">
                        <bean:message key="usuario.normal.ver.perfiles"/>
                    </button>
                </a>
                    
                
                
                <h2><bean:message key="publicacion.recientes"/></h2>
               
                
               
                 

        </div> 

    </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>