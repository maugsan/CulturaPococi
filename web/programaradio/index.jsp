<%-- 
    Document   : Programa de radio
    Created on : 23/04/2013, 01:17:53 PM
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

        <%@include file="/includes/header_administrativo.jsp" %>
        <div id="contendor">

            <section  id="seccion-principal">


                <div id="contendor-interno"> 

                    <script type="text/javascript">
                                             var d = new Date();
                                             document.write('<br>Hora: ' + d.getHours(), ':' + d.getMinutes());
                    </script>


                    <section id="lista-elementos">
                        <a href="crear_programaradio.jsp"><button id="boton-unir">Nuevo Programa de Radio</button></a>
                        <logic:iterate name="listaProgramas" id="numero" >
                            <div id="elemento">
                            <div id="elemento-imagen"><img src="../assets/img/radio-icon.png" width="30"/></div>
                            <h1> ${numero.nombre}</h1>
                            <h2>  ${numero.horario}</h2>
                            <h3>  ${numero.descripcion}</h3>




                            <a href="../eliminar_programa_radio.do?nombre=${numero.nombre}"><div id="elemento-icon"><img src="../assets/img/delete-icon.png" width="30"/></div></a>   




                            <%-- FIN Elemento   ${perfilTemporal.nombrePerfil} --%> 


                    </div>
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
