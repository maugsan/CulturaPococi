<%@page import="java.net.URLEncoder"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html:html lang="true">
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="/includes/head.jsp" %>
        <title><bean:message key="welcome.title"/></title>
      
    </head>
    <body>

        <%@include file="/includes/header.jsp" %>
        <div id="contendor">
 
            <section  id="seccion-principal">


                <div id="contendor-interno"> 

                    <section id="lista-elementos">
                         <h1>Perfiles</h1>
                        <logic:iterate  name="listaPerfil" id="perfilTemporal" >

                            <%-- Inicio Elemento  --%>
                            <div id="elemento">

                                
                                <a href="<%=request.getContextPath()%>/mostrar_perfil_seleccionado.do?idPerfil=${perfilTemporal.idPerfil}"> 
                                    <div id="link-detalle-elemento">
                                        <div id="elemento-imagen"><img src="<%=request.getContextPath()%>/assets/img/perfil-icon.png" width="50"/></div>
                                        
                                        <h1> ${perfilTemporal.nombrePerfil}</h1> 
                                     
                                        <h2> ${perfilTemporal.nombreCategoria}</h2>

                                    
                                    </div></a>
                               
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