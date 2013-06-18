<%-- 
    Document   : nuevo_login
    Created on : 18/04/2013, 10:24:01 PM
    Author     : Mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="/includes/head.jsp" %>
        <title>Ingresar al sistema</title>

       
    </head>
</head>
<body>

    <!-Linea para menu de usuario -->
    <%String email = (String) request.getSession().getAttribute("c");
                if (email == null) {%>
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
                <a href="<%=request.getContextPath()%>/crear_usuario.do"><button id="boton-unir">Únete</button></a>

                <a><h2>Olvidaste la contraseña</h2></a>
            </aside>
        </div> 
    </section>



    <%} else {

            String pageToForward = request.getContextPath();
            response.sendRedirect(pageToForward + "/nuevologin.do");




                }%>
    <!--fin -->




    <%@include file="/includes/footer.jsp" %>

</body>
</html>
