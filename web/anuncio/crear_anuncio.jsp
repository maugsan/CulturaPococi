<%-- 
    Document   : crear_anuncio
    Created on : 18/04/2013, 09:56:53 PM
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
        <title>JSP Page</title>

        <link rel="stylesheet" href="./assets/css/estilos.css" type="text/css" />
        <link rel="stylesheet" href="./assets/css/normalize.css" type="text/css" />
        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed' rel='stylesheet' type='text/css'>
        
        <script type="text/javascript" src="./assets/js/jquery-1.0.9.min.js"></script>
        <script type="text/javascript" src="./assets/js/jquery.validate.js"></script>
        <script type="text/javascript" src="./assets/js/validar.js"></script>

        <title>Crear Evento</title>
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

    <section  id="seccion-principal">

        <div id="contendor-interno"> 

             <form method="post" action="./crear_anuncio.do"  id="validar-form">
                 
               <h1><bean:message key="anuncios.form"/></h1>
                
                <h2><bean:message key="anuncios.form.titulo"/></h2>
                <input type="text" id="titulo" name="titulo" size="16" value=""/>
                                
                <h2><bean:message key="anuncios.form.prioridad"/></h2>
                <select name="prioridad">
                    <logic:iterate name="listaPrioridades" id="numero" >
                        <option value="${numero}"> <!-- esto es para que cuando elija el nombre me envie el numero !-->
                            <bean:write name="numero"/><br>
                        </option>
                    </logic:iterate>
                </select>
                
                <br>
                <input type="submit" value="Crear"/><br>

            </form>
            <html:errors/>

        </div> 

    </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>
