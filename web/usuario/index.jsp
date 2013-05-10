<%-- 
    Document   : index
    Created on : 23/04/2013, 01:18:40 PM
    Author     : Mac
--%>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
        <%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

        <title><bean:message key="welcome.title"/></title>
        <link rel="stylesheet" href="./assets/css/estilos.css" type="text/css" >
        <link rel="stylesheet" href="./assets/css/normalize.css" type="text/css" >
        <link rel="stylesheet" href=".../assets/css/jquery.modal.css" type="text/css" media="screen" />

        <script src="../assets/js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
        <script src="../assets/js/jquery.modal.min.js" type="text/javascript" charset="utf-8"></script>

       
    <html:base/>
</head>
<body>
    <%@include file="/includes/header_administrativo.jsp" %>

    <div id="contendor">


        <section  id="seccion-principal">


            <div id="contendor-interno"> 


                <h1>Usuarios</h1>

                <%-- 
               aqui es donde va el codigo
                --%>

                <section id="lista-elementos">

                    <logic:iterate  name="listaUsuarios" id="usuarioTemporal" >

                        <%-- Inicio Elemento  --%>
                        <div id="elemento">


                            <a href=""> <div id="link-detalle-elemento"><div id="elemento-imagen"><img src="./assets/img/perfil-icon.png" width="30"/></div>
                                     <p value="${usuarioTemporal.nombre}" id="elemento-nombre"> 
                                        ${usuarioTemporal.nombre}
                                    </p>
                                  
                                   
                                </div></a>
                            <a  href="./eliminar_usuario_normal.do?c=${usuarioTemporal.correo}"><div id="elemento-icon"><img src="./assets/img/delete-icon.png" width="30"/></div></a>   

                        </div>
                        <%-- FIN Elemento  --%> 



                    </logic:iterate>

                    <a href="./crear_usuario.do"><button id="boton-unir">Crear Usuario</button></a>

                </section>





            </div> 

        </section>


        <section id="seccion-inferior">

            <div id="contendor-interno"> </div>

        </section>
        <%@include file="/includes/footer.jsp" %>


    </div>

</body>
</html:html>