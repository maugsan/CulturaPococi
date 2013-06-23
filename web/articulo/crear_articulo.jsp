<%-- 
    Document   : crear_evento
    Created on : 18/04/2013, 10:08:58 PM
    Author     : Mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
 
     <%@include file="/includes/head.jsp" %>
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


                    
                <%--<form method="post" action="./crear_articulo.do" id="validar-form">--%>
                   
                <h1><bean:message key="articulo.crear.articulo"/></h1>
                <form enctype="multipart/form-data"  action="./cargarImagen/cargarImagen.jsp" method="post" id="validar-form">

                    <input type="hidden" name="accion" value="/crear_articulo.do"/>

                    <input type="file" name="file"/>


                <h2><bean:message key="articulo.titulo"/></h2>
                <input type="text" id="titulo" name="titulo" size="16" value=""/>
                
                
                <h2><bean:message key="articulo.autor"/></h2>
                <input type="text" id="autor" name="autor" size="16" value=""/>
                
                <h2><bean:message key="form.categoria"/></h2>
                <select name="categoria" >
                    <logic:iterate name="listaCategorias" id="numero" >
                        <option value="${numero.idCategoria}"> <!-- esto es para que cuando elija el nombre me envie el numero !-->
                            <bean:write name="numero" property="nombreCategoria"/>
                        </option>
                    </logic:iterate>
                </select>
                
                <h2><bean:message key="articulo.contenido"/></h2>
                 <textarea ROWS="5" id="texto-grande" id="contenido"  name="contenido" size="16" value=""></textarea>
              
                
                <html:hidden  name="ArticuloForm" property="fecha" value="${fecha}"/>
                
              
                 <input type="submit" value="Crear"/>
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

