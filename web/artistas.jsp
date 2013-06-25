<%-- 
    Document   : artistas
    Created on : 25-jun-2013, 7:41:37
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
        <h1>Seleccione una categoria</h1>
        
              <a href="<%=request.getContextPath()%>/ver_perfiles.do?c=literatura"><div id="evento">LITERATURA</div></a>
               <a href="<%=request.getContextPath()%>/ver_perfiles.do?c=plasticas"><div id="evento">PLÁSTICAS</div></a>
              <a href="<%=request.getContextPath()%>/ver_perfiles.do?c=musica"><div id="evento">MÚSICA</div></a>
                <a href="<%=request.getContextPath()%>/ver_perfiles.do?c=danza"><div id="evento">DANZA</div></a>
               <a href="<%=request.getContextPath()%>/ver_perfiles.do?c=teatro"><div id="evento">TEATRO</div></a>
               <a href="<%=request.getContextPath()%>/ver_perfiles.do?c=arteurbano"><div id="evento">ARTE URBANO </div></a>
           
         </div>
            </section>
                </div>
        <%@include file="includes/footer.jsp"%>
    
       
    </body>
</html>
