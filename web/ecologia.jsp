<%-- 
    Document   : ecologia
    Created on : 25-jun-2013, 6:05:45
    Author     : MAU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="includes/head.jsp"%>
        <title>Ecologia</title>
    </head>
    <body>
        <div id="contendor">
           
            <%@include file="includes/header.jsp"%>ç
             <section  id="seccion-principal">
            <div id="contendor-interno"> 
         <h1>Seleccione una opción</h1>
        
         <a href="<%=request.getContextPath()%>/ver_perfiles.do?c=reforestacion"><div id="evento">REFORESTACIÓN</div></a>
         <a href="<%=request.getContextPath()%>/ver_perfiles.do?c=educacionambiental"><div id="evento">EDUCACION AMBIENTAL</div></a>  
         <a href="<%=request.getContextPath()%>/ver_perfiles.do?c=limpiezasderiosyplayas"><div id="evento">LIMPIEZA DE RÍOS Y PLAYAS</div></a>
         <a href="<%=request.getContextPath()%>/ver_perfiles.do?c=vidasilvestre"><div id="evento">VIDA SILVESTRE</div></a>
      
         
              </section>
                </div>
                </div>
        <%@include file="includes/footer.jsp"%>
    
       
    </body>
</html>

