<%-- 
    Document   : modificar_evento
    Created on : 18/04/2013, 10:09:36 PM
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
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.7.2/jquery-ui.min.js"></script>
        <script type="text/javascript" src="./assets/js/calendario.js"></script>
        <script type="text/javascript" src="./assets/js/jquery.validate.js"></script>
        <script type="text/javascript" src="./assets/js/validar.js"></script>

        <title>Modificar Evento</title>
    </head>
    <%@include file="/includes/header.jsp" %>

    <section  id="seccion-principal">

        <div id="contendor-interno"> 

            <html:form action="/actualizar_evento" >
                
                <input type="file" name="file"/>
                
                <img src=${evento.imagen}/>
               
                <h1><bean:message key="form.evento.modificar"/></h1>

                <select name='hora'> 
                <option value='${evento.hora}' > ${evento.hora} </option>
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

            <select name='minutos'>
                <option value='${evento.minutos}'>${evento.minutos} </option>
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
                <option value='${evento.tiempo}'>${evento.tiempo} </option>
                <option value='am'> am </option>
                <option value='pm'> pm </option>

            </select>
                
                <h2><bean:message key="articulo.fecha"/></h2>
                <input type="text" name="fecha" id="datepicker" readonly="readonly" size="12" value="${evento.fecha}" />

                <h2><bean:message key="form.nombre"/></h2>
                <html:text  name="EventoForm" property="nombre" size="16" value="${evento.nombre}"/><br>
                <html:errors property="enombre"/> 
                
                <h2><bean:message key="form.categoria"/></h2>
                <html:select property="idCategoria">
                    <logic:iterate name="listaCategorias" id="numero" >
                        <html:option value="${numero.idCategoria}"> <!-- esto es para que cuando elija el nombre me envie el numero !-->
                            <bean:write name="numero" property="nombreCategoria"/>
                        </html:option>
                    </logic:iterate>
                </html:select>
                
                <h2><bean:message key="form.lugar"/></h2>
                <html:text  name="EventoForm" property="lugar" size="16" value="${evento.lugar}"/><br>
                <html:errors property="elugar"/> 
                
                <h2><bean:message key="form.informacion"/></h2>
                <html:textarea name="EventoForm" property="informacion" cols="44" rows="5" value="${evento.informacion}"/><br>
                <html:errors property="einformacion"/> 
                
                <html:hidden  name="EventoForm" property="idEvento" value="${evento.idEvento}"/>
                <html:hidden  name="EventoForm" property="correo" value="${evento.correo}"/>
                <html:hidden  name="EventoForm" property="idCategoria" value="${evento.idCategoria}"/>
                
                <html:submit value="Actualizar" />

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
