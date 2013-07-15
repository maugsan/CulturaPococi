<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

    <head>
        <%@include file="includes/head.jsp"%> 
        <title>Inicio</title>

    </head>

    <body>

        <div id="contendor">

            <%@include file="includes/header.jsp"%>

            <section  id="seccion-principal-inicio">


                <div id="contendor-interno"> 

                    <div id="wrapper">
                        <div class="callbacks_container">
                            <ul class="rslides" id="slider4">
                                <li>
                                    <img src="<%=request.getContextPath()%>/assets/img/1.jpg" alt="">
                                    <p class="caption">This is a caption</p>
                                </li>
                                <li>
                                    <img src="<%=request.getContextPath()%>/assets/img/2.jpg" alt="">
                                    <p class="caption">This is another caption</p>
                                </li>
                                <li>
                                    <img src="<%=request.getContextPath()%>/assets/img/3.jpg" alt="">
                                    <p class="caption">The third caption</p>
                                </li>
                            </ul>
                        </div>
                    </div> </div> 

            </section>





            <%@include file="includes/espacios.jsp" %> 

            <%@include file="includes/footer.jsp" %>

        </div>

    </body>
</html>
