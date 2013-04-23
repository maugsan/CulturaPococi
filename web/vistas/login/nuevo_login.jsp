<%-- 
    Document   : nuevo_login
    Created on : 18/04/2013, 10:24:01 PM
    Author     : Mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
        <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
        <%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
    </head>
    <body>

        <html:errors/>
        <html:form action="/nuevologin">


            <html:text  name="NuevoLoginForm" property="correo" size="16"/>
            <html:password  name="NuevoLoginForm" property="contrasenia" size="16"/>
            <html:submit value="Entrar" />

        </html:form>

    </body>
</html>
