<%-- 
    Document   : directorio
    Created on : 18-jun-2013, 17:28:52
    Author     : MAU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="includes/head.jsp"%> 
        <title>Directorio</title>
    </head>
    <body>
        <div id="contendor">

            <%@include file="includes/header.jsp"%>
          
            <section  id="seccion-principal-inicio">
  
                   
                <div id="contendor-interno"> 
               

               <a href="./arte.jsp" ><div id="s-izquierdo">
                       <img src="./assets/img/teatro-icon.png"/>
                        <h1>Arte</h1>

                    </div></a>

                    <a href="#" ><div  id="s-centro">
                        
                            <img src="./assets/img/category-icon.png" />
                        <h1>Cultura</h1>
                           
                  
                    </div></a>

                    <div id="s-derecho">

                        <img src="./assets/img/boletin-icon.png"/>
                        <h1>Boletin</h1>


                    </div> 


                </div> 

            </section>



            <section id="seccion-inferior">

                <div id="contendor-interno">

                   
                </div>


            </section>


            <%@include file="includes/espacios.jsp" %> 

            <%@include file="includes/footer.jsp" %>

        </div>
    </body>
</html>
