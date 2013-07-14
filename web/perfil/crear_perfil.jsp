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

            <form method="post" action="./guardar_perfil.do">   

                
            <h1><bean:message key="perfil.crear.perfil"/></h1>

              
                <h2><bean:message key="perfil.nombre"/></h2>
                <input type="text" name="nombre">

                
                <h2><bean:message key="form.nombre.categoria"/></h2>
              
                
                <select name="idCategoria">
                    <logic:iterate name="listaCategorias" id="numero" >
                        <option value="${numero.idCategoria}"> <!-- esto es para que cuando elija el nombre me envie el numero !-->
                            ${numero.nombreCategoria}
                        </option>
                    </logic:iterate>
                </select>
                 
       
                <h2><bean:message key="perfil.biografia"/></h2>
                <textarea  rows="4" cols="50" name="biografia"></textarea>
                              
                <h2><bean:message key="perfil.imagen.portada"/></h2>
                <input type="file" name="imagen"><br>
                <h2><bean:message key="perfil.distrito"/></h2>
                
                 <select name="nombreDistrito">
                    <logic:iterate name="listaDistritos" id="distrito" >
                        <option value="${distrito.nombre}">
                            ${distrito.nombre}
                        </option>
                    </logic:iterate>
                </select>
                
            
                
                <h2>Email</h2>
                <input type="text" name="email"><br>
                
                <h2>Facebook</h2>
                <input type="text" name="facebook"><br>
                
                 <h2>Twiter</h2>
                <input type="text" name="twiter"><br>
                
                 <h2>Youtube</h2>
                <input type="text" name="youtube"><br>

                <input type="submit" value="Crear">  

            </form>
                 

        </div> 

    </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>