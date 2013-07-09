<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html >
    

<html >

    <head>
        <%@include file="includes/head.jsp"%> 
        <title>Inicio</title>
  
    </head>

    <body>
        <div id="contendor">

            <%@include file="includes/header.jsp"%>
          
            <section  id="seccion-principal-inicio">
  
                   
                <div id="contendor-interno"> 
               

                    <div id="contentSlide">

                        <div id="slideshow">
                            <ul id="controles">  	
                                <li id="cAtras"> <a href = "#" ></a> </li>
                                <li id="cAdelante"> <a href = "#" ></a> </li>
                            </ul>
                            <ul id="slides">  

                                <li> <a href = "#">  <img src="./assets/img/inicio.png" > </a> </li>
                                <li> <a href = "#">   <img src="./assets/img/banner1.jpg" > </a> </li>
                                <li> <a href = "#">   <img src="./assets/img/banner2.jpg" > </a> </li>

                            </ul>
                        </div>

                    </div>
                </div> 

            </section>

            



            <%@include file="includes/espacios.jsp" %> 

            <%@include file="includes/footer.jsp" %>

        </div>

    </body>
</html>
