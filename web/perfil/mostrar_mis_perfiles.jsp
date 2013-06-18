<%-- 
    Document   : mostrar_mis_perfiles
    Created on : 13-jun-2013, 18:44:28
    Author     : Personal
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>



<html:html lang="true">
    <head>
       
        <title><bean:message key="welcome.title"/></title>
       
        <html:base/>
    </head>
    <body>

        <%@include file="/includes/header_administrativo.jsp" %>
        <div id="contendor">
            
            <div id="dialog-confirm" title="Desea eliminar?">
            <p><span class="ui-icon ui-icon-alert" style="float: left; margin: 0 7px 20px 0;">

                </span>Este item se borrara permanentemente, esta seguro?</p>
        </div>

            
            <section  id="seccion-principal">


                <div id="contendor-interno"> 

                   
              

                    <section id="lista-elementos">
                         <h1>Perfiles</h1>

                        <logic:iterate  name="listaPerfil" id="perfilTemporal" >

                            <%-- Inicio Elemento  --%>
                            <div id="elemento">

                                <%-- href="../mostrar_perfil_seleccionado.do?idPerfil= ${perfilTemporal.idPerfil}" --%>
                                
                                
                                <a href="../mostrar_perfil_seleccionado.do?nomPerfil=${perfilTemporal.nombrePerfil}"> 
                                    <div id="link-detalle-elemento">
                                        <div id="elemento-imagen">
                                            <img src="../assets/img/perfil-icon.png" width="30"/>
                                        </div>
                                        
                                        <h1> ${perfilTemporal.nombrePerfil}</h1> 
                                        <BR>
                                        <h2> ${perfilTemporal.nombreCategoria}</h2>

                                        <%--  ${perfilTemporal.biografia}
                                         ${perfilTemporal.fechaDeCreacion}
                                         ${perfilTemporal.imagenDePortada}
                                         ${perfilTemporal.correo}
                                         ${perfilTemporal.nombreDistrito}--%>
                                    </div></a>
                                <input type="button" value="Borrar" id="test" onClick="eliminarPerfil('${perfilTemporal.nombreCategoria}');" />

                            </div>
                            <%-- FIN Elemento   ${perfilTemporal.nombrePerfil} --%> 

                        </logic:iterate>
                         
                    </section>

                </div> 
                    
            </section>

           
            <%@include file="/includes/footer.jsp" %>
        </div>
    </body>
</html:html>
