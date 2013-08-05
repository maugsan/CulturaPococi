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
<body>

    <!-Linea para menu de usuario -->
    <%String email = (String) request.getSession().getAttribute("c");
        if (email == null) {%>
    <%@include file="../includes/header.jsp"%>

    <section  id="seccion-principal">
        <div id="mensaje">${mensaje}</div>
        


        <div id="contendor-interno"> 

           

                <form method="post" action="<%=request.getContextPath()%>/nuevologin.do" id="validar-form">
                    <h1>Ingresar</h1>
                    <h2>Correo</h2>
                    <input type="text" id="correo" name="correo" size="16" value=""/>

                    <h2>Contraseña</h2>

                    <input type="password" id="contrasenia" name="contrasenia" size="16" value=""/><br>
                    <input type="submit" value="Entrar"/>


                </form>
                   
                <html:errors/>

            </div>
            <aside id="aside-login">
                
                
            </aside>
       
    </section>



    <%} else {

            String pageToForward = request.getContextPath();
            response.sendRedirect(pageToForward + "/nuevologin.do");

     }%>
    <!--fin -->




    <%@include file="/includes/footer.jsp" %>

</body>
</html>
