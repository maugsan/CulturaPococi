<%-- 
    Document   : mostrar_articulo
    Created on : 19-jun-2013, 20:51:04
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

        <%@include file="includes/header.jsp" %>
        <section  id="seccion-principal">



            <div id="contendor-interno"> 

                <section class="texto">
  
                <h1>${articulo.titulo}</h1>
                <p>${articulo.contenido}</p>
                <h2>${articulo.categoria}</h2>
                <h2>${articulo.fecha}</h2>
                <h4>${articulo.autor}</h4>
                
                </section>
             
                <section id="lista-elementos">
                       <h2>Articulos relacionados</h2>
                    <logic:iterate  name="listaArticulos" id="articuloTemporal" >
                        <%-- Inicio Elemento  --%>
                        <a href="<%=request.getContextPath()%>/mostrar_articulo.do?id=${articuloTemporal.idArticulo}&fecha=${articuloTemporal.fecha}" >


                            <h1 id="elemento-nombre">${articuloTemporal.titulo}</h1>

                        </a>
                        <%-- FIN Elemento  --%>
                    </logic:iterate>

                </section>
            </div> 
        </section>
        <%@include file="includes/footer.jsp" %>


    </body>
</html>
