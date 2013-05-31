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
        <script type="text/javascript" src="./assets/js/jquery.validate.js"></script>
        <script type="text/javascript" src="./assets/js/validar.js"></script>

        <title>Modificar Evento</title>
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

        <section  id="seccion-principal">

            <div id="contendor-interno"> 

                <form method="post" action="./actualizar_evento.do" id="validar-form">



                    <h1><bean:message key="form.evento.modificar"/></h1>

                    <label> Seleccionar Fecha:</label>
                    <input type="text" name="fecha" id="datepicker" readonly="readonly" size="12" value="${evento.fecha}" />


                    <h2><bean:message key="form.nombre"/></h2>
                    <input type="text" id="nombre" name="nombre" size="16" value="${evento.nombre}"/>


                    <h2><bean:message key="form.categoria"/></h2>
                    <select name="idCategoria">
                        <logic:iterate name="listaCategorias" id="numero" >
                            <option value="${numero.idCategoria}"> <!-- esto es para que cuando elija el nombre me envie el numero !-->
                                <bean:write name="numero" property="nombreCategoria"/>
                            </option>
                        </logic:iterate>
                    </select>


                    <h2><bean:message key="form.lugar"/></h2>
                    <input type="text" id="lugar" name="lugar" size="16" value="${evento.lugar}"/>

                    <h2><bean:message key="form.informacion"/></h2>
                    <textarea ROWS="5" id="texto-grande" id="informacion"  name="informacion" size="16" value="${evento.informacion}"></textarea>

                    <html:hidden  name="EventoForm" property="idEvento" value="${evento.idEvento}"/>
                    <html:hidden  name="EventoForm" property="correo" value="${evento.correo}"/>
                    <html:hidden  name="EventoForm" property="idCategoria" value="${evento.idCategoria}"/>

                    <input type="submit" value="Crear"/><br>

                </form>
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
