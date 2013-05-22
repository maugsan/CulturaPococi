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

        <script>

            $(document).ready(function() {

                $("#contentBusqueda").hide();
                $("#tabs").tabs({
                    event: "mouseover"
                });


                $("#boton-buscar").click(function() {
                    $("#contentSlide").hide();
                    $("#contentBusqueda").show();
                });


                $("#header-logo").click(function() {


                    $("#contentBusqueda").hide();
                    $("#contentSlide").show();
                });

                $(function() {
                    var availableTags = [
                        "ActionScript",
                        "AppleScript",
                        "Asp",
                        "BASIC",
                        "C",
                        "C++",
                        "Clojure",
                        "COBOL",
                        "ColdFusion",
                        "Erlang",
                        "Fortran",
                        "Groovy",
                        "Haskell",
                        "Java",
                        "JavaScript",
                        "Lisp",
                        "Perl",
                        "PHP",
                        "Python",
                        "Ruby",
                        "Scala",
                        "Scheme"
                    ];
                    $("#tags").autocomplete({
                        source: availableTags
                    });
                });

            });
        </script>



    </head>


    <body>


        <div id="contendor">
            <%@include file="includes/header.jsp" %>
            <section  id="seccion-principal">


                <div id="contendor-interno"> 

                    <div id="contentBusqueda">

                        <h1>Busqueda</h1>


                        <div class="ui-widget">

                            <form id="busqueda" action="/buscar">

                                <input id="tags">
                                <input type="submit" value="Buscar">


                            </form>

                        </div>

                    </div>

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
                    <div id="tabs">
                        <ul id="tabs-titulos">
                            <li><a href="#tabs-1">Paso 1</a></li>
                            <li><a href="#tabs-2">Paso 2</a></li>
                            <li><a href="#tabs-3">Paso 3</a></li>
                        </ul>
                        <div id="tabs-1">
                            <a href=""><button id="boton-unir">Únete</button></a>
                            <p>Proin elit arcu, citudin mi sit  dapibus lacus auctor risus. Aenean tempor ullamcorper leo. Vivamus sed magna quis ligula eleifend adipiscing. Duis orci. Aliquam sodales tortor vitae ipsum. Aliquam nulla. Duis aliquam molestie erat. Ut et mauris vel pede varius sollicitudin. Sed ut dolor nec orci tincidunt interdum. Phasellus ipsum. Nunc tristique tempus lectus.</p>
                        </div>
                        <div id="tabs-2">
                            <p>Morbiurabitur ornare consequat nunc. Aenean vel metus. Ut posuere viverra nulla. Aliquam erat volutpat. Pellentesque convallis. Maecenas feugiat, tellus pellentesque pretium posuere, felis lorem euismod felis, eu ornare leo nisi vel felis. Mauris consectetur tortor et purus.</p>
                        </div>
                        <div id="tabs-3">

                            <p>Maos himenae eu urna vel enim commodo pellentesque. Praesent eu risus hendrerit ligula tempus pretium. Curabitur lorem enim, pretium nec, feugiat nec, luctus a, lacus.</p>

                        </div>
                    </div>


                </div>


            </section>


            <%@include file="includes/footer.jsp" %>

        </div>

    </body>
</html>
