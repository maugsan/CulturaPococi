<%-- 
    Document   : crear_evento
    Created on : 18/04/2013, 10:08:58 PM
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
    
        <title><bean:message key="articulo.ver.articulo"/></title>
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

    <section  id="seccion-principal">

        <div id="contendor-interno"> 

            <html:form action="/actualizar_articulo"  >
                
                <h1><bean:message key="articulo.ver.articulo"/></h1>
                
                <h2><bean:message key="articulo.titulo"/></h2>
                <html:text  name="ArticuloForm" property="titulo" size="16" value="${articulo.titulo}"/><br>
                <html:errors property="etitulo"/> 
                
                <h2><bean:message key="articulo.fecha"/></h2><br>
                
                <h2><bean:message key="articulo.autor"/></h2>
                <html:text  name="ArticuloForm" property="autor" size="16" value="${articulo.autor}"/><br>
                <html:errors property="eautor"/> 
                
                <h2><bean:message key="form.categoria"/></h2>
                <html:select property="categoria" >
                    <logic:iterate name="listaCategorias" id="numero" >
                        <html:option value="${numero.idCategoria}"> <!-- esto es para que cuando elija el nombre me envie el numero !-->
                            <bean:write name="numero" property="nombreCategoria"/>
                        </html:option>
                    </logic:iterate>
                </html:select>
                
                <h2><bean:message key="articulo.contenido"/></h2>
                <html:textarea name="ArticuloForm" property="contenido" cols="44" rows="5" value="${articulo.contenido}"/><br>
                <html:errors property="econtenido"/> 
                
                <html:hidden  name="EventoForm" property="idArticulo" value="${articulo.idArticulo}"/>
                
                <html:submit value="Actualizar" /><br>
               
                
                   
            </html:form>
                 
                <a href="./listar_articulos.do">
                    <button id="boton-volver">
                        <bean:message key="boton.volver"/>
                    </button>
                </a>
        </div> 

    </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>
