<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8" />

          <%@include file="/includes/head.jsp" %> 
        <title><bean:message key="welcome.title"/></title>

        
    </head>
    <body>

        <%@include file="/includes/header.jsp" %>
        <div id="contendor">



            <section  id="seccion-principal">

               
                <div id="contendor-interno"> 

                    <section id ="lista-elementos">
                          <a href="<%=request.getContextPath()%>/crear_publicacion.do"><button id="boton-unir">Publicar</button></a>
                        <h1>${tipoPublicacion}</h1>


                        <logic:iterate  name="listaPublicaciones" id="publicacionTemporal" >
                            <%-- Inicio Elemento  --%>
                            <div id="elemento">
                                <div id="elemento-imagen"><img src="<%=request.getContextPath()%>/assets/img/evento-icon.png" width="30"/></div>
                                <p id="elemento-nombre">${publicacionTemporal.getNombrePerfil()}</p><br>
                                <p id="elemento-nombre">${publicacionTemporal.getFechaPublicacion()}</p>

                                <a href="<%=request.getContextPath()%>/eliminar_publicacion_pendiente.do?idPublicacion=${publicacionTemporal.idPublicacion}&tipoPublicacion=${tipoPublicacion}">
                                    <div id="elemento-icon"><img src="<%=request.getContextPath()%>/assets/img/delete-icon.png" width="30"/></div>
                                </a>
                                <a href="../mostrar_detalle_publicacion.do?idPublicacion=${publicacionTemporal.idPublicacion}&tipoPublicacion=${tipoPublicacion}">
                                    <div id="elemento-icon"><img src="<%=request.getContextPath()%>/assets/img/boletin-icon.png" width="30"/></div>
                                </a>
                            </div>


                            <%-- FIN Elemento  --%>
                        </logic:iterate>

                    </section>



                </div> 

            </section>


            <section id="seccion-inferior">

                <div id="contendor-interno"> </div>

            </section>
            <%@include file="/includes/footer.jsp" %>

        </div>

    </body>
</html>

