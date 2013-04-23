<%-- 
    Document   : dashboard
    Created on : 22/04/2013, 07:30:17 PM
    Author     : Mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
         <link rel="stylesheet" href="./assets/css/estilos.css" type="text/css" />
        <link rel="stylesheet" href="./assets/css/normalize.css" type="text/css" />
        <link href='http://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>
    </head>
 <body>

        <div id="contendor">

           
            <section  id="seccion-principal">

                
                <div id="contendor-interno"> 
                   
                  
                    <h1>Pagina Administrativa</h1>
                    
                </div> 

            </section>

            <%@include file="../includes/anuncios-eventos.jsp" %>
            <section id="seccion-inferior">

                <div id="contendor-interno"> </div>

            </section>
            <%@include file="../includes/footer.jsp" %>


        </div>

    </body>
</html>
