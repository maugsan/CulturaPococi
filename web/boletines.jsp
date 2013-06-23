<%-- 
    Document   : boletines
    Created on : 19-jun-2013, 18:49:06
    Author     : MAU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="includes/head.jsp"%> 
        <title>Boletines</title>
    </head>
    <body>

        <%@include file="/includes/header.jsp" %>
        <div id="contendor">

            
            <section  id="seccion-principal">

                
                <div id="contendor-interno"> 
                   
                    <h1><bean:message key="boletin.titulo"/></h1>
                    
                   <section id="lista-elementos">
                        <logic:iterate  name="listaBoletines" id="boletinTemporal" >
                        <%-- Inicio Elemento  --%>
                        <a href="<%=request.getContextPath()%>/ver_articulos.do?fecha=${boletinTemporal.fecha}">  <div id="elemento">

                            <div id="elemento-imagen"><img src="/assets/img/evento-icon.png" width="30"/></div>
                            <p id="elemento-nombre">${boletinTemporal.fecha}</p>
                  
                        </div></a>
                        <%-- FIN Elemento  --%>
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
</html>
