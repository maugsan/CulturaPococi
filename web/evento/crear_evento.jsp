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
    
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.7.2/jquery-ui.min.js"></script>
        <script type="text/javascript" src="./assets/js/calendario.js"></script>
        <title>Crear Evento</title>
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

    <section  id="seccion-principal">

        <div id="contendor-interno"> 

            <html:form action="/crear_evento" >
                
                
                
                <h1><bean:message key="form.evento.crear"/></h1>
                
                <h2><bean:message key="form.nombre"/></h2>
                <html:text  name="EventoForm" property="nombre" size="16" value=""/><br>
                
                <html:errors property="enombre"/> 
                
                <h2><bean:message key="form.fecha"/></h2>
                <input type="text" name="fecha" id="datepicker" readonly="readonly" size="12" />
                 <html:errors property="efecha"/> 
                 
                
                <h2><bean:message key="form.categoria"/></h2>
                <html:select property="idCategoria">
                    <logic:iterate name="listaCategorias" id="numero" >
                        <html:option value="${numero.idCategoria}"> <!-- esto es para que cuando elija el nombre me envie el numero !-->
                            <bean:write name="numero" property="idCategoria"/>
                        </html:option>
                    </logic:iterate>
                </html:select>
                
                <h2><bean:message key="form.lugar"/></h2>
                <html:text  name="EventoForm" property="lugar" size="16" value=""/><br>
                <html:errors property="elugar"/> 
                
                <h2><bean:message key="form.informacion"/></h2>
                <html:textarea name="EventoForm" property="informacion" cols="44" rows="5" value="" /><br>
                <html:errors property="einformacion"/> 
                
                <html:hidden  name="EventoForm" property="correo" value=""/>
                
                <html:submit value="Crear" />

            </html:form>
                 <a href="./listar_evento.do">
                    <button id="boton-volver">
                        <bean:message key="boton.volver"/>
                    </button>
                </a>

        </div> 

    </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>
