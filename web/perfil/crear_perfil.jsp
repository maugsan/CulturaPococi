<%-- 
    Document   : crear_perfil
    Created on : 18/04/2013, 10:11:45 PM
    Author     : Mac
--%>

<%@page import="java.util.LinkedList"%>
<%@page import="com.culturaPococi.dominio.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="/includes/head.jsp" %>
        <title>Crear Perfil</title>
      
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

    <section  id="seccion-principal">

        <div id="contendor-interno"> 

            <form method="get" action="./crear_perfil.do">   

                
            <h1><bean:message key="perfil.crear.perfil"/></h1>

                
                <h2><bean:message key="perfil.nombre"/></h2>
                <input type="text" name="nombre">
                
                
                <%--Hay que ver como verificar que el perfil no exista ya--%>
                 <a href="../modificar_evento.do?nombrePerfil=${nombre}">
                   <input type="submit" value="Comprobar disponibilidad">
                 </a>
                                
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
               <input type="text" name="biografia"><br>
                              
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

                <input type="submit" value="Crear">  

            </form>
                 

        </div> 

    </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>