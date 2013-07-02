<%-- 
    Document   : index
    Created on : 23/04/2013, 01:18:40 PM
    Author     : Mac
--%>

<html lang="true">
    <head>
    
<%@include file="../includes/head.jsp" %>
        <title><bean:message key="welcome.title"/></title>
        
     

</head>
<body>
    <%@include file="../includes/header.jsp" %>

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
                    <%-- <a href="./crear_usuario.do"><button id="boton-unir">Crear Usuario</button></a>--%>


                    <logic:iterate  name="listaUsuarios" id="usuarioTemporal" >

                        <%-- Inicio Elemento  --%>
                        <div id="elemento">


                            <a href=""> <div id="link-detalle-elemento"><div id="elemento-imagen"><img src="./assets/img/perfil-icon.png" width="50"/></div>
                                    <h1> 
                                        ${usuarioTemporal.correo}
                                    </h1>


                                </div></a>
                                    
                            <input type="button" src="../assets/img/delete-icon.png" id="test" onClick="eliminarUsuario('${usuarioTemporal.correo}');" />


                        </div>
                        <%-- FIN Elemento  --%> 

                    </logic:iterate>

                </section>

            </div> 

        </section>

        <%@include file="/includes/footer.jsp" %>

    </div>

</body>
</html>