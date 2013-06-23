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
        <title>JSP Page</title>
    </head>
    <body>
        <div id="contendor">

            <%@include file="includes/header.jsp"%>
        <h1>Seleccione una categoria</h1>
         <ul>
                <li><a href="./ver_perfiles.do?c=literatura">LITERATURA</a></li>
                <li><a href="#">PLÁSTICAS</a></li>
                <li><a href="./ver_perfiles.do?c=musica">MÚSICA</a></li>
                <li><a href="#">DANZA</a></li>
                <li><a href="#">TEATRO</a></li>
                <li><a href="#">ARTE URBANO</a></li>
            </ul>
        <%@include file="includes/footer.jsp"%>
        </div>
    </body>
</html>
