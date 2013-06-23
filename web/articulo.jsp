<%-- 
    Document   : ariculos
    Created on : 19-jun-2013, 19:47:41
    Author     : MAU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <%@include file="includes/head.jsp"%> 
        <title>JSP Page</title>
    </head>
     <body>
         
        <%@include file="/includes/header.jsp" %>

        <section  id="seccion-principal">

                
                <div id="contendor-interno"> 
                   
                     <h1>Lista de Articulos boletin <%= request.getParameter("fecha")%></h1>
                     <section id="lista-elementos">
                        <logic:iterate  name="listaArticulos" id="articuloTemporal" >
                        <%-- Inicio Elemento  --%>
                        <a href="<%=request.getContextPath()%>/mostrar_articulo.do?id=${articuloTemporal.idArticulo}&fecha=${articuloTemporal.fecha}" ><div id="elemento">

                            <div id="elemento-imagen"><img src="/assets/img/evento-icon.png" width="30"/></div>
                            <h1 id="elemento-nombre">${articuloTemporal.titulo}</h1>
                  
                        </div></a>
                        <%-- FIN Elemento  --%>
                        </logic:iterate>
                        
                    </section>
                </div> 
            </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>
