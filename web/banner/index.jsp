<%-- 
    Document   : index
    Created on : 14-jul-2013, 10:02:11
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../includes/head.jsp"%>

        <title>Banners</title>
    </head>
    <body>
        <div id="contendor">
             <%@include file="../includes/header.jsp"%>
            <section  id="seccion-principal">
               
                <div id="contendor-interno"> 
                    
                   <a href="<%=request.getContextPath()%>/banner/crear_banner.jsp"><button id="boton-unir">Crear Banners</button></a>
                    
                </div>
                
            </section>
            <%@include file="../includes/footer.jsp"%>
        </div>
    </body>
</html>
