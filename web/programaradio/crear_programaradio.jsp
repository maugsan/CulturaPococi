<%-- 
    Document   : crear_programaradio
    Created on : 18/04/2013, 10:14:59 PM
    Author     : Mac
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
        <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
        <%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" href="../assets/css/estilos.css" type="text/css" />
        <link rel="stylesheet" href="../assets/css/normalize.css" type="text/css" />
        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed' rel='stylesheet' type='text/css'>
        
          <script type="text/javascript" src="../assets/js/jquery-1.0.9.min.js"></script>
        <script type="text/javascript" src="../assets/js/jquery.validate.js"></script>
        <script type="text/javascript" src="../assets/js/validar.js"></script>

        <title>Crear Programa Radio</title>
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

        <section  id="seccion-principal">

            <div id="contendor-interno"> 

                <form method="post" action="../crear_programa_radio.do" id="validar-form">
                         

                            <h2><bean:message key="form.nombre"/></h2>
                            <input type="text" id="nombre" name="nombre" size="16" value=""/>
                            <br>

                            <h2><bean:message key="form.horario"/></h2>
                            <textarea ROWS="5" id="texto-grande" id="horario"  name="horario" size="16" value=""></textarea>
                            <br>
                            
                            <h2><bean:message key="form.descripcion"/></h2>
                             <textarea ROWS="5" id="texto-grande-2" id="descripcion"  name="descripcion" size="16" value=""></textarea>
                            <br>

                            <input type="submit" value="Crear"/>

                </form>

                    <%-- <a href="http://localhost:8084/CulturaPococi/listar_programa_radio.do"> --%>
                    <a  href="../listar_programa_radio.do">
                    <button id="boton-volver">
                        <bean:message key="boton.volver"/>
                    </button>
                </a>
            </div> 

        </section>


        <%@include file="/includes/footer.jsp" %>
    </body>
</html>
