<%-- 
    Document   : mostrar_mis_perfiles
    Created on : 13-jun-2013, 18:44:28
    Author     : Personal
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>


<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html:html lang="true">
    <head>
        <%@include file="../includes/head.jsp" %>
        <title><bean:message key="welcome.title"/></title>
       
        <html:base/>
    </head>
    <body>

        <%@include file="../includes/header.jsp" %>
        <div id="contendor">
            
            <section  id="seccion-principal">


                <div id="contendor-interno"> 

                    <section id="lista-elementos">
                         <h1>Perfiles</h1>
                        <a href="<%=request.getContextPath()%>/crear_perfil.do"><button id="boton-unir">Nuevo</button></a> 
                        <logic:iterate  name="listaPerfil" id="perfilTemporal" >

                            <%-- Inicio Elemento  --%>
                            <div id="elemento">

                             
                                
                                <a href="<%=request.getContextPath()%>/mostrar_perfil_seleccionado.do?idPerfil=${perfilTemporal.idPerfil}"> 
                                    <div id="link-detalle-elemento">
                                        <div id="elemento-imagen">
                                            <img src="<%=request.getContextPath()%>/assets/img/perfil-icon.png" width="30"/>
                                        </div>
                                        
                                        <h1> ${perfilTemporal.nombrePerfil}</h1> 
                                        <BR>
                                        <h2> ${perfilTemporal.nombreCategoria}</h2>

                                       
                                    </div></a>
                                <input type="button" value="Borrar" id="test" onClick="eliminarPerfil('${perfilTemporal.nombreCategoria}');" />

                            </div>
                            <%-- FIN Elemento   --%> 

                        </logic:iterate>
                         
                    </section>

                </div> 
                    
            </section>

           
            <%@include file="/includes/footer.jsp" %>
        </div>
    </body>
</html:html>
