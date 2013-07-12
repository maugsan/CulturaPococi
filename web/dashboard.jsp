<%-- 
    Document   : dashboard
    Created on : 22/04/2013, 07:30:17 PM
    Author     : Mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="includes/head.jsp"%> 
        <title>El FrenteCR.org | Dashboard</title>

        <%

            HttpSession sesion = request.getSession();
            String correo = (String) request.getAttribute("correo");
            String tipo = (String) request.getAttribute("tipo");

            sesion.setAttribute("c", correo);
            sesion.setAttribute("tipo", tipo);

            if (correo == null) {

                String pageToForward = request.getContextPath();

                response.sendRedirect(pageToForward + "/invalidar");

            }


        %>             

        
        <script type="text/javascript">
             function sugerencias() {
        
                     NuevaVentana = window.open('','','width=1350,height=700');
                     NuevaVentana.location.assign("http://localhost/RecuperacionContrasenia/web/app_dev.php/elfrente/"); 
             }
                                    </script>

    </head>
    <body>
        <%@include file="includes/header.jsp"%>

        <div id="contendor">


            <section  id="seccion-principal">

                <div id="contendor-interno"> 

                    <h1>Sitio administrativo</h1>
                      <h5>
                               <script type="text/javascript">
                                             var d = new Date();
                                             document.write('<br>Hora: ' + d.getHours(), ':' + d.getMinutes());
                    </script>
                            </h5>
                  

                    <a <% if (sesion.getAttribute("tipo").equals("0")) { %>style="display: none;"<%}%> href="./mostrar_usuario.do"><section class="modulo">
                            <img id="icono" src="assets/img/user-icon.png" width="60">
                            <h2>Usuarios</h2>
                        </section></a>
                    <a <% if (sesion.getAttribute("tipo").equals("1")) { %>href="./mostrarperfiles.do"<%}else{%> href="./mis_perfiles.do"<%}%>><section class="modulo">
                            <img id="icono" src="assets/img/perfil-icon.png" width="60">
                            <h2>Perfiles</h2>
                        </section></a>

                    <a href="./listar_evento.do"><section class="modulo">
                            <img id="icono" src="assets/img/evento-icon.png" width="60">
                            <h2>Eventos</h2>
                        </section></a>
                    <a <% if (sesion.getAttribute("tipo").equals("0")) { %>style="display: none;"<%}%> href="./listar_categorias.do"><section class="modulo">
                            <img id="icono" src="assets/img/category-icon.png" width="60">
                            <h2>Categorias</h2>
                        </section></a>
                    <a <% if (sesion.getAttribute("tipo").equals("0")) { %>style="display: none;"<%}%> href="./listar_boletines.do"><section class="modulo">
                            <img id="icono" src="assets/img/boletin-icon.png" width="60">
                            <h2>Boletínes</h2>
                        </section></a>
                    <a <% if (sesion.getAttribute("tipo").equals("0")) { %>style="display: none;"<%}%> href="./listar_anuncios.do"> <section class="modulo">
                            <img id="icono" src="assets/img/anuncio-icon.png" width="60">
                            <h2>Anuncios</h2>
                        </section></a>
                    <a <% if (sesion.getAttribute("tipo").equals("0")) {%>style="display: none;"<%}%> href="./listar_programas_radio.do"> <section class="modulo">
                            <img id="icono" src="assets/img/radio-icon.png" width="60">
                            <h2>Programas de Radio</h2>
                        </section></a>

                            <a  href="./publicacion/index.jsp"> <section class="modulo">

                                    <img id="icono" src="assets/img/publicacion-icon.png" width="60">
                                    <h2>Publicaciones</h2>
                                </section></a>


                            <a  onclick="sugerencias()" > <section class="modulo">


                                    <img  id="icono" src="assets/img/idea-icon.png" width="60">
                                    <h2>Ideas</h2>
                                </section></a>
                          


                </div> 

            </section>

            <%@include file="/includes/footer.jsp" %>

        </div>

    </body>
</html>
