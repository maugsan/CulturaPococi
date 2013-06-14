<%-- 
    Document   : index
    Created on : 23/04/2013, 01:17:25 PM
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
        
             <link rel="stylesheet" href="./assets/css/jquery-theme.css" >
        <script src="./assets/js/jq.js"></script>
        <script src="./assets/js/funciones.js"></script>
        <script src="./assets/js/jquery-ui.js"></script>
        <html:base/>
    </head>
    <body>

        <%@include file="/includes/header_administrativo.jsp" %>
        <div id="contendor">
            
              <div id="dialog-confirm" title="Desea eliminar?">
            <p><span class="ui-icon ui-icon-alert" style="float: left; margin: 0 7px 20px 0;">

                </span>Este item se borrara permanentemente, esta seguro?</p>
        </div>


            <section  id="seccion-principal">


                <div id="contendor-interno"> 

                   
              

                    <section id="lista-elementos">
                         <h1>Perfiles</h1>
                         <a href="./crear_perfil.do"><button id="boton-unir">Crear Perfil</button></a>
                        <logic:iterate  name="listaPerfil" id="perfilTemporal" >

                            <%-- Inicio Elemento  --%>
                            <div id="elemento">

                                <%-- href="../mostrar_perfil_seleccionado.do?idPerfil= ${perfilTemporal.idPerfil}" --%>
                                
                                <a href="../mostrar_perfil_seleccionado.do?nombrePerfil=${perfilTemporal.nombrePerfil}"> <div id="link-detalle-elemento"><div id="elemento-imagen"><img src="../assets/img/perfil-icon.png" width="50"/></div>
                                        
                                        <h1> ${perfilTemporal.nombrePerfil}</h1> 
                                     
                                        <h2> ${perfilTemporal.nombreCategoria}</h2>

                                    
                                    </div></a>
                                <input type="button" value="Borrar" id="test" onClick="eliminarPerfil('${perfilTemporal.nombreCategoria}');" />

                            </div>
                            <%-- FIN Elemento   ${perfilTemporal.nombrePerfil} --%> 

                        </logic:iterate>
                         

                    </section>

                </div> 
                    
            </section>

           
            <%@include file="/includes/footer.jsp" %>
        </div>
    </body>
</html:html>
