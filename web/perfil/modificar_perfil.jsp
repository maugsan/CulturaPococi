<%-- 
    Document   : modificar_perfil
    Created on : 18/04/2013, 10:12:14 PM
    Author     : Mac
--%>

<%@page import="java.util.LinkedList"%>
<%@page import="com.culturaPococi.dominio.Categoria"%>
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
    
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.7.2/jquery-ui.min.js"></script>
        <script type="text/javascript" src="./assets/js/calendario.js"></script>

        <script type="text/javascript" src="../assets/js/jquery.validate.js"></script>
        <script type="text/javascript" src="../assets/js/validar.js"></script>
        <%-- 
         para q se vea bonito el calendario
        --%>

        <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css">
        <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
        <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>

        <%-- 
        para q se vea bonito el calendario
        --%>

        <title>Crear Perfil</title>
      
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

    <section  id="seccion-principal">

        <div id="contendor-interno"> 

            <form method="get" action="./crear_perfil.do">   

                
            <h1><bean:message key="perfil.crear.perfil"/></h1>

                
                <h2><bean:message key="perfil.nombre"/></h2>
                <input type="text" name="nombre" value="${perfil.nombrePerfil}">
                <input type="submit" value="Comprobar disponibilidad">
                <br>
                
                <h2><bean:message key="form.nombre.categoria"/></h2>
                <%-- <select name="idCategoria">
                    <%for(Categoria categoriaTemp: listaCategorias){%>
                   
                      <option value=<%categoriaTemp.getIdCategoria();%>> <%=categoriaTemp.getIdCategoria()%> </option>
                    <%}%>
                </select>--%>
                
                <select name="idCategoria">
                    <logic:iterate name="listaCategorias" id="numero" >
                        <option value="${numero.idCategoria}"> <!-- esto es para que cuando elija el nombre me envie el numero !-->
                            ${numero.nombreCategoria}
                        </option>
                    </logic:iterate>
                </select>
                 
       
                <h2><bean:message key="perfil.biografia"/></h2>
                <input type="text" name="biografia" value="${perfil.biografia}"><br>
                              
                <h2><bean:message key="perfil.imagen.portada"/></h2>
                
                <h2><bean:message key="perfil.distrito"/></h2>
                
                <select name="distrito">
                     <option value="Cariari">Cariari</option>
                     <option value="Colorado">Colorado</option>
                     <option value="Guápiles">Guápiles</option>
                     <option value="Jimenez">Jimenez</option>
                     <option value="La Rita">La Rita</option>
                     <option value="Roxana">Roxana</option>
                </select><br>

                <input type="submit" value="Actualizar">  

            </form>
                 

        </div> 

    </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>
