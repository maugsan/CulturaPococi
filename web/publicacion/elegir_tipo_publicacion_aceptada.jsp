<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>


<html:html lang="true">
      <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <link rel="stylesheet" href="../assets/css/estilos.css" type="text/css" />
        <link rel="stylesheet" href="../assets/css/normalize.css" type="text/css" />
        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed' rel='stylesheet' type='text/css'>
        <html:base/>
    </head>
    <body>

        <%@include file="/includes/header_administrativo.jsp" %>
        <div id="contendor">

            
            <section  id="seccion-principal">

                
                <div id="contendor-interno"> 

                    <h1><bean:message key="publicacion.publicaciones.actuales"/></h1>



                    
                        <form method="get" action="../listar_publicacion_aceptada.do">

                            <select name="tipoPublicacion">
                                <option value="musica">Música</option>
                                <option value="video">Video</option>
                                <option value="texto">Texto</option>
                                <option value="imagen">Imagen</option>
                            </select>

                            <html:submit value="Buscar" /><br>



                        </form>
                    



                </div> 

            </section>

           

        </div>

    </body>
</html:html>
    
