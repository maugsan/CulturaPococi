<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="true">
    <head>

        <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
        <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
        <%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>El Frente.org</title>

        <link rel="stylesheet" href="./assets/css/estilos.css" type="text/css" />
        <link rel="stylesheet" href="./assets/css/normalize.css" type="text/css" />
        <link rel="stylesheet" href="./assets/css/estilosld.css" type="text/css" />

        <script type="text/javascript" src="./assets/js/jq.js"></script>
        <script type="text/javascript" src="./assets/js/jqcy.js"></script>
        <script type="text/javascript" src="./assets/js/jqSlide.js"></script>

        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed' rel='stylesheet' type='text/css'>

        <link rel="stylesheet" href="./assets/css/jquery.ui.css">
        <link rel="stylesheet" href="./assets/css/jquery.ui.all.css">
        <script src="./assets/js/jquery-ui.js"></script>

       


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
                                <li> <a href = "#">   <img src="./assets/img/banner1.jpg" > </a> </li>
                                <li> <a href = "#">   <img src="./assets/img/banner2.jpg" > </a> </li>


                            </ul>
                        </div>

                    </div>


                </div> 

            </section>

            <%@include file="includes/espacios.jsp" %>
            <section id="seccion-inferior">



                <div id="contendor-interno">
                    <a href=""><button id="boton-unir">Únete</button></a>
                            <p>Proin elit arccitudin mi sit  dapibus lacus
                                auctor risus. Aenean tempor ullamcorper leo. 
                                Vivamus sed magna quis ligula eleifend adipiscing.
                                Duis orci. Aliquam sodales tortor vitae ipsum. 
                                um. Nunc tristique tempus lectus.</p>

                </div>


            </section>


            <%@include file="includes/footer.jsp" %>

        </div>

    </body>
</html>
