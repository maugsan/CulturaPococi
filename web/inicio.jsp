<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <link rel="stylesheet" href="./assets/css/estilos.css" type="text/css" />
        <link rel="stylesheet" href="./assets/css/normalize.css" type="text/css" />
        <html:base/>
    </head>
    <body>

        <div id="contendor">

            <header>
                <div id="contendor-interno">

                    <%@include file="includes/menu.jsp" %>
                    
                </div>
            </header>
            <section> <div id="contendor-interno"> </div> </section>
            <footer> <div id="contendor-interno"> </div> </footer>

        </div>


    </body>
</html:html>
