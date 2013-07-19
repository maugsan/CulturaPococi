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

                <html:form action="/guardar_evento"  method="post" enctype="multipart/form-data" >

                    <h1>Crear Evento</h1>
                    
                    <h2><bean:message key="form.nombre"/></h2>
                    <html:text  property="nombre" size="16" /><br>
                    <html:errors property="enombre"/> 
                    
                    <h2>Flyer</h2>
                    <html:file  property="file" size="16" /><br>
                    <html:errors property="file"/> 
                    
                    <h2>Hora:</h2>
                    <select name='hora'> 
                       
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
                        
                        <option value='am'> am </option>
                        <option value='pm'> pm </option>

                    </select>

                    <h2><bean:message key="articulo.fecha"/></h2>
                    <input type="text" name="fecha" id="datepicker" readonly="readonly" size="12"/>

                    

                    <h2><bean:message key="form.categoria"/></h2>
                    <html:select property="idCategoria">
                        <logic:iterate name="listaCategorias" id="numero" >
                            <html:option value="${numero.idCategoria}">
                                <bean:write name="numero" property="nombreCategoria"/>
                            </html:option>
                        </logic:iterate>
                    </html:select>

                    <h2><bean:message key="form.lugar"/></h2>
                    <html:text   property="lugar" size="16" /><br>
                    <html:errors property="elugar"/> 

                    <h2><bean:message key="form.informacion"/></h2>
                    <html:textarea  property="informacion" cols="44" rows="5" /><br>
                    <html:errors property="einformacion"/> 

                
                  

                    <html:submit value="Crear" />

                </html:form>
                
            </div> 

        </section>


        <%@include file="/includes/footer.jsp" %>
    </body>
</html>