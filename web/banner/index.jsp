<%-- 
    Document   : index
    Created on : 14-jul-2013, 10:02:11
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../includes/head.jsp"%>

        <title>Banners</title>
    </head>
    <body>
        <div id="contendor">
             <%@include file="../includes/header.jsp"%>
            <section  id="seccion-principal">
               
                <div id="contendor-interno"> 
                    
                  
                    
                   <section id="lista-elementos">
                        <a href="<%=request.getContextPath()%>/banner/crear_banner.jsp"><button id="boton-unir">Crear Banners</button></a>
                   <logic:iterate name="listaBanners" id="b" >

                                    <div id="elemento-banner">
                                        <img id="bnn"src="<%=request.getContextPath()%>/assets/img/banners/${b.nombreBanner}" alt="">
                                         <a href="<%=request.getContextPath()%>/eliminar_banner.do?id=${b.idBanner}">
                                        <div id="elemento-icon"><img src="<%=request.getContextPath()%>/assets/img/delete-icon.png" width="30"/></div>
                                         </a>
                                    </div>

                                </logic:iterate>
                                        </section>
                </div>
                
            </section>
            <%@include file="../includes/footer.jsp"%>
        </div>
    </body>
</html>
