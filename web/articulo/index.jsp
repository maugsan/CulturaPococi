<%-- 
    Document   : index
    Created on : 23/04/2013, 01:13:58 PM
    Author     : Mac
--%>

<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html:html lang="true">
    <head>
        <%@include file="/includes/head.jsp" %>
        <title><bean:message key="welcome.title"/></title>
       
    </head>
    <body>

        <%@include file="/includes/header_administrativo.jsp" %>
        <div id="contendor">

            
            <section  id="seccion-principal">

                
                <div id="contendor-interno"> 
                
                   
                    <h1><bean:message key="articulo.titulo"/></h1>
                        
                    <section id="lista-elementos">
                        <logic:iterate  name="listaArticulos" id="articuloTemporal" >
                        <%-- Inicio Elemento  --%>
                        <div id="elemento">

                           <div id="elemento-imagen"><img src="../assets/img/evento-icon.png" width="30"/></div>
                            <p id="elemento-nombre">${articuloTemporal.titulo}</p>
                            <a href="../eliminar_articulo.do?idArticulo=${articuloTemporal.idArticulo}&fecha=${articuloTemporal.fecha}">
                                <div id="elemento-icon"><img src="../assets/img/delete-icon.png" width="30"/></div>
                            </a> 
                            <a href="../ver_articulo.do?idArticulo=${articuloTemporal.idArticulo}">
                                <div id="elemento-icon"><img src="../assets/img/editar-icon.png" width="30"/></div>
                            </a>
                            
                        </div>
                        <%-- FIN Elemento  --%>
                        </logic:iterate>
                        <a href="<%=request.getContextPath()%>/listar_categorias_articulos.do?fecha=${fecha}"><button id="boton-unir"><bean:message key="boton.crear.articulo"/></button></a>
                    
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
