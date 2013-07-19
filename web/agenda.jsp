<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <%@include file="includes/head.jsp"%>
        <title>Agenda Cultural</title>
    </head>
    <body>
        <div id="contendor">

            <%@include file="includes/header.jsp"%>ç
            <div id="contendor-interno"> 
                <h1>Seleccione una categoria</h1>
                <section  id="seccion-principal">


                    <div id="contendor-interno"> 



                        <h1>Próximos Eventos</h1>
                        <div id="contendor-interno"> 



                            <logic:iterate  name="listaEventos" id="eventoTemporal" >
                                <%-- Inicio Elemento  --%>
                                
                                
                                
                                
                                
                                <div id="evento">

                                    
                                    <div id="fecha-evento">

                                        ${eventoTemporal.fecha}
                                 </div>
                                 
                                  <div id="nombre-evento">

                                        <h2>${eventoTemporal.nombre}  </h2>
                                 </div>

                                   



                                </div>
                                <%-- Fin Elemento  --%>
                            </logic:iterate>



                        </div> 

                    </div>
              
               
            </div>
              <%@include file="includes/footer.jsp"%>
                 </section>

        </div>


    </body>
</html>
