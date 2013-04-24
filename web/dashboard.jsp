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
        <link href='http://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>
    </head>
    <body>

        <header>

            <div id="contendor-interno">
                <div id="header-logo">

                </div>

                <nav>
                    <ul>

                        <li><a href="./dashboard.jsp" >INICIO</a></li>
                        <li><a href="./usuario/">USUARIOS</a></li>
                        <li><a href="./perfil/">PERFILES</a> </li>
                        <li><a href="./evento">EVENTOS</a> </li>
                        <li><a href="./categoria">CATEGORIAS</a></li>
                        <li><a href="./boletin">BOLETINES</a></li>
                        <li><a href="./anuncio">ANUNCIOS</a></li>
                        <li><a href="./programaradio">PROGRAMAS</a></li>
                        <li><a href="./publicacion">PUBLICACIONES</a></li>

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


                                    <a href="./usuario/"><section class="modulo">
                                            <h2>Usuario</h2>
                                        </section></a>
                                    <a href="./perfil/"><section class="modulo">
                                            <h2>Perfil</h2>
                                        </section></a>
                                    <a href="./evento/"><section class="modulo">
                                            <h2>Evento</h2>
                                        </section></a>
                                    <a href="./categoria/"><section class="modulo">
                                            <h2>Categoria</h2>
                                        </section></a>
                                    <a href="./boletin/"><section class="modulo">
                                            <h2>Boletín</h2>
                                        </section></a>
                                    <a href="./anuncio/"> <section class="modulo">
                                            <h2>Anuncio</h2>
                                        </section></a>
                                    <a href="./programaradio/"> <section class="modulo">
                                            <h2>Programas de Radio</h2>
                                        </section></a>
                                    <a href="./publicacion/"> <section class="modulo">
                                            <h2>Publicación</h2>
                                        </section></a>

                                </aside>

                            </div> 

                        </section>

                        <%@include file="/includes/espacios.jsp" %>
                        <section id="seccion-inferior">

                            <div id="contendor-interno"> </div>

                        </section>
                        <%@include file="/includes/footer.jsp" %>


                    </div>

                    </body>
                    </html>
