<%-- 
    Document   : crear_usuarionormal
    Created on : 10-may-2013, 0:46:36
    Author     : Mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
        <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
        <%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/estilos.css" type="text/css" />
        <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/normalize.css" type="text/css" />
        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed' rel='stylesheet' type='text/css'>
    
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.7.2/jquery-ui.min.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/assets/js/calendario.js"></script>

        <script type="text/javascript" src="<%=request.getContextPath()%>/assets/js/jquery.validate.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath()%>/assets/js/validar.js"></script>
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

            <form method="get" action="../crear_usuario.do">   
                
            <h1>Crear Nuevo Usuario</h1>

                
                <h2><bean:message key="usuario.normal.correo"/></h2>
                <input type="text" name="correo"><br>
                
                
                
                <h2><bean:message key="usuario.normal.contrasenia"/></h2>
               <input type="text" name="contrasenia"><br>
                 
                
                <h2><bean:message key="usuario.normal.contrasenia.comprobacion"/></h2>
                <input type="text" name="contraseniaComprobacion"><br>
                
                <h2><bean:message key="usuario.normal.colaborador"/></h2>
                <input type="checkbox" name="colaborador" value="s">
                
                <input type="submit" name="Crear" value="Crear Usuario">  

            </form>
                 

        </div> 

    </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>