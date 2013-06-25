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
        
        <a href=" <%=request.getContextPath()%>/ver_boletines.do"><div id="evento">Boletin</div></a>
         <a href=" <%=request.getContextPath()%>/ecologia.jsp"><div id="evento">Ecologia</div></a>  
         <a href=" <%=request.getContextPath()%>/recreacion.jsp"><div id="evento">Recreacion</div></a>
         <a href=" <%=request.getContextPath()%>/bien_social.jsp"><div id="evento">Bien Social</div></a>
         <a href=" <%=request.getContextPath()%>/publicidad.jsp"><div id="evento">Publicidad</div></a>
         </div>
             </section>
            </div>
        
            
            
        <%@include file="includes/footer.jsp"%>
    
      
    </body>
</html>
