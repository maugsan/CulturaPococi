<%-- 
    Document   : inicio_usuario_normal
    Created on : 12-jun-2013, 20:00:40
    Author     : Personal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
        <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
        <%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" href="../assets/css/estilos.css" type="text/css" />
        <link rel="stylesheet" href="../assets/css/normalize.css" type="text/css" />
        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed' rel='stylesheet' type='text/css'>
    
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.7.2/jquery-ui.min.js"></script>
        <script type="text/javascript" src="./assets/js/calendario.js"></script>

        <script type="text/javascript" src="../assets/js/jquery.validate.js"></script>
        <script type="text/javascript" src="../assets/js/validar.js"></script>
        <%-- 
         para q se vea bonito el calendario
        --%>

        <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css">
        <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
        <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>

        <%-- 
        para q se vea bonito el calendario
        --%>

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