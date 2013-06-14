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