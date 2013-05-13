<%-- 
    Document   : modificar_evento
    Created on : 18/04/2013, 10:09:36 PM
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
    
        <title>Modificar Evento</title>
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

    <section  id="seccion-principal">

        <div id="contendor-interno"> 

            <html:form action="/actualizar_evento" >
                
                
                
                <h1><bean:message key="form.evento.modificar"/></h1>
                
                <h2><bean:message key="form.nombre"/></h2>
                <html:text  name="EventoForm" property="nombre" size="16" value="${evento.nombre}"/><br>
                
                <h2><bean:message key="form.categoria"/></h2>
                <html:select property="idCategoria">
                    <logic:iterate name="listaCategorias" id="numero" >
                        <html:option value="${numero.idCategoria}"> <!-- esto es para que cuando elija el nombre me envie el numero !-->
                            <bean:write name="numero" property="nombreCategoria"/>
                        </html:option>
                    </logic:iterate>
                </html:select>
                
                <h2><bean:message key="form.lugar"/></h2>
                <html:text  name="EventoForm" property="lugar" size="16" value="${evento.lugar}"/><br>
                
                <h2><bean:message key="form.informacion"/></h2>     
                <html:textarea name="EventoForm" property="informacion" value="${evento.informacion}" /><br>
                <html:hidden  name="EventoForm" property="idEvento" value="${evento.idEvento}"/>
                <html:hidden  name="EventoForm" property="correo" value="${evento.correo}"/>
                <html:hidden  name="EventoForm" property="idCategoria" value="${evento.idCategoria}"/>
                
                <html:submit value="Actualizar" />

            </html:form>
            <html:errors/>

        </div> 

    </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>
