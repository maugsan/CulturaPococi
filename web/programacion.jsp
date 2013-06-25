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
                                    <li id="contenedor-radio"> 
                                        <div id="programa"><img src="assets/img/radio-icon.png" width="100"/>
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

                <%@include file="includes/espacios.jsp" %> 

            </section>
            <%@include file="includes/footer.jsp" %>
        </div>
    </body>
</html>
