<%-- 
    Document   : crear_perfil
    Created on : 18/04/2013, 10:11:45 PM
    Author     : Mac
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="/includes/head.jsp" %>
        <title>Crear Perfil</title>
      
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

    <section  id="seccion-principal">

        <div id="contendor-interno"> 
            <html:form action="/guardar_perfil" method="post" enctype="multipart/form-data">
   
            <h1><bean:message key="perfil.crear.perfil"/></h1>

                <h2><bean:message key="perfil.nombre"/></h2>
                 <html:text property="nombrePerfil" size="50" />

                <h2><bean:message key="form.nombre.categoria"/></h2>
 
                <html:select property="idCategoria">
                    <logic:iterate name="listaCategorias" id="numero" >
                        <option value="${numero.idCategoria}"> <!-- esto es para que cuando elija el nombre me envie el numero !-->
                            ${numero.nombreCategoria}
                        </option>
                    </logic:iterate>
                </html:select>

                <h2><bean:message key="perfil.biografia"/></h2>
                <html:textarea  rows="4" cols="40" property="biografia"></html:textarea>
                              
                <h2><bean:message key="perfil.imagen.portada"/></h2>
                <html:file property="file" size="50" /><br>
                <h2><bean:message key="perfil.distrito"/></h2>
                
                 <html:select property="nombreDistrito">
                    <logic:iterate name="listaDistritos" id="distrito" >
                        <option value="${distrito.nombre}">
                            ${distrito.nombre}
                        </option>
                    </logic:iterate>
                </html:select>
                
            
                
                <h2>Email</h2>
                <html:text property="correoPerfil" size="50" /><br>
                
                <h2>Facebook</h2>
                <html:text property="facebook" size="50" /><br>
                
                 <h2>Twiter</h2>
                <html:text property="twiter" size="50" /><br>
                
                 <h2>Youtube</h2>
               <html:text property="youtube" size="50" /><br>

                <html:submit value="Crear" />

             </html:form>
                 

        </div> 

    </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>