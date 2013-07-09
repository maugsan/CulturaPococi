


<htmllang="true">
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

                    <script type="text/javascript">
                                             var d = new Date();
                                             document.write('<br>Hora: ' + d.getHours(), ':' + d.getMinutes());
                    </script>


                    <section id="lista-elementos">
                        <a href="crear_programaradio.jsp"><button id="boton-unir">Nuevo Programa de Radio</button></a>
                        <logic:iterate name="listaProgramas" id="numero" >
                            <div id="elemento">
                            <div id="elemento-imagen"><img src="../assets/img/radio-icon.png" width="30"/></div>
                            <h1>  ${numero.nombre}</h1>
                            <h2>  ${numero.horario}</h2>
                            <h3>  ${numero.descripcion}</h3>




                            <a href="../eliminar_programa_radio.do?nombre=${numero.nombre}"><div id="elemento-icon"><img src="../assets/img/delete-icon.png" width="30"/></div></a>   




                            <%-- FIN Elemento   ${perfilTemporal.nombrePerfil} --%> 


                    </div>
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
