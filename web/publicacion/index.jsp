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

                    <h1>Publicaciones</h1>


                    <section id="lista-elementos">

                        <logic:iterate  name="listaPublicacion" id="publicacionTemporal" >

                            <%-- Inicio Elemento  --%>
                            <div id="elemento">

                                <%-- href="action.do?metodo(mostrar)= ${perfilTemporal.idPerfil}" --%>
                                <a href=""> <div id="link-detalle-elemento"><div id="elemento-imagen"><img src="../assets/img/perfil-icon.png" width="30"/></div>

                                        <p id="elemento-nombre"> ${publicacionTemporal.nombrePerfil}</p> 
                                        <br>
                                        <p id="elemento-categoria">${publicacionTemporal.nombreCategoria}</p>
                                        <br>
                                        <p id="elemento-categoria">${publicacionTemporal.musica}</p>
                                        <br>
                                        <p id="elemento-categoria">${publicacionTemporal.video}</p>
                                        <br>
                                        <p id="elemento-categoria">${publicacionTemporal.imagen}</p>

                                    </div></a>
                                    <%-- <a href="../eliminar_perfil.do?nombrePerfil=${publicacionTemporal.idPublicacion}"><div id="elemento-icon"><img src="../assets/img/delete-icon.png" width="30"/></div></a> --%>  

                            </div>
                            <%-- FIN Elemento   ${perfilTemporal.nombrePerfil} --%> 

                        </logic:iterate>

                    </section>
                    

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
