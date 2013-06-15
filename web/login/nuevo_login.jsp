<%-- 
    Document   : nuevo_login
    Created on : 18/04/2013, 10:24:01 PM
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
        <title>Ingresar al sistema</title>

         <link rel="stylesheet" href="./assets/css/estilos.css" type="text/css" />
        <link rel="stylesheet" href="./assets/css/normalize.css" type="text/css" />
        <link rel="stylesheet" href="../assets/css/estilos.css" type="text/css" />
        <link rel="stylesheet" href="../assets/css/normalize.css" type="text/css" />
          <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed' rel='stylesheet' type='text/css'>
    </head>
</head>
<body>

     <!-Linea para menu de usuario -->
            <%String email = (String) request.getSession().getAttribute("c");
                if ( email == null ) {%>
                <%@include file="../includes/header.jsp"%>
            
            
            
            
                <section  id="seccion-principal">

        
        <div id="contendor-interno"> 

            <div id="login-principal">
            <html:form action="/nuevologin">
                <h1>Ingresar</h1>
                <h2>Correo</h2>

                <html:text  name="NuevoLoginForm" property="correo" size="16"/><br>
                <h2>Contraseña</h2>
                <html:password  name="NuevoLoginForm" property="contrasenia" size="16"/><br>
                <html:submit value="Entrar" />
               

            </html:form>
            <html:errors/>

            </div>
            <aside id="aside-login">
               <a href=""><button id="boton-unir">Únete</button></a>
               
              <a><h2>Olvidaste la contraseña</h2></a>
            </aside>
        </div> 
              </section>

            

            <%} else {%>
            <%@include file="../includes/header_administrativo.jsp"%> 
            <jsp:forward page="http://localhost:8084/CulturaPococi/nuevologin.do"></jsp:forward>
            
            
            
            <%  }%>
             <!--fin -->




    <%@include file="/includes/footer.jsp" %>

</body>
</html>
