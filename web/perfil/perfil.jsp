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
        <title>Perfil</title>
      
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

    <section  id="seccion-principal">

        <div id="contendor-interno"> 

            
                
            <h1><bean:message key="perfil"/></h1>

                
                <h2>${perfil.nombrePerfil}</h2>
                
                <h2><bean:message key="perfil.foto.perfil"/></h2>
                
                <h2><bean:message key="perfil.fecha.creacion"/></h2>
                <h2>${perfil.fechaDeCreacion}</h2>
                
                <h2><bean:message key="form.categoria"/></h2>
                <h2>${perfil.nombreCategoria}</h2>
                
                <h2><bean:message key="form.correo"/></h2>
                <h2>${perfil.correo}</h2>
                
                <h2><bean:message key="perfil.distrito"/></h2>
                <h2>${perfil.nombreDistrito}</h2>
                
                <h2><bean:message key="perfil.biografia"/></h2>
                <h2>${perfil.biografia}</h2>
                
                
                <br>
                
                 <a href="./listar_mis_publicaciones.do?tipo=texto&nomPerfil=${perfil.nombrePerfil}">
                    <button id="boton-volver">
                        <bean:message key="publicacion.texto"/>
                    </button>
                </a>
                    
                <a href="./listar_mis_publicaciones.do?tipo=imagen&nomPerfil=${perfil.nombrePerfil}">
                    <button id="boton-volver">
                        <bean:message key="publicacion.imagen"/>
                    </button>
                </a>
                    
                 <a href="./listar_mis_publicaciones.do?tipo=video&nomPerfil=${perfil.nombrePerfil}">
                    <button id="boton-volver">
                        <bean:message key="publicacion.video"/>
                    </button>
                </a>
                    
                <a href="./listar_mis_publicaciones.do?tipo=musica&nomPerfil=${perfil.nombrePerfil}">
                    <button id="boton-volver">
                        <bean:message key="publicacion.audio"/>
                    </button>
                </a>
                


           

        </div> 

    </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>