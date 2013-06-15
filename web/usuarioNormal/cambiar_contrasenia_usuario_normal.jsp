<%-- 
    Document   : cambiar_contrasenia_usuario_normal
    Created on : 12-jun-2013, 20:41:11
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