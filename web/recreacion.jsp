<%-- 
    Document   : recreacion
    Created on : 25-jun-2013, 6:07:18
    Author     : MAU
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="includes/head.jsp"%>
        <title>Recreacion</title>
    </head>
    <body>
        <div id="contendor">
           
            <%@include file="includes/header.jsp"%>
              <section  id="seccion-principal">
            <div id="contendor-interno"> 
         <h1>Seleccione una opción</h1>
        
         <a href="<%=request.getContextPath()%>/ver_perfiles.do?c=deportes"><div id="evento">DEPORTES</div></a>
         <a href="<%=request.getContextPath()%>/ver_perfiles.do?c=montanismo"><div id="evento">MONTAÑISMO</div></a>  
         <a href="<%=request.getContextPath()%>/ver_perfiles.do?c=caminatas"><div id="evento">CAMINATAS</div></a>
         <a href="<%=request.getContextPath()%>/ver_perfiles.do?c=motores"><div id="evento">MOTORES</div></a>
         <a href="<%=request.getContextPath()%>/ver_perfiles.do?c=montainbike"><div id="evento">MONTAIN BIKE</div></a>
        

              </section>
                </div>
        <%@include file="includes/footer.jsp"%>
    
       
    </body>
</html>
