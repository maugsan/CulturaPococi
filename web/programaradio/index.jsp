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



                    <a href="crear_programaradio.jsp"><button id="boton-unir">Nuevo Programa de Radio</button></a>
                    <script type="text/javascript">
                                             var d = new Date();
                                             document.write('<br>Hora: ' + d.getHours(), ':' + d.getMinutes());
                    </script>



                    <logic:iterate name="listaProgramas" id="numero" >
                        <div id="elemento">

                            <p id="elemento-nombre"> ${numero.nombre}</p> 
                            <BR>
                            <p id="elemento-nombre"> ${numero.horario}</p> 
                            <BR>
                            <p id="elemento-nombre"> ${numero.descripcion}</p> 
                            <BR>

                        </div>
                        <a href="../eliminar_programa_radio.do?nombre=${numero.nombre}"><div id="elemento-icon"><img src="../assets/img/delete-icon.png" width="30"/></div></a>   

                    </div>
                    <%-- FIN Elemento   ${perfilTemporal.nombrePerfil} --%> 

                </logic:iterate>
            </section>
        </div> 



        <%@include file="/includes/espacios.jsp" %>
        <section id="seccion-inferior">

            <div id="contendor-interno"> </div>

        </section>
        <%@include file="/includes/footer.jsp" %>

    </div>

</body>
</html:html>
