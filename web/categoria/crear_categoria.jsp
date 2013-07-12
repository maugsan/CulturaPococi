<%-- 
    Document   : crear_evento
    Created on : 18/04/2013, 10:08:58 PM
    Author     : Mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="/includes/head.jsp"%>
        <title>Crear Categoria</title>
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

    <section  id="seccion-principal">

        <div id="contendor-interno"> 
             <a href="<%=request.getContextPath()%>/listar_categorias.do"><button id="boton-unir">Lista de Categorías</button></a>
        <form method="post" action="./crear_categorias.do" id="validar-form">
                
                <h1><bean:message key="crear.categoria"/></h1>
                
                <h2><bean:message key="form.nombre.categoria"/></h2>
                <input type="text" id="nombreCategoria" name="nombreCategoria"  size="16" value=""/><br>
                <select name="super"> 
                    
                    <logic:iterate  name="listaSuper" id="categoriaTemporal" >
                        <option value="${categoriaTemporal.idCategoria}"> 
                    ${categoriaTemporal.nombreCategoria}
                    </option> 
                     </logic:iterate>
                </select>       <br>
                
                <input type="submit" value="Crear"/><br>
 
                   
            </form>
                 
    
        </div> 

    </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>
