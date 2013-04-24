<%-- 
    Document   : index
    Created on : 23/04/2013, 01:18:40 PM
    Author     : Mac
--%>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <link rel="stylesheet" href="../assets/css/estilos.css" type="text/css" />
        <link rel="stylesheet" href="../assets/css/normalize.css" type="text/css" />
        <link href='http://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>
        <html:base/>
    </head>
    <body>
        <%@include file="/includes/header_administrativo.jsp" %>

        <div id="contendor">

            
            <section  id="seccion-principal">

                
                <div id="contendor-interno"> 
                   
                    <h1>Usuarios</h1>
                </div> 

            </section>

            <%@include file="/includes/espacios.jsp" %>
            <section id="seccion-inferior">

                <div id="contendor-interno"> </div>

            </section>
            <%@include file="/includes/footer.jsp" %>


        </div>

    </body>
</html:html>