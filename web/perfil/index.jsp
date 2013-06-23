<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html:html lang="true">
    <head>
       
        <%@include file="/includes/head.jsp" %>
        <title><bean:message key="welcome.title"/></title>
      
    </head>
    <body>

        <%@include file="/includes/header.jsp" %>
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
                                
                                <a href="./mostrar_perfil_seleccionado.do?nomPerfil=${perfilTemporal.nombrePerfil}"> <div id="link-detalle-elemento"><div id="elemento-imagen"><img src="<%=request.getContextPath()%>${perfilTemporal.imagenDePortada}" width="50"/></div>
                                        
                                        <h1> ${perfilTemporal.nombrePerfil}</h1> 
                                     
                                        <h2> ${perfilTemporal.nombreCategoria}</h2>

                                    
                                    </div></a>
                                <input type="button" value="Borrar" id="test" onClick="eliminarPerfil('${perfilTemporal.nombreCategoria}');" />
                                <a href="./eliminar_perfil.do?nombrePerfil=${perfilTemporal.nombrePerfil}">
                                    <button id="boton-volver">
                                        Eliminar
                                    </button>
                                </a>
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