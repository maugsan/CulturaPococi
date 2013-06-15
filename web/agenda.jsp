<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./assets/css/estilos.css" type="text/css" />
        <link rel="stylesheet" href="./assets/css/normalize.css" type="text/css" />
        <title>JSP Page</title>
    </head>
    <body>
          <div id="contendor">
            <%@include file="includes/header.jsp" %>
            <section  id="seccion-principal">


                <div id="contendor-interno"> 
                     <aside id="social"></aside>
                    
                    <article id="evento"></article>
                    <article id="evento"></article>
                    <article id="evento"></article>
                    <article id="evento"></article>
                    
                   
                   </div>
            </section>
             <%@include file="includes/footer.jsp" %>
          </div>
    </body>
</html>
