<%-- 
    Document   : crear_evento
    Created on : 18/04/2013, 10:08:58 PM
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

        <link rel="stylesheet" href="./assets/css/estilos.css" type="text/css" />
        <link rel="stylesheet" href="./assets/css/normalize.css" type="text/css" />
        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed' rel='stylesheet' type='text/css'>
        
        
        <script type="text/javascript" src="./assets/js/jquery-1.0.9.min.js"></script>
        <script type="text/javascript" src="./assets/js/jquery.validate.js"></script>
        <script type="text/javascript" src="./assets/js/validar.js"></script>

    
        <title><bean:message key="articulo.ver.articulo"/></title>
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

    <section  id="seccion-principal">

        <div id="contendor-interno"> 
            
              <script type="text/javascript">
                    $(document).ready(function() {

                        $('input.fecha').attr("value", function(indiceArray) {
                            var f = new Date();
                            return f.getDate() + "/" + (f.getMonth() + 1) + "/" + f.getFullYear();
                        });

                    });
                </script>


           <form method="post" action="./crear_articulo.do" id="validar-form">
        
                    <h1><bean:message key="articulo.crear.articulo"/></h1>

                    <h2><bean:message key="articulo.titulo"/></h2>
                    <input type="text" id="titulo" name="titulo" size="16" value=""/>

                    <h2><bean:message key="articulo.fecha"/></h2><br>
                    <input type="text" class="fecha" readonly="readonly" name="fecha" size="16" value=""/>


                    <h2><bean:message key="articulo.autor"/></h2>
                    <input type="text" id="autor" name="autor" size="16" value=""/>
                                      

                    <h2><bean:message key="form.categoria"/></h2>
                    
                    <select property="categoria" id="categoria">
                        <logic:iterate name="listaCategorias" id="numero" >
                            <option value="idCategoria"> <!-- esto es para que cuando elija el nombre me envie el numero !-->
                                <bean:write name="numero" property="nombreCategoria"/>
                            </option>
                        </logic:iterate>
                    </select>

                    <h2><bean:message key="articulo.contenido"/></h2>
                    
                    <textarea ROWS="5" id="texto-grande"  id="contenido" name="contenido" size="16" value=""></textarea>

                    <input type="submit" value="Crear"/><br>


                   
            </form>
                 
                <a href="./listar_articulos.do">
                    <button id="boton-volver">
                        <bean:message key="boton.volver"/>
                    </button>
                </a>
        </div> 

    </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>

