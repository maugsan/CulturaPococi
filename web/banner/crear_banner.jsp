<%-- 
    Document   : crear_banner
    Created on : 14-jul-2013, 10:02:41
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <%@include file="../includes/head.jsp"%>
        <title>Crear Banner</title>
    </head>
    <body>
         <div id="contendor">
            <%@include file="../includes/header.jsp"%>
            <section  id="seccion-principal">
               
                <div id="contendor-interno"> 
            
             <html:form action="/crear_banner" method="post" enctype="multipart/form-data">
                  <h1>Crear Banner</h1>
<br />

	<html:file property="file" size="50" />
<br />
<html:text property="descripcion" size="50" />
<br />
<html:submit value="Actualizar" />
 
</html:form>
                    
                </div>
                
            </section>
            <%@include file="../includes/footer.jsp"%>
        </div>
        
        
        
    </body>
</html>
