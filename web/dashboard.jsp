<%-- 
    Document   : dashboard
    Created on : 22/04/2013, 07:30:17 PM
    Author     : Mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
        <link rel="stylesheet" href="./assets/css/estilos.css" type="text/css" />
        <link rel="stylesheet" href="./assets/css/normalize.css" type="text/css" />
        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed' rel='stylesheet' type='text/css'>


        <%

            HttpSession sesion = request.getSession();
            String correo = (String) request.getAttribute("correo");

            sesion.setAttribute("c", correo);

            if (correo == null) {

                 String pageToForward = request.getContextPath();
  
    response.sendRedirect(pageToForward+"/invalidar"); 
               
            }


        %>             


    </head>
    <body>
        <header>

            <div id="contendor-interno">
                <a href="<%= request.getContextPath()%>/nuevologin.do"><div id="header-logo"> </div></a>


                <div id="header-opciones">
                    <section id="controles">
                        <a href="./invalidar.jsp"><button id="boton-salir">Salir</button></a>

                        <button id="boton-usuario"><%=sesion.getAttribute("c")%></button>
                    </section>

                </div>

                <%@include file="../includes/menu.jsp" %>

            </div>

        </header>

        <div id="contendor">



            <section  id="seccion-principal">


                <div id="contendor-interno"> 

                    <h1>Sitio administrativo</h1>




                    <a href="./mostrar_usuario.do"><section class="modulo">
                            <img id="icono" src="assets/img/user-icon.png" width="60">
                            <h2>Usuario</h2>
                        </section></a>
                    <a href="./mostrarperfiles.do"><section class="modulo">
                            <img id="icono" src="assets/img/perfil-icon.png" width="60">
                            <h2>Perfil</h2>
                        </section></a>

                    <a href="./listar_evento.do"><section class="modulo">
                            <img id="icono" src="assets/img/evento-icon.png" width="60">
                            <h2>Evento</h2>
                        </section></a>
                    <a href="./listar_categorias.do"><section class="modulo">
                            <img id="icono" src="assets/img/category-icon.png" width="60">
                            <h2>Categoria</h2>
                        </section></a>
                    <a href="./listar_boletines.do"><section class="modulo">
                            <img id="icono" src="assets/img/boletin-icon.png" width="60">
                            <h2>Boletín</h2>
                        </section></a>
                    <a href="./listar_anuncios.do"> <section class="modulo">
                            <img id="icono" src="assets/img/anuncio-icon.png" width="60">
                            <h2>Anuncio</h2>
                        </section></a>
                    <a href="./listar_programa_radio.do"> <section class="modulo">
                            <img id="icono" src="assets/img/radio-icon.png" width="60">
                            <h2>Programas de Radio</h2>
                        </section></a>
                    <a href="./publicacion/index.jsp"> <section class="modulo">
                            <%-- <a href="./mostrar_publicacion.do"> <section class="modulo">--%>
                            <img id="icono" src="assets/img/publicacion-icon.png" width="60">
                            <h2>Publicación</h2>
                        </section></a>




                </div> 

            </section>


            <%@include file="/includes/footer.jsp" %>


        </div>

    </body>
</html>
