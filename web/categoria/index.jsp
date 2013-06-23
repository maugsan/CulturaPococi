<%-- 
    Document   : index
    Created on : 23/04/2013, 01:17:01 PM
    Author     : Mac
--%>


<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <link rel="stylesheet" href="./assets/css/estilos.css" type="text/css" />
        <link rel="stylesheet" href="./assets/css/normalize.css" type="text/css" />
        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed' rel='stylesheet' type='text/css'>
        <html:base/>
    </head>
    <body>

        <%@include file="/includes/header.jsp" %>
        <div id="contendor">

            <section  id="seccion-principal">


                <div id="contendor-interno"> 

                    <h1><bean:message key="form.categoria"/></h1>

                    <section id="lista-elementos">
                            <a href="./crear_categoria.jsp"><button id="boton-unir"><bean:message key="boton.crear.categoria"/></button></a>
                        <logic:iterate  name="listaCategorias" id="categoriaTemporal" >
                            <%-- Inicio Elemento  --%>
                            <div id="elemento">

                                <div id="elemento-imagen"><img src="../assets/img/category-icon.png" width="30"/></div>
                                <h1>${categoriaTemporal.nombreCategoria}</h1>


                            </div>
                            <%-- FIN Elemento  --%>
                        </logic:iterate>
                    
                    </section>

                </div> 
            </section>


            <section id="seccion-inferior">

                <div id="contendor-interno"> </div>

            </section>
            <%@include file="/includes/footer.jsp" %>


        </div>

    </body>
</html:html>
