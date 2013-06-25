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
                   
                    <section  id="seccion-principal">

                 <h1>Próximos Eventos</h1>
                <div id="contendor-interno"> 
       
                   
                    
                        <logic:iterate  name="listaEventos" id="eventoTemporal" >
                        <%-- Inicio Elemento  --%>
                        <div id="evento">

                            <h1>${eventoTemporal.nombre}  <h3>${eventoTemporal.fecha}</h3></h1>
                           
                           

                        </div>
                        <%-- Fin Elemento  --%>
                        </logic:iterate>
                       
                 
                        
                </div> 
            </section>
         
                   </div>
            </section>
         </div>
                </div>
        <%@include file="includes/footer.jsp"%>
    
       
    </body>
</html>
