<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="true">
    <head>
        <%@include file="includes/head.jsp"%> 
        <title>El FrenteCR.org</title>
  
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



            <section id="seccion-inferior">

                <div id="contendor-interno">

                    <a href="./directorio.jsp" ><div id="s-izquierdo">
                        <img src="./assets/img/guitarra-icon.png"/>
                        <h1>Directorio</h1>

                    </div></a>

                    <a href="#" id="radio"><div  id="s-centro">
                        
                        <img src="./assets/img/radio-icon.png" />
                        <h1>Radio</h1>
                           
                  
                    </div></a>

                    <div id="s-derecho">

                        <img src="./assets/img/idea-icon.png"/>
                        <h1>Nosotros</h1>


                    </div> 

                    <p>Proin elit arccitudin mi sit  dapibus lacus
                        auctor risus. Aenean tempor ullamcorper leo. 
                        Vivamus sed magna quis ligula eleifend adipiscing.
                        Duis orci. Aliquam sodales tortor vitae ipsum. 
                        um. Nunc tristique tempus lectus.</p>
                    <br><br>

                </div>


            </section>


            <%@include file="includes/espacios.jsp" %> 

            <%@include file="includes/footer.jsp" %>

        </div>

    </body>
</html>
