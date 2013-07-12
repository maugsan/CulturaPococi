<%-- 
    Document   : arte
    Created on : 24-jun-2013, 0:11:32
    Author     : MAU
--%>

<%@page import="com.culturaPococi.dominio.URL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="includes/head.jsp"%>
        <title>Arte</title>
    </head>
    <body>
        <div id="contendor">
           
            <%@include file="includes/header.jsp"%>
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
       
        <a href=" <%=request.getContextPath()%>/ver_nuestro_arte.do"><div id="evento">Nuestro Arte</div></a> 
       
         </div>
             </section>
            
            
           
                </div>
        <%@include file="includes/footer.jsp"%>
    
       
    </body>
</html>
