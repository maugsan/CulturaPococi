<%-- 
    Document   : arte
    Created on : 24-jun-2013, 0:11:32
    Author     : MAU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="includes/head.jsp"%>
        <title>Cultura</title>
    </head>
    <body>
         <%@include file="includes/header.jsp"%>
        <div id="contendor">
            <section  id="seccion-principal">
           
            <div id="contendor-interno"> 
        <h1>Seleccione una opción</h1>
        
        <logic:iterate  name="listaCategorias" id="categoriaTemporal" >
                            <%-- Inicio Elemento  --%>
                           <a href="<%=request.getContextPath()%>/ver_perfiles.do?c=${categoriaTemporal.idCategoria}"> <div id="evento">

                               
                                <h1>${categoriaTemporal.nombreCategoria}</h1>


                            </div></a>
                            <%-- FIN Elemento  --%>
                        </logic:iterate>
             </section>
            </div>
        
            
            
        <%@include file="includes/footer.jsp"%>
    
      
    </body>
</html>
