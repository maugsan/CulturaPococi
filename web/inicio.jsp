<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8" />

        <%@include file="includes/head.jsp"%> 
        <title>Inicio</title>

    </head>

    <body>
         <script> $(function() {
    $(".rslides").responsiveSlides();
  });
   // Slideshow 4
      $("#slider4").responsiveSlides({
       auto: false,
        pager: false,
        nav: true,
        speed: 500,
        maxwidth: 940, 
        manualControls: "true", 
        namespace: "large-btns"    
        
       
            });
               
         </script>

        <div id="contendor">
           

            <%@include file="includes/header.jsp"%>

            <section  id="seccion-principal-inicio">
          

                <div id="contendor-interno"> 
                  
                  
                        <div class="callbacks_container">
                            <ul class="rslides" id="slider4">

                                <logic:iterate name="listaBanners" id="b" >

                                    <li>
                                        <img src="<%=request.getContextPath()%>/assets/img/banners/${b.nombreBanner}" alt="">
                                        <p class="caption">${b.descripcionBanner}</p>
                                    </li>

                                </logic:iterate>
                       
                            </ul>
                        </div>
                    </div> 
                

            </section>

            <%@include file="includes/espacios.jsp" %> 

            <%@include file="includes/footer.jsp" %>

        </div>
           

    </body>
</html>
