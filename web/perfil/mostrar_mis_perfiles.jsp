<%-- 
    Document   : mostrar_mis_perfiles
    Created on : 13-jun-2013, 18:44:28
    Author     : Personal
--%>



<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html:html lang="true">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
                                          <a href="<%=request.getContextPath()%>/eliminar_perfil.do?idPerfil=${perfilTemporal.idPerfil}">
                                    <div id="elemento-icon"><img src="<%=request.getContextPath()%>/assets/img/delete-icon.png" width="30"/>
                                    </div></a>   
                             

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
