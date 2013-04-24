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
        <link href='http://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>
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

            <%@include file="includes/espacios.jsp" %>
            <section id="seccion-inferior">

                
                
                <div id="contendor-interno">
                    <a href=""><button id="boton-unir">Unirse</button></a>
                
                    <p id="articulo">Lorem ipsum dolor sit amet, consectetuer adipiscing elit.
                        Nam cursus. Morbi ut mi. Nullam enim leo, egestas id,
                        condimentum at, laoreet mattis, massa. Sed eleifend 
                        nonummy diam. Praesent mauris ante, elementum et,
                        bibendum at, posuere sit amet, nibh. Duis tincidunt 
                        lectus quis dui viverra vestibulum. Suspendisse 
                        vulputate aliquam dui. Nulla elementum dui ut augue.
                    </p>
                
                </div>

            </section>
            <%@include file="includes/footer.jsp" %>


        </div>

    </body>
</html:html>
