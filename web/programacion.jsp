<%-- 
    Document   : programacion
    Created on : 30-may-2013, 7:53:28
    Author     : MAU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="/includes/head.jsp" %>
        <title>Programas de Radio</title>
    </head>
    <body>
        <div id="contendor">
            <%@include file="includes/header.jsp" %>
            <section  id="seccion-principal">
                <div id="contendor-interno"> 

                    <h1>Programas de Radio</h1>


                    <div id="contentSlide">

                        <div id="slideshow">
                            <ul id="controles">  	
                                <li id="cAtras"> <a href = "#" ></a> </li>
                                <li id="cAdelante"> <a href = "#" ></a> </li>
                            </ul>
                            <ul id="slides">  

                                <logic:iterate name="listaProgramas" id="numero" >
                                    <li> 
                                        <div id="programa"><img src="assets/img/radio-icon.png" width="150"/>
                                        <h1> ${numero.nombre}</h1>
                                        <h2>  ${numero.horario}</h2>
                                        <h3>  ${numero.descripcion}</h3>



                                        <%-- FIN Elemento   ${perfilTemporal.nombrePerfil} --%> 

                                   </div>
                                    </li>
                                </logic:iterate>
                                

                            </ul>
                        </div>

                    </div>


                </div> 

                <section id="seccion-inferior">

                    <div id="contendor-interno">

                        <div id="s-izquierdo">
                            <img src="./assets/img/guitarra-icon.png"/>
                            <h1>Directorio</h1>

                        </div> 

                        <a href="#" id="radio"><div  id="s-centro">

                                <img src="./assets/img/radio-icon.png" />
                                <h1>Radio</h1>


                            </div></a>

                        <div id="s-derecho">

                            <img src="./assets/img/idea-icon.png"/>
                            <h1>Nosotros</h1>


                        </div> 



                        <a href="<%=request.getContextPath()%>/crear_usuario.do"><button id="boton-unir">Únete</button></a>
                        <p>Proin elit arccitudin mi sit  dapibus lacus
                            auctor risus. Aenean tempor ullamcorper leo. 
                            Vivamus sed magna quis ligula eleifend adipiscing.
                            Duis orci. Aliquam sodales tortor vitae ipsum. 
                            um. Nunc tristique tempus lectus.</p>
                        <br><br>

                    </div>


                </section>


                <%@include file="includes/espacios.jsp" %> 

            </section>
            <%@include file="includes/footer.jsp" %>
        </div>
    </body>
</html>
