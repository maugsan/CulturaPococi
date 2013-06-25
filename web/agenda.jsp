<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  
     <head>
        <%@include file="includes/head.jsp"%>
        <title>JSP Page</title>
    </head>
    <body>
        <div id="contendor">
           
            <%@include file="includes/header.jsp"%>ç
            <div id="contendor-interno"> 
        <h1>Seleccione una categoria</h1>
         <section  id="seccion-principal">


                <div id="contendor-interno"> 
                    <h1>Próximos Eventos</h1>
                    <section  id="seccion-principal">

                
                <div id="contendor-interno"> 
       
                    <section id="lista-elementos">
                    
                        <logic:iterate  name="listaEventos" id="eventoTemporal" >
                        <%-- Inicio Elemento  --%>
                        <div id="evento">

                            <h1>${eventoTemporal.nombre}</h1>
                            <h3>${eventoTemporal.fecha}</h3>
                           

                        </div>
                        <%-- Fin Elemento  --%>
                        </logic:iterate>
                       
                    </section>
                        
                </div> 
            </section>
         
                   </div>
            </section>
         </div>
                </div>
        <%@include file="includes/footer.jsp"%>
    
       
    </body>
</html>
