<%-- 
    Document   : index
    Created on : 23/04/2013, 01:18:18 PM
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
        <link rel="stylesheet" href="../assets/css/estilos.css" type="text/css" />
        <link rel="stylesheet" href="../assets/css/normalize.css" type="text/css" />
        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed' rel='stylesheet' type='text/css'>
        <html:base/>
    </head>
    <body>

        <%@include file="/includes/header_administrativo.jsp" %>
        <div id="contendor">

            
            <section  id="seccion-principal">

                
                <div id="contendor-interno"> 

                    <h1><bean:message key="publicaciones.titulo"/></h1>


                    <div id="listaPublicacion">
                        <div id="elemento-imagen"><img src="../assets/img/evento-icon.png" width="30"/></div>
                        <a href="elegir_tipo_publicacion_pendiente.jsp"><bean:message key="publicacion.publicaciones.pendientes"/></a>
                    </div>
                    <%-- FIN Elemento   ${perfilTemporal.nombrePerfil} --%> 



                </div> 

            </section>

            <%@include file="/includes/espacios.jsp" %>
            <section id="seccion-inferior">

                <div id="contendor-interno"> </div>

            </section>
            <%@include file="/includes/footer.jsp" %>

        </div>

    </body>
</html:html>