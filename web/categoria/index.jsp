<%-- 
    Document   : index
    Created on : 23/04/2013, 01:17:01 PM
    Author     : Mac
--%>


<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>

        <%@include file="../includes/head.jsp" %>
        <title><bean:message key="welcome.title"/></title>

    </head>
    <body>

        <%@include file="../includes/header.jsp" %>
        <div id="contendor">

            <section  id="seccion-principal">


                <div id="contendor-interno"> 

                    <h1><bean:message key="form.categoria"/></h1>

                    <section id="lista-elementos">
                        <a href="<%=request.getContextPath()%>/crear_categoria.do"><button id="boton-unir"><bean:message key="boton.crear.categoria"/></button></a>
                            <logic:iterate  name="listaCategorias" id="categoriaTemporal" >

                            <%-- Inicio Elemento  --%>
                            <div id="elemento">

                                <div id="elemento-imagen"><img src="<%=request.getContextPath()%>/assets/img/category-icon.png" width="60"/></div>
                                <h1>${categoriaTemporal.nombreCategoria}</h1>

                                <a href="<%=request.getContextPath()%>/eliminar_categoria.do?id=${categoriaTemporal.idCategoria}">
                                    <div id="elemento-icon"><img src="<%=request.getContextPath()%>/assets/img/delete-icon.png" width="30"/>
                                    </div></a>   

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
</html:html>
