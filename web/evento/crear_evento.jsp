<%-- 
    Document   : modificar_evento
    Created on : 18/04/2013, 10:09:36 PM
    Author     : Mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>


        <%@include file="/includes/head.jsp"%> 

        <title>Crear Evento</title>
    </head>
    <body>
        <%@include file="/includes/header.jsp" %>

        <section  id="seccion-principal">

            <div id="contendor-interno"> 


                <form method="post" action="./crear_evento.do" id="validar-form">

                    <h2><bean:message key="form.fecha"/></h2>
                    <input type="text" name="fecha" id="datepicker" id="fecha"   readonly="readonly" size="12" />



                    <h1><bean:message key="form.hora"/></h1>

                    <select name='hora' id="select-hora"> 
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

                    <select name='minutos' id="select-hora">
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

                    <select name='tiempo' id="select-hora">
                        <option value='${tiempo}'>${tiempo} </option>
                        <option value='am'> am </option>
                        <option value='pm'> pm </option>

                    </select>



                    <h2><bean:message key="form.nombre"/></h2>
                    <input type="text" id="nombre" name="nombre" size="16" value=""/>



                    <h2><bean:message key="form.categoria"/></h2>
                    <select property="idCategoria">
                        <logic:iterate name="listaCategorias" id="numero" >
                            <option value="${numero.idCategoria}"> <!-- esto es para que cuando elija el nombre me envie el numero !-->
                                <bean:write name="numero" property="nombreCategoria"/>
                            </option>
                        </logic:iterate>
                    </select>

                    <h2><bean:message key="form.lugar"/></h2>
                    <input type="text" id="lugar" name="lugar" size="16" value=""/>

                    <h2><bean:message key="form.informacion"/></h2>
                    <textarea ROWS="5" id="texto-grande" id="informacion"  name="informacion" size="16" value=""></textarea>

                    <input type="submit" value="Crear"/>

                </form>
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