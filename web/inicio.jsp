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
        <link rel="stylesheet" href="./assets/css/estilosld.css" type="text/css" />
        
        <script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
		
		
            
        
        <link href='http://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>
        <html:base/>
    </head>
    <body>

        <div id="contendor">

            <%@include file="includes/header.jsp" %>
            <section  id="seccion-principal">


                <div id="contendor-interno"> 


                    <div id="contentSlide">

                        <div id="slideshow">
                            <ul id="controles">  	
                                <li id="cAtras"> <a href = "#" ></a> </li>
                                <li id="cAdelante"> <a href = "#" ></a> </li>
                            </ul>
                            <ul id="slides">  
                                
                                <li> <a href = "#">  <img src="./assets/img/inicio.png" > </a> </li>
                                <li> <a href = "#">   <img src="./assets/img/inicio1.png" > </a> </li>
                               

                            </ul>
                        </div>

                    </div>

                  
                </div> 

            </section>

            <%@include file="includes/espacios.jsp" %>
            <section id="seccion-inferior">



                <div id="contendor-interno">
                    <a href=""><button id="boton-unir">Únete</button></a>

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
                <script type="text/javascript" src="./assets/js/jqcy.js"> </script>
		<script type="text/javascript" src="./assets/js/jqSlide.js"> </script>

    </body>
</html:html>
