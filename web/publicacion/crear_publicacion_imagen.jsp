<%-- 
    Document   : crear_publicacion
    Created on : 13-jun-2013, 22:42:06
    Author     : Personal
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
    
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.7.2/jquery-ui.min.js"></script>
        <script type="text/javascript" src="./assets/js/calendario.js"></script>

        <script type="text/javascript" src="./assets/js/jquery.validate.js"></script>
        <script type="text/javascript" src="./assets/js/validar.js"></script>
        <%-- 
         para q se vea bonito el calendario
        --%>

        <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css">
        <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
        <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>

        <%-- 
        para q se vea bonito el calendario
        --%>

        <title>Publicar</title>
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

    <section  id="seccion-principal">

        <div id="contendor-interno"> 

            <html:form action="/crear_evento" >
                
                  

                
                <h1><bean:message key="form.hora"/></h1>
                
                <select name='hora' > 
                <option value='${hora}' > ${hora} </option>
                <option value='1' > 1 </option>
                <option value='2'> 2 </option>
                <option value='3'> 3 </option>
                <option value='4'> 4 </option>
                <option value='5'> 5 </option>
                <option value='6'> 6 </option>
                <option value='7'> 7 </option>
                <option value='8'> 8 </option>
                <option value='9'> 9 </option>
                <option value='10'> 10 </option>
                <option value='11'> 11 </option>
                <option value='12'> 12 </option>
            </select>

            <select name='minutos' >
                <option value='${minutos}'>${minutos} </option>
                <option value='00'> 00 </option>
                <option value='05'> 05 </option>
                <option value='10'> 10 </option>
                <option value='15'> 15 </option>
                <option value='20'> 20 </option>
                <option value='25'> 25 </option>
                <option value='30'> 30 </option>
                <option value='35'> 35 </option>
                <option value='40'> 40 </option>
                <option value='45'> 45 </option>
                <option value='50'> 50 </option>
                <option value='55'> 55 </option>

            </select>

                <select name='tiempo'>
                <option value='${tiempo}'>${tiempo} </option>
                <option value='am'> am </option>
                <option value='pm'> pm </option>

            </select>
                

                
                <h2><bean:message key="form.nombre"/></h2>
                <html:text  name="EventoForm" property="nombre" size="16" value=""/><br>
                
                <html:errors property="enombre"/> 
                
                <h2><bean:message key="form.fecha"/></h2>
                <input type="text" name="fecha" id="datepicker" readonly="readonly" size="12" />
                 <html:errors property="efecha"/> 
                 
                
                <h2><bean:message key="form.categoria"/></h2>
                <html:select property="idCategoria">
                    <logic:iterate name="listaCategorias" id="numero" >
                        <html:option value="${numero.idCategoria}"> <!-- esto es para que cuando elija el nombre me envie el numero !-->
                            <bean:write name="numero" property="nombreCategoria"/>
                        </html:option>
                    </logic:iterate>
                </html:select>
                
                <h2><bean:message key="form.lugar"/></h2>
                <html:text  name="EventoForm" property="lugar" size="16" value=""/><br>
                <html:errors property="elugar"/> 
                
                <h2><bean:message key="form.informacion"/></h2>
                <html:textarea name="EventoForm" property="informacion" cols="44" rows="5" value="" /><br>
                <html:errors property="einformacion"/> 
                
                <html:hidden  name="EventoForm" property="correo" value=""/>
                
                <html:submit value="Crear" />

            </html:form>
                 <a href="./listar_evento.do">
                    <button id="boton-volver">
                        <bean:message key="boton.volver"/>
                    </button>
                </a>

        </div> 

    </section>


    <%@include file="/includes/footer.jsp" %>
    </body>
</html>