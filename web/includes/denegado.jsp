<%-- 
    Document   : denegado
    Created on : 23/04/2013, 12:07:37 PM
    Author     : Mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
        <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
        <%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        

        <link rel="stylesheet" href="./assets/css/estilos.css" type="text/css" />
        <link rel="stylesheet" href="./assets/css/normalize.css" type="text/css" />
        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed' rel='stylesheet' type='text/css'>
    
        <title><bean:message key="denegado"/></title>
    </head>
    <body>
        <h1><bean:message key="evento.denegado"/></h1>
        <%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
        
        <logic:redirect  forward="dashboard"/>
    </body>
</html>
