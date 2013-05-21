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
    </head>
    <body>

        <header>

            <div id="contendor-interno">
                <div id="header-logo">

                </div>

                <nav>
                    <ul>

                        <li><a href="./dashboard.jsp" >INICIO</a></li>
                      

                    </ul>

                </nav>

                <div id="header-opciones">
                    <section id="controles">
                        <a href="./"><button id="boton-salir">Salir</button></a>




                    </section>



                    </header>

                    <div id="contendor">



                        <section  id="seccion-principal">


                            <div id="contendor-interno"> 

                                <h1>Sitio administrativo</h1>
                                <aside>


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
                                    <a href="./categoria/"><section class="modulo">
                                            <img id="icono" src="assets/img/category-icon.png" width="60">
                                            <h2>Categoria</h2>
                                        </section></a>
                                    <a href="./boletin/"><section class="modulo">
                                            <img id="icono" src="assets/img/boletin-icon.png" width="60">
                                            <h2>Boletín</h2>
                                        </section></a>
                                    <a href="./listar_anuncios.do"> <section class="modulo">
                                            <img id="icono" src="assets/img/anuncio-icon.png" width="60">
                                            <h2>Anuncio</h2>
                                        </section></a>
                                    <a href="./programaradio/"> <section class="modulo">
                                            <img id="icono" src="assets/img/radio-icon.png" width="60">
                                            <h2>Programas de Radio</h2>
                                        </section></a>
<<<<<<< HEAD
                                    <a href="./publicacion/index.jsp"> <section class="modulo">
=======
                                    <a href="./mostrar_publicacion.do"> <section class="modulo">
>>>>>>> branch 'master' of https://github.com/maugsan/CulturaPococi.git
                                            <img id="icono" src="assets/img/publicacion-icon.png" width="60">
                                            <h2>Publicación</h2>
                                        </section></a>

                                </aside>

                            </div> 

                        </section>

                        <%@include file="/includes/espacios.jsp" %>
                        <section id="seccion-inferior">

                            <div id="contendor-interno"> 
                            
                            
                            <%
HttpSession sesion=request.getSession();

%>
                            
           <p><%= sesion %></p>          
                            </div>

                        </section>
                        <%@include file="/includes/footer.jsp" %>


                    </div>

                    </body>
                    </html>
