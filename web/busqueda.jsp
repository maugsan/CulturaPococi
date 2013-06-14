<%-- 
    Document   : busqueda
    Created on : 21/05/2013, 10:21:12 PM
    Author     : Owner
--%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="./assets/css/estilos.css" type="text/css" />
        <link rel="stylesheet" href="./assets/css/normalize.css" type="text/css" />
        <title>Busqueda</title>
    </head>
    <body>
        <%@include file="includes/header.jsp" %>
            <section  id="seccion-principal">

                
                <div id="contendor-interno"> 
                   
        <section id="lista-elementos">
                        <logic:iterate  name="lista" id="eventoTemporal" >
                        <%-- Inicio Elemento  --%>
                        <div id="elemento">

                            <h1>${eventoTemporal.palabra}</h1>
                            <h3>${eventoTemporal.descripcion}</h3>
      
                        </div>
                        <%-- FIN Elemento  --%>
                        </logic:iterate>
                      
                    </section>
                </div>
            </section>
             <%@include file="includes/footer.jsp" %>
    </body>
</html>
