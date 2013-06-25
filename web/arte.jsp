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
        <title>Arte</title>
    </head>
    <body>
        <div id="contendor">
           
            <%@include file="includes/header.jsp"%>
             <section  id="seccion-principal">
           
            <div id="contendor-interno"> 
        <h1>Seleccione una opción</h1>
        
        <a href=" <%=request.getContextPath()%>/artistas.jsp"><div id="evento">Artistas</div></a>
        <!--  <a href=" <%=request.getContextPath()%>/ver_nuestro_arte.do"><div id="evento">Nuestro Arte</div></a>  -->
       
         </div>
             </section>
            
            
           
                </div>
        <%@include file="includes/footer.jsp"%>
    
       
    </body>
</html>
