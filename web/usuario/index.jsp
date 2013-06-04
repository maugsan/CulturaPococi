<%-- 
    Document   : index
    Created on : 23/04/2013, 01:18:40 PM
    Author     : Mac
--%>

<html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
        <%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

        <title><bean:message key="welcome.title"/></title>
        <link rel="stylesheet" href="./assets/css/estilos.css" type="text/css" >
        <link rel="stylesheet" href="./assets/css/normalize.css" type="text/css" >
        <link rel="stylesheet" href="./assets/css/jquery.modal.css" type="text/css" media="screen" />
        
        <link rel="stylesheet" href="./assets/css/jquery-theme.css" />
        <script src="./assets/js/jq.js"></script>
        <script src="./assets/js/funciones.js"></script>
        <script src="./assets/js/jquery-ui.js"></script>
     

</head>
<body>
    <%@include file="/includes/header_administrativo.jsp" %>

    <div id="contendor">




        <div id="dialog-confirm" title="Desea eliminar?">
            <p><span class="ui-icon ui-icon-alert" style="float: left; margin: 0 7px 20px 0;">

                </span>Este item se borrara permanentemente, esta seguro?</p>
        </div>


        <section  id="seccion-principal">


            <div id="contendor-interno"> 


              

                <%-- 
               aqui es donde va el codigo
                --%>

                <section id="lista-elementos">
                    
                      <h1>Usuarios</h1>

                    <logic:iterate  name="listaUsuarios" id="usuarioTemporal" >

                        <%-- Inicio Elemento  --%>
                        <div id="elemento">


                            <a href=""> <div id="link-detalle-elemento"><div id="elemento-imagen"><img src="./assets/img/perfil-icon.png" width="30"/></div>
                                    <p value="${usuarioTemporal.nombre}" > 
                                        ${usuarioTemporal.nombre}
                                    </p>


                                </div></a>
                            <input type="button" value="Borrar" id="test" onClick="eliminarUsuario('${usuarioTemporal.correo}');" />


                        </div>
                        <%-- FIN Elemento  --%> 



                    </logic:iterate>

                    <a href="./crear_usuario.do"><button id="boton-unir">Crear Usuario</button></a>

                </section>





            </div> 

        </section>

        <%@include file="/includes/footer.jsp" %>

    </div>

</body>
</html>