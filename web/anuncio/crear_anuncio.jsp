

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      
        <%@include file="../includes/head.jsp"%> 
        <title>Crear Anuncio</title>
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

    <section  id="seccion-principal">

        <div id="contendor-interno"> 

             <form enctype="multipart/form-data"  action="./cargarImagen/cargarImagen.jsp" method="post" id="validar-form">
                 
                  <input type="hidden" name="accion" value="/crear_anuncio.do"/>
                    
                    <input type="file" name="file"/>
                 
               <h1><bean:message key="anuncios.form"/></h1>
                
                <h2><bean:message key="anuncios.form.titulo"/></h2>
                <input type="text" id="titulo" name="titulo" size="16" value=""/>
                                
                <h2><bean:message key="anuncios.form.prioridad"/></h2>
                <select name="prioridad">
                    <logic:iterate name="listaPrioridades" id="numero" >
                        <option value="${numero}"> <!-- esto es para que cuando elija el nombre me envie el numero !-->
                            <bean:write name="numero"/>
                        </option>
                    </logic:iterate>
                </select>
                
                <br>
                <input type="submit" value="Crear"/><br>

            </form>
            <html:errors/>

        </div> 

    </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>
