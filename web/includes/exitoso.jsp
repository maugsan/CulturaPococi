<%-- 
    Document   : exitoso
    Created on : 23/04/2013, 12:07:06 PM
    Author     : Mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login Exitos!o</h1>
        <%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
        
        <logic:redirect  forward="dashboard"/>
    </body>
</html>
