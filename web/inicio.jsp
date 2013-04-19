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
        <html:base/>
    </head>
    <body>

        <div id="contendor">

            <%@include file="includes/header.jsp" %>
            <section  id="seccion-principal">


                <div id="contendor-interno"> 
                    <img src="./assets/img/inicio.png" >
                </div> 


            </section>

            <%@include file="includes/anuncios-eventos.jsp" %>
            <section id="seccion-inferior">

                <div id="contendor-interno"> </div>

            </section>
            <%@include file="includes/footer.jsp" %>


        </div>

    </body>
</html:html>
