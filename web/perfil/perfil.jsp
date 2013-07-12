<%-- 
    Document   : perfil
    Created on : 13-jun-2013, 0:01:50
    Author     : Personal
--%>
<%@page import="java.util.LinkedList"%>
<%@page import="com.culturaPococi.dominio.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="/includes/head.jsp" %>
        <title>${perfil.nombrePerfil}</title>

    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

        <section  id="seccion-principal-perfil">

            <div id="contendor-interno"> 

                <section id="perfil-foto">

                </section>
                <section id="perfil-informacion">


                    <h2><bean:message key="perfil.biografia"/></h2>

                    <P>${perfil.biografia}</P>
                </section>


                <section id="perfil-creacion">
                    <h1>${perfil.nombrePerfil}</h1>
                    <h2>${perfil.nombreCategoria}</h2>
                </section>


                <section id="perfil-contacto">

                    <h2><bean:message key="form.correo"/></h2>

                    <h2>${perfil.correo}</h2>
                    <h2>${perfil.nombreDistrito}</h2>
                    <h5><bean:message key="perfil.fecha.creacion"/></h5>
                    <h5>${perfil.fechaDeCreacion}</h5>

                </section>

                <br>

            </div> 

        </section>
        <%@include file="/includes/footer.jsp" %>
    </body>
</html>