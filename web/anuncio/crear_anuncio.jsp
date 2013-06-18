<%-- 
    Document   : crear_anuncio
    Created on : 18/04/2013, 09:56:53 PM
    Author     : Mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      
        <%@include file="../includes/head.jsp"%> 
        <title>Crear Evento</title>
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

    <section  id="seccion-principal">

        <div id="contendor-interno"> 

             <form method="post" action="./crear_anuncio.do"  id="validar-form">
                 
               <h1><bean:message key="anuncios.form"/></h1>
                
                <h2><bean:message key="anuncios.form.titulo"/></h2>
                <input type="text" id="titulo" name="titulo" size="16" value=""/>
                                
                <h2><bean:message key="anuncios.form.prioridad"/></h2>
                <select name="prioridad">
                    <logic:iterate name="listaPrioridades" id="numero" >
                        <option value="${numero}"> <!-- esto es para que cuando elija el nombre me envie el numero !-->
                            <bean:write name="numero"/><br>
                        </option>
                    </logic:iterate>
                </select>
                
                <br>
                <input type="submit" value="Crear"/><br>

            </form>
            <html:errors/>

        </div> 

    </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>
