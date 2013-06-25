
<%@page contentType="text/html"%>

<html>
    <head>
        <%@include file="/includes/head.jsp" %>
        <title><bean:message key="welcome.title"/></title>

        <html:base/>
    </head>
    <body>

        <%@include file="/includes/header.jsp" %>
        <div id="contendor">


            <section  id="seccion-principal">


                <div id="contendor-interno"> 

                    <h1><bean:message key="publicacion.publicaciones.pendientes"/></h1>




                    <form method="get" action="../listar_publicaciones_pendientes.do">

                        <select name="tipoPublicacion">
                            <option value="musica">Música</option>
                            <option value="video">Video</option>
                            <option value="texto">Texto</option>
                            <option value="imagen">Imagen</option>
                        </select>

                        <html:submit value="Buscar" /><br>

                    </form>
                </div> 

            </section>


            <section id="seccion-inferior">

                <div id="contendor-interno"> </div>

            </section>
            <%@include file="/includes/footer.jsp" %>

        </div>

    </body>
</html>

