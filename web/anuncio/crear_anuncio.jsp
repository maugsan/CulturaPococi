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
    
        <title>Crear Evento</title>
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

    <section  id="seccion-principal">

        <div id="contendor-interno"> 

            <html:form action="/crear_anuncio"  >
                
                
                
                <h1><bean:message key="anuncios.form"/></h1>
                
                <h2><bean:message key="anuncios.form.titulo"/></h2>
                <html:text  name="AnuncioForm" property="titulo" size="16" value=""/><br>
                
                <h2><bean:message key="anuncios.form.prioridad"/></h2>
                <html:select property="prioridad" name="AnuncioForm">
                    <logic:iterate name="listaPrioridades" id="numero" >
                        <html:option value="${numero}"> <!-- esto es para que cuando elija el nombre me envie el numero !-->
                            <bean:write name="numero"/><br>
                        </html:option>
                    </logic:iterate>
                </html:select>
                
                <br>
                <html:submit value="Crear" />

            </html:form>
            <html:errors/>

        </div> 

    </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>
