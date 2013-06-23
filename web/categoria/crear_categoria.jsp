<%-- 
    Document   : crear_evento
    Created on : 18/04/2013, 10:08:58 PM
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
        <title>JSP Page</title>

        <link rel="stylesheet" href="../assets/css/estilos.css" type="text/css" />
        <link rel="stylesheet" href="../assets/css/normalize.css" type="text/css" />
        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed' rel='stylesheet' type='text/css'>
        
         <script type="text/javascript" src="../assets/js/jquery-1.0.9.min.js"></script>
        <script type="text/javascript" src="../assets/js/jquery.validate.js"></script>
        <script type="text/javascript" src="../assets/js/validar.js"></script>
    
        <title>Crear Categoria</title>
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

    <section  id="seccion-principal">

        <div id="contendor-interno"> 
        <form method="post" action="../crear_categorias.do" id="validar-form">
                
                <h1><bean:message key="crear.categoria"/></h1>
                
                <h2><bean:message key="form.nombre.categoria"/></h2>
                <input type="text" id="nombreCategoria" name="nombreCategoria"  size="16" value=""/><br>
                           
                
                <input type="submit" value="Crear"/><br>
 
                   
            </form>
                 
    
        </div> 

    </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>
